package il.co.radware.hwqa_equipment_tool.enums.drive;

public enum DriveCapacity {
    TWO_GIGA(2),
    FOUR_GIGA(4),
    EIGHT_GIGA(8),
    SIXTEEN_GIGA(16),
    THIRTY_TWO_GIGA(32),
    ONE_HUNDRED_TWENTY_EIGHT_GIGA(128),
    HALF_TERA(500),
    ONA_TERA(1000);

    private int size;

    DriveCapacity(int size) {
        this.size = size;
    }


}
