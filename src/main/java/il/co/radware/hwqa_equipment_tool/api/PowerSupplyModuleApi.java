package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.entities.PowerSupplyCage;
import il.co.radware.hwqa_equipment_tool.entities.PowerSupplyModule;
import il.co.radware.hwqa_equipment_tool.logic.PowerSupplyModuleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/psu_modules")
public class PowerSupplyModuleApi {

    @Autowired
    private PowerSupplyModuleController powerSupplyModuleController;

    @PostMapping
    public Long createPowerSupplyModule(@RequestBody PowerSupplyModule powerSupplyModule) {
        return this.powerSupplyModuleController.createPowerSupplyModule(powerSupplyModule);
    }

    @GetMapping("/{ID}")
    public PowerSupplyModule getPowerSupplyModule(@PathVariable Long id) {
        return this.powerSupplyModuleController.getPowerSupplyModule(id);
    }

    @GetMapping
    public List<PowerSupplyModule> getAllPowerSupplyModules() {
        return this.powerSupplyModuleController.getAllPowerSupplyModules();
    }

    @GetMapping("/?manufacturer={manufacturer}")
    public List<PowerSupplyModule> getAllPowerSupplyModulesByManufacturer(@PathVariable String manufacturer) {
        return this.powerSupplyModuleController.getAllPowerSupplyModulesByManufacturer(manufacturer);
    }

    @GetMapping("/?ecr={ecr}")
    public List<PowerSupplyModule> getAllPowerSupplyModulesByEcr(@PathVariable String ecr) {
        return this.powerSupplyModuleController.getAllPowerSupplyModulesByEcr(ecr);
    }

    @PutMapping
    public void updatePowerSupplyModule(@RequestBody PowerSupplyModule powerSupplyModule) {
        this.powerSupplyModuleController.updatePowerSupplyModule(powerSupplyModule);
    }

    @DeleteMapping("/{ID}")
    public void deletePowerSupplyModule(@PathVariable Long id) {
        this.powerSupplyModuleController.deletePowerSupplyModule(id);
    }
}
