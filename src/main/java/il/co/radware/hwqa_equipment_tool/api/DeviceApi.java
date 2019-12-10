package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.data.DeviceDataObject;
import il.co.radware.hwqa_equipment_tool.entities.Device;
import il.co.radware.hwqa_equipment_tool.logic.DeviceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceApi {

    @Autowired
    private DeviceController deviceController;

    @PostMapping
    public Long createDevice(@RequestBody DeviceDataObject device) {
        return this.deviceController.createDevice(device);
    }


    @GetMapping("/{ID}")
    public Device getDevice(@PathVariable("ID") long id) {
        return this.deviceController.getDevice(id);
    }

    @GetMapping
    public List<Device> getAllDevices() {
        return this.deviceController.getAllDevice();
    }

//    @GetMapping("/?manufacturer={manufacturer}")
//    public List<Device> getAllDevicesByManufacturer(@PathVariable String manufacturer) {
//        return this.deviceController.getAllDevicesByManufacturer(manufacturer);
//    }

//    @GetMapping("/?ecr={ecr}")
//    public List<Device> getAllDevicesByEcr(@PathVariable String ecr) {
//        return this.deviceController.getAllDevicesByEcr(ecr);
//    }

    @PutMapping
    public void updateDevice(@RequestBody Device device) {
        this.deviceController.updateDevice(device);
    }


    @DeleteMapping("/{ID}")
    public void deleteDevice(@PathVariable("ID") long id) {
        this.deviceController.deleteDevice(id);
    }


}
