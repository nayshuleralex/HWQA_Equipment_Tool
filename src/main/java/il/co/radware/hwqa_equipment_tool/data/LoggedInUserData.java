package il.co.radware.hwqa_equipment_tool.data;

import il.co.radware.hwqa_equipment_tool.enums.UserType;

public class LoggedInUserData {
    private String token;
    private UserType type;
    private Long userId;

    public LoggedInUserData() {
    }

    public LoggedInUserData(String token, UserType type, Long userId) {
        this.token = token;
        this.type = type;
        this.userId = userId;
    }

    public LoggedInUserData(UserType type, Long userId) {
        this.type = type;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}