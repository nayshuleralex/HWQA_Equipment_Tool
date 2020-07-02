package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.data.LoginDetailsDataObject;
import il.co.radware.hwqa_equipment_tool.data.LoginResponseDataObject;
import il.co.radware.hwqa_equipment_tool.entities.User;
import il.co.radware.hwqa_equipment_tool.exceptions.ApplicationException;
import il.co.radware.hwqa_equipment_tool.logic.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserApi {

    @Autowired
    private UserController userController;

    // method = POST	url = http://localhost:8080/users
    @PostMapping
    public long createUser(@RequestBody User user) {
        return this.userController.createUser(user);
    }

    @PostMapping("/login") // url = http://localhost:8080/users/login
    public LoginResponseDataObject login(@RequestBody LoginDetailsDataObject userLoginDetails) throws ApplicationException {

        String username = userLoginDetails.getUsername();
        String password = userLoginDetails.getPassword();

        LoginResponseDataObject loginResponseDataObject = this.userController.login(username, password);

        return loginResponseDataObject;
    }
    // method = GET		url = http://localhost:8080/users/2?token=1348440385
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") long id)  {
        return this.userController.getUser(id);
    }

    // method = GET		url = http://localhost:8080/users
    @GetMapping
    public List<User> getAllUsers() {
        return this.userController.getAllUsers();
    }

    // method = GET		url = http://localhost:8080/purchases/byUserName?username=user
    @GetMapping("/byUserName")
    public User getUser(@RequestParam("username") String username) {
        return this.userController.getUser(username);
    }

    // method = PUT		url = http://localhost:8080/users
    @PutMapping
    public void updateUser(@RequestBody User user) {
        this.userController.updateUser(user);
    }

    // method = DELETE		url = http://localhost:8080/users
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") long id) {
        this.userController.deleteUser(id);
    }

}
