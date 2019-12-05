package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.entities.PowerSupply;
import il.co.radware.hwqa_equipment_tool.logic.PowerSupplyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/power_supplies")
public class PowerSupplyApi {

    @Autowired
    private PowerSupplyController powerSupplyController;

    @PostMapping
    public Long createPowerSupply(@RequestBody PowerSupply powerSupply) {
        return this.powerSupplyController.createPowerSupply(powerSupply);
    }

    @GetMapping("/{ID}")
    public PowerSupply getPowerSupply(@PathVariable Long id) {
        return this.powerSupplyController.getPowerSupply(id);
    }

    @GetMapping
    public List<PowerSupply> getAllPowerSupplies() {
        return this.powerSupplyController.getAllPowerSupplies();
    }

    @GetMapping("/?manufacturer={manufacturer}")
    public List<PowerSupply> getAllDrivesByManufacturer(@PathVariable String manufacturer) {
        return this.powerSupplyController.getAllPowerSuppliesByManufacturer(manufacturer);
    }

    @GetMapping("/?ecr={ecr}")
    public List<PowerSupply> getAllDrivesByEcr(@PathVariable String ecr) {
        return this.powerSupplyController.getAllPowerSuppliesByEcr(ecr);
    }

    @PutMapping
    public void updatePowerSupply(@RequestBody PowerSupply powerSupply) {
        this.powerSupplyController.updatePowerSupply(powerSupply);
    }

    @DeleteMapping("/{ID}")
    public void deletePowerSupply(@PathVariable Long id) {
        this.powerSupplyController.deletePowerSupply(id);
    }
}
