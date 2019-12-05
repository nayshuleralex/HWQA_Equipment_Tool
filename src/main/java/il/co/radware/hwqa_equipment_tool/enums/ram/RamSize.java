package il.co.radware.hwqa_equipment_tool.enums.ram;

public enum RamSize {
    ONE(1),
    TWO(2),
    FOUR(4),
    EIGHT(8),
    SIXTEEN(16),
    THIRTY_TWO(32);

    private  int size;

    RamSize(int size) {
        this.size = size;
    }

    public static boolean contains(int size) {
        for (RamSize s : RamSize.values()) {
            if (s.getSize() == size) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }
}
