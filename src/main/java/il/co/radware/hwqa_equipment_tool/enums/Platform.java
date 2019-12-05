package il.co.radware.hwqa_equipment_tool.enums;

public enum Platform {
    ODSVL_DUAL,
    ODSVL_QUAD,
    ODSLS,
    ODSLS2_5028,
    ODSLS2_5424,
    ODSLS2_5820,
    ODSEL_4208,
    ODSEL_5208EL,
    ODSVL2_1230V2,
    ODSVL2_1275V2,
    ODSMR_1650V3,
    ODSMR_1650V4,
    ODSMR_2680V4,
    ODSMRQ,
    ODSHTQ_2620,
    ODSHTQ_2658,
    ODSHTQE_2680,
    ODSHTQE_2690,
    ODSHT2_7220,
    ODSHT2_7612,
    ODSVHT;

    public static boolean contains(Platform platform){
        for (Platform p : Platform.values()) {
            if (p.name().equalsIgnoreCase(String.valueOf(platform))) {
                return true;
            }
        }
        return false;
    }
}
