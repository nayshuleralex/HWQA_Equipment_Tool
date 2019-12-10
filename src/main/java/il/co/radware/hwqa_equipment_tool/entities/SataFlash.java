package il.co.radware.hwqa_equipment_tool.entities;

import il.co.radware.hwqa_equipment_tool.enums.Approval;
import il.co.radware.hwqa_equipment_tool.enums.drive.DriveCapacity;
import il.co.radware.hwqa_equipment_tool.enums.drive.DriveType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "SATA_FLASHES")
public class SataFlash implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "MANUFACTURER", nullable = false)
    private String manufacturer;

    @Column(name = "MODEL", unique = true, nullable = false)
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "CAPACITY", nullable = false)
    private DriveCapacity capacity;

    @Enumerated(EnumType.STRING)
    @Column(name = "DRIVE_TYPE", nullable = false)
    private DriveType type;

    @Column(name = "AMOUNT", nullable = false)
    private int amount;

    @Column(name = "ECR", nullable = false)
    private String ecr;

    @Enumerated(EnumType.STRING)
    @Column(name = "ALTEON_APPROVAL", nullable = false)
    private Approval alteonApproval;

    @Enumerated(EnumType.STRING)
    @Column(name = "DP_APPROVAL", nullable = false)
    private Approval dpApproval;

    @Enumerated(EnumType.STRING)
    @Column(name = "HWQA_APPROVAL", nullable = false)
    private Approval hwqaApproval;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "sataFlash")
    private List<Device> devices;

    public SataFlash() {
    }

    public SataFlash(String manufacturer, String model, DriveCapacity capacity, DriveType type, int amount, String ecr) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.capacity = capacity;
        this.type = type;
        this.amount = amount;
        this.ecr = ecr;
    }

    public SataFlash(String manufacturer, String model, DriveCapacity capacity, DriveType type, int amount,
                     String ecr, Approval alteonApproval, Approval dpApproval, Approval hwqaApproval, List<Device> devices) {
        this(manufacturer, model, capacity, type, amount, ecr);
        this.alteonApproval = alteonApproval;
        this.dpApproval = dpApproval;
        this.hwqaApproval = hwqaApproval;
        this.devices = devices;
    }

    public SataFlash(Long id, String manufacturer, String model, DriveCapacity capacity, DriveType type, int amount,
                     String ecr, Approval alteonApproval, Approval dpApproval, Approval hwqaApproval, List<Device> devices) {
        this(manufacturer, model, capacity, type, amount, ecr, alteonApproval, dpApproval, hwqaApproval, devices);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public DriveCapacity getCapacity() {
        return capacity;
    }

    public void setCapacity(DriveCapacity capacity) {
        this.capacity = capacity;
    }

    public DriveType getType() {
        return type;
    }

    public void setType(DriveType type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getEcr() {
        return ecr;
    }

    public void setEcr(String ecr) {
        this.ecr = ecr;
    }

    public Approval getAlteonApproval() {
        return alteonApproval;
    }

    public void setAlteonApproval(Approval alteonApproval) {
        this.alteonApproval = alteonApproval;
    }

    public Approval getDpApproval() {
        return dpApproval;
    }

    public void setDpApproval(Approval dpApproval) {
        this.dpApproval = dpApproval;
    }

    public Approval getHwqaApproval() {
        return hwqaApproval;
    }

    public void setHwqaApproval(Approval hwqaApproval) {
        this.hwqaApproval = hwqaApproval;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
