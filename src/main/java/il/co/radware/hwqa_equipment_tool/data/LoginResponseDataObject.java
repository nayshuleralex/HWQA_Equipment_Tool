package il.co.radware.hwqa_equipment_tool.data;

import il.co.radware.hwqa_equipment_tool.enums.UserType;

public class LoginResponseDataObject {
    private Long userId;
    private UserType type;
    private String token;

    public LoginResponseDataObject() {
    }

    public LoginResponseDataObject(String token, UserType type, Long userId) {
        this.type = type;
        this.token = token;
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LoginResponseDataObject{" +
                "userId=" + userId +
                ", token='" + token + '\'' +
                '}';
    }
}
