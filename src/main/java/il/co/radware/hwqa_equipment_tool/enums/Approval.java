package il.co.radware.hwqa_equipment_tool.enums;

public enum Approval {
    NOT_APPROVED,
    APPROVED,
    IRRELEVANT;

    public static boolean contains(Approval approval) {
        for (Approval a : Approval.values()) {
            if (a.name().equalsIgnoreCase(String.valueOf(approval))) {
                return true;
            }
        }
        return false;
    }
}

