package il.co.radware.hwqa_equipment_tool.data;

public class DeviceDataObject {

    private String name;
    private String cpu;
    private int cpuAmount;
    private String ram;
    private int ramAmount;
    private String diskDrive;
    private String sataFlash;
    private String psuCage;
    private String psuModule;

    public DeviceDataObject() {
    }

    public DeviceDataObject(String name, String cpu, int cpuAmount, String ram, int ramAmount, String diskDrive, String sataFlash, String psuCage, String psuModule) {
        this.name = name;
        this.cpu = cpu;
        this.cpuAmount = cpuAmount;
        this.ram = ram;
        this.ramAmount = ramAmount;
        this.diskDrive = diskDrive;
        this.sataFlash = sataFlash;
        this.psuCage = psuCage;
        this.psuModule = psuModule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getCpuAmount() {
        return cpuAmount;
    }

    public void setCpuAmount(int cpuAmount) {
        this.cpuAmount = cpuAmount;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    public String getDiskDrive() {
        return diskDrive;
    }

    public void setDiskDrive(String diskDrive) {
        this.diskDrive = diskDrive;
    }

    public String getSataFlash() {
        return sataFlash;
    }

    public void setSataFlash(String sataFlash) {
        this.sataFlash = sataFlash;
    }

    public String getPsuCage() {
        return psuCage;
    }

    public void setPsuCage(String psuCage) {
        this.psuCage = psuCage;
    }

    public String getPsuModule() {
        return psuModule;
    }

    public void setPsuModule(String psuModule) {
        this.psuModule = psuModule;
    }
}
