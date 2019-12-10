package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.entities.PowerSupplyCage;
import il.co.radware.hwqa_equipment_tool.logic.PowerSupplyCageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/psu_cages")
public class PowerSupplyCageApi {

    @Autowired
    private PowerSupplyCageController powerSupplyCageController;

    @PostMapping
    public Long createPowerSupplyCage(@RequestBody PowerSupplyCage powerSupplyCage) {
        return this.powerSupplyCageController.createPowerSupplyCage(powerSupplyCage);
    }

    @GetMapping("/{ID}")
    public PowerSupplyCage getPowerSupplyCage(@PathVariable Long id) {
        return this.powerSupplyCageController.getPowerSupplyCage(id);
    }

    @GetMapping
    public List<PowerSupplyCage> getAllPowerSupplyCages() {
        return this.powerSupplyCageController.getAllPowerSupplyCages();
    }

    @GetMapping("/?manufacturer={manufacturer}")
    public List<PowerSupplyCage> getAllPowerSupplyCagesByManufacturer(@PathVariable String manufacturer) {
        return this.powerSupplyCageController.getAllPowerSupplyCagesByManufacturer(manufacturer);
    }

    @GetMapping("/?ecr={ecr}")
    public List<PowerSupplyCage> getAllPowerSupplyCagesByEcr(@PathVariable String ecr) {
        return this.powerSupplyCageController.getAllPowerSupplyCagesByEcr(ecr);
    }

    @PutMapping
    public void updatePowerSupplyCage(@RequestBody PowerSupplyCage powerSupplyCage) {
        this.powerSupplyCageController.updatePowerSupplyCage(powerSupplyCage);
    }

    @DeleteMapping("/{ID}")
    public void deletePowerSupplyCage(@PathVariable Long id) {
        this.powerSupplyCageController.deletePowerSupplyCage(id);
    }
}
