package il.co.radware.hwqa_equipment_tool.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DEVICES")
public class Device implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "DEVICE_ID")
    private Long id;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "CPU_ID", nullable = false)
    @JsonIgnore
    private ProcessorUnit cpu;

    @Column(name = "CPU_AMOUNT", nullable = false)
    private int cpuAmount;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "RAM_ID", nullable = false)
    @JsonIgnore
    private MemoryModule ram;

    @Column(name = "RAM_AMOUNT", nullable = false)
    private int ramAmount;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "DISK_ID", nullable = false)
    @JsonIgnore
    private DiskDrive diskDrive;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "SATADOM_ID", nullable = true)
    @JsonIgnore
    private SataFlash sataFlash;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "PSU_CAGE_ID", nullable = true)
    @JsonIgnore
    private PowerSupplyCage psuCage;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "PSU_MODULE_ID", nullable = false)
    @JsonIgnore
    private PowerSupplyModule psuModule;

    //Nullable for: VL, LS, VL2, EL, LS2, VHT
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "DAUGHTER_BOARD_ID", nullable = true)
    @JsonIgnore
    private DaughterBoard daughterBoard;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "SSL_CARD_ID", nullable = true)
    @JsonIgnore
    private ExtensionCard sslCard;

    public Device() {
    }

    public Device(Long id, String name, ProcessorUnit cpu, int cpuAmount, MemoryModule ram, int ramAmount,
                  DiskDrive diskDrive, SataFlash sataFlash, PowerSupplyCage psuCage, PowerSupplyModule psuModule,
                  DaughterBoard daughterBoard, ExtensionCard sslCard) {
        this(name, cpu, cpuAmount, ram, ramAmount, diskDrive, sataFlash, psuCage, psuModule, daughterBoard, sslCard);
        this.id = id;
    }

    public Device(String name, ProcessorUnit cpu, int cpuAmount, MemoryModule ram, int ramAmount, DiskDrive diskDrive,
                  SataFlash sataFlash, PowerSupplyCage psuCage, PowerSupplyModule psuModule,
                  DaughterBoard daughterBoard, ExtensionCard sslCard) {
        this.name = name;
        this.cpu = cpu;
        this.cpuAmount = cpuAmount;
        this.ram = ram;
        this.ramAmount = ramAmount;
        this.diskDrive = diskDrive;
        this.sataFlash = sataFlash;
        this.psuCage = psuCage;
        this.psuModule = psuModule;
        this.daughterBoard = daughterBoard;
        this.sslCard = sslCard;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessorUnit getCpu() {
        return cpu;
    }

    public void setCpu(ProcessorUnit cpu) {
        this.cpu = cpu;
    }

    public int getCpuAmount() {
        return cpuAmount;
    }

    public void setCpuAmount(int cpuAmount) {
        this.cpuAmount = cpuAmount;
    }

    public MemoryModule getRam() {
        return ram;
    }

    public void setRam(MemoryModule ram) {
        this.ram = ram;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    public DiskDrive getDiskDrive() {
        return diskDrive;
    }

    public void setDiskDrive(DiskDrive diskDrive) {
        this.diskDrive = diskDrive;
    }

    public SataFlash getSataFlash() {
        return sataFlash;
    }

    public void setSataFlash(SataFlash sataFlash) {
        this.sataFlash = sataFlash;
    }

    public PowerSupplyCage getPsuCage() {
        return psuCage;
    }

    public void setPsuCage(PowerSupplyCage psuCage) {
        this.psuCage = psuCage;
    }

    public PowerSupplyModule getPsuModule() {
        return psuModule;
    }

    public void setPsuModule(PowerSupplyModule psuModule) {
        this.psuModule = psuModule;
    }

    public DaughterBoard getDaughterBoard() {
        return daughterBoard;
    }

    public void setDaughterBoard(DaughterBoard daughterBoard) {
        this.daughterBoard = daughterBoard;
    }

    public ExtensionCard getSslCard() {
        return sslCard;
    }

    public void setSslCard(ExtensionCard sslCard) {
        this.sslCard = sslCard;
    }
}
