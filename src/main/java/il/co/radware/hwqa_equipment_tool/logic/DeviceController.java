package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.IDeviceDao;
import il.co.radware.hwqa_equipment_tool.data.DeviceDataObject;
import il.co.radware.hwqa_equipment_tool.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DeviceController {

    @Autowired
    private IDeviceDao deviceDao;
    @Autowired
    private ProcessorUnitController processorUnitController;
    @Autowired
    private MemoryModuleController memoryModuleController;
    @Autowired
    private DiskDriveController diskDriveController;
    @Autowired
    private SataFlashController sataFlashController;
    @Autowired
    private PowerSupplyCageController powerSupplyCageController;
    @Autowired
    private PowerSupplyModuleController powerSupplyModuleController;


    public Long createDevice(DeviceDataObject deviceData) {
        Device device = parseDeviceDataObject(deviceData);
        return this.deviceDao.save(device).getId();
    }

    private Device parseDeviceDataObject(DeviceDataObject deviceData) {
        String deviceName = deviceData.getName();
        String strCpu = deviceData.getCpu();
        Integer cpuAmount = deviceData.getCpuAmount();
        String strRam = deviceData.getRam();
        Integer ramAmount = deviceData.getRamAmount();
        String strDisk = deviceData.getDiskDrive();
        String strSata = deviceData.getSataFlash();
        String strPsuCage = deviceData.getPsuCage();
        String strPsuModule = deviceData.getPsuModule();

        ProcessorUnit cpu = processorUnitController.getProcessorUnitByModel(strCpu);
        MemoryModule ram = memoryModuleController.getMemoryByModel(strRam);
        DiskDrive disk = diskDriveController.getDriveByModel(strDisk);
        SataFlash sata = sataFlashController.getSataFlashByModel(strSata);
        PowerSupplyCage psuCage = powerSupplyCageController.getPowerSupplyCageByModel(strPsuCage);
        PowerSupplyModule psuModule = powerSupplyModuleController.getPowerSupplyModuleByModel(strPsuModule);

        Device device = new Device();
        device.setName(deviceName);
        device.setCpu(cpu);
        device.setCpuAmount(cpuAmount);
        device.setRam(ram);
        device.setRamAmount(ramAmount);
        device.setDiskDrive(disk);
        device.setSataFlash(sata);
        device.setPsuCage(psuCage);
        device.setPsuModule(psuModule);
        return device;
    }

    public Device getDevice(long id) {
        return this.deviceDao.findById(id).get();
    }

    public List<Device> getAllDevice() {
        return (List<Device>) this.deviceDao.findAll();
    }

    public void updateDevice(Device device) {
        this.deviceDao.save(device);
    }

    public void deleteDevice(long id) {
        this.deviceDao.deleteById(id);
    }

//    public List<Device> getAllDevicesByManufacturer(String manufacturer) {
//        return deviceDao.findAllByManufacturer(manufacturer);
//    }

//    public List<Device> getAllDevicesByEcr(String ecr) {
//        return deviceDao.findAllByEcr(ecr);
//    }
}
