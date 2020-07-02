package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.cache.ICacheController;
import il.co.radware.hwqa_equipment_tool.dao.IUserDao;
import il.co.radware.hwqa_equipment_tool.data.LoggedInUserData;
import il.co.radware.hwqa_equipment_tool.data.LoginResponseDataObject;
import il.co.radware.hwqa_equipment_tool.entities.User;
import il.co.radware.hwqa_equipment_tool.enums.ErrorTypes;
import il.co.radware.hwqa_equipment_tool.enums.UserType;
import il.co.radware.hwqa_equipment_tool.exceptions.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Random;

@Controller
public class UserController {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private ICacheController cacheController;

    public LoginResponseDataObject login(String username, String password) throws ApplicationException {
        User user = userDao.login(username, password);
        if (user == null) {
            throw new ApplicationException(ErrorTypes.LOGIN_FAILED, "Failed to login user: " + username);
        }
        Long userId = user.getUserId();
        UserType userType = user.getType();

        LoggedInUserData loggedInUserData = new LoggedInUserData(userType, userId);

        int token = generateToken(username, loggedInUserData);

        loggedInUserData.setToken(token + "");
        // Save login user data in cache
        cacheController.put(String.valueOf(token), loggedInUserData);

        return new LoginResponseDataObject(token + "", loggedInUserData.getType(), userId);
    }
    public Long createUser(User user) {
        return userDao.save(user).getUserId();
    }

    public User getUser(Long userId) {
        return userDao.findById(userId).get();
    }

    public User getUser(String username) {
        return userDao.findUserByUsername(username);
    }

    public List<User> getAllUsers() {
        return (List<User>) userDao.findAll();
    }

    public void updateUser(User user) {
        userDao.save(user);
    }

    public void deleteUser(long userId) {
        userDao.deleteById(userId);
    }

    private int generateToken(String username, LoggedInUserData loggedInUserData) {
        Random rnd = new Random();
        String salt = "#####";
        return (username + rnd.nextInt(9999999) + salt + loggedInUserData.getUserId()).hashCode();
    }
}
