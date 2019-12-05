package il.co.radware.hwqa_equipment_tool.enums.transceiver;

public enum TransceiverType {
    COPPER_SFP(1),
    COPPER_SFP_PLUS(10),
    COPPER_QSFP(40),
    COPPER_QSFP28(100),
    FIBER_SFP(1),
    FIBER_SFP_PLUS(10),
    FIBER_SFP28(25),
    FIBER_QSFP(40),
    FIBER_QSFP28(100);

    private int speed;

    TransceiverType(int speed) {
        this.speed = speed;
    }
}
