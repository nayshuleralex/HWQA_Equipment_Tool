package il.co.radware.hwqa_equipment_tool.enums;

public enum UserType {
    ADMIN,
    OBSERVER,
    EDITOR;

    public static boolean contains(UserType userType) {

        for (UserType u : UserType.values()) {
            if (u.name().equalsIgnoreCase(String.valueOf(userType))) {
                return true;
            }
        }

        return false;
    }

}
