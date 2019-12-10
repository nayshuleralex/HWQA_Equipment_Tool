package il.co.radware.hwqa_equipment_tool.entities;

import il.co.radware.hwqa_equipment_tool.enums.Approval;
import il.co.radware.hwqa_equipment_tool.enums.transceiver.TransceiverRange;
import il.co.radware.hwqa_equipment_tool.enums.transceiver.TransceiverType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MEDIA_TRANSCEIVERS")
public class MediaTransceiver implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "MANUFACTURER", nullable = false)
    private String manufacturer;

    @Column(name = "MODEL", unique = true, nullable = false)
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(name = "TRANSCEIVER_TYPE", nullable = false)
    private TransceiverType transceiverType;

    @Enumerated(EnumType.STRING)
    @Column(name = "TRANSCEIVER_RANGE", nullable = false)
    private TransceiverRange transceiverRange;

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

    public MediaTransceiver() {
    }

    public MediaTransceiver(String manufacturer, String model, TransceiverType transceiverType,
                            TransceiverRange transceiverRange, int amount, String ecr) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.transceiverType = transceiverType;
        this.transceiverRange = transceiverRange;
        this.amount = amount;
        this.ecr = ecr;
    }

    public MediaTransceiver(String manufacturer, String model, TransceiverType transceiverType,
                            TransceiverRange transceiverRange, int amount, String ecr, Approval alteonApproval,
                            Approval dpApproval, Approval hwqaApproval) {
        this(manufacturer, model, transceiverType, transceiverRange, amount, ecr);
        this.alteonApproval = alteonApproval;
        this.dpApproval = dpApproval;
        this.hwqaApproval = hwqaApproval;
    }

    public MediaTransceiver(Long id, String manufacturer, String model, TransceiverType transceiverType,
                            TransceiverRange transceiverRange, int amount, String ecr, Approval alteonApproval,
                            Approval dpApproval, Approval hwqaApproval) {
        this(manufacturer, model, transceiverType, transceiverRange, amount, ecr, alteonApproval, dpApproval, hwqaApproval);
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

    public TransceiverType getTransceiverType() {
        return transceiverType;
    }

    public void setTransceiverType(TransceiverType transceiverType) {
        this.transceiverType = transceiverType;
    }

    public TransceiverRange getTransceiverRange() {
        return transceiverRange;
    }

    public void setTransceiverRange(TransceiverRange transceiverRange) {
        this.transceiverRange = transceiverRange;
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
}
