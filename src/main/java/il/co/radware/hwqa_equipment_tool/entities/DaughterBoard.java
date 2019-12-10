package il.co.radware.hwqa_equipment_tool.entities;

import il.co.radware.hwqa_equipment_tool.enums.Approval;
import il.co.radware.hwqa_equipment_tool.enums.card.DaughterBoardType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "DAUGHTER_BOARDS")
public class DaughterBoard implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "MANUFACTURER", nullable = false)
    private String manufacturer;

    @Column(name = "MODEL", unique = true, nullable = false)
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "DAUGHTER_BOARD_TYPE", nullable = false)
    private DaughterBoardType type;

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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "daughterBoard")
    private List<Device> devices;

    public DaughterBoard() {
    }

    public DaughterBoard(String manufacturer, String model, DaughterBoardType type, int amount, String ecr) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.amount = amount;
        this.ecr = ecr;
    }

    public DaughterBoard(String manufacturer, String model, DaughterBoardType type, int amount, String ecr,
                         Approval alteonApproval, Approval dpApproval, Approval hwqaApproval) {
        this(manufacturer, model, type, amount, ecr);
        this.alteonApproval = alteonApproval;
        this.dpApproval = dpApproval;
        this.hwqaApproval = hwqaApproval;
    }

    public DaughterBoard(Long id, String manufacturer, String model, DaughterBoardType type, int amount, String ecr,
                         Approval alteonApproval, Approval dpApproval, Approval hwqaApproval) {
        this(manufacturer, model, type, amount, ecr, alteonApproval, dpApproval, hwqaApproval);
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

    public DaughterBoardType getType() {
        return type;
    }

    public void setType(DaughterBoardType type) {
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
