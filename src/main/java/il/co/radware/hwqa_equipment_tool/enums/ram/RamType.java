package il.co.radware.hwqa_equipment_tool.enums.ram;

public enum RamType {
    DDR,
    DDR2,
    DDR3_UDIMM,
    DDR3_RDIMM,
    DDR4_UDIMM,
    DDR4_RDIMM;

    public static boolean contains(RamType type) {
        for (RamType t : RamType.values()) {
            if (t.name().equalsIgnoreCase(String.valueOf(type))) {
                return true;
            }
        }
        return false;
    }

}
