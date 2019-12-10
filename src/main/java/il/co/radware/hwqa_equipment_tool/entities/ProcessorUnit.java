package il.co.radware.hwqa_equipment_tool.entities;

import il.co.radware.hwqa_equipment_tool.enums.Approval;
import il.co.radware.hwqa_equipment_tool.enums.Platform;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "CPUS")
public class ProcessorUnit implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "MANUFACTURER", nullable = false)
    private String manufacturer;

    @Column(name = "MODEL", unique = true, nullable = false)
    private String model;

    @Column(name = "FREQUENCY", nullable = false)
    private float frequency;

    @Enumerated(EnumType.STRING)
    @Column(name = "PLATFORM", nullable = false)
    private Platform platform;

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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "diskDrive")
    private List<Device> devices;

    public ProcessorUnit() {
    }

    public ProcessorUnit(String manufacturer, String model, int frequency, Platform platform, int amount, String ecr) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.frequency = frequency;
        this.platform = platform;
        this.amount = amount;
        this.ecr = ecr;
        this.alteonApproval = Approval.IRRELEVANT;
        this.dpApproval = Approval.IRRELEVANT;
        this.hwqaApproval = Approval.NOT_APPROVED;
    }

    public ProcessorUnit(String manufacturer, String model, int frequency, Platform platform, int amount, String ecr,
                         Approval alteonApproval, Approval dpApproval, Approval hwqaApproval) {
        this(manufacturer, model, frequency, platform, amount, ecr);
        this.alteonApproval = alteonApproval;
        this.dpApproval = dpApproval;
        this.hwqaApproval = hwqaApproval;
    }

    public ProcessorUnit(Long id, String manufacturer, String model, int frequency, Platform platform, int amount,
                         String ecr, Approval alteonApproval, Approval dpApproval, Approval hwqaApproval) {
        this(manufacturer, model, frequency, platform, amount, ecr, alteonApproval, dpApproval, hwqaApproval);
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

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
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
