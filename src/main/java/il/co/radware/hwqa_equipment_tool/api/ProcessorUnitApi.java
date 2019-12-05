package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.entities.ProcessorUnit;
import il.co.radware.hwqa_equipment_tool.logic.ProcessorUnitController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/processors")
public class ProcessorUnitApi {

    @Autowired
    private ProcessorUnitController processorController;

    @PostMapping
    public Long createProcessorUnit(@RequestBody ProcessorUnit processorUnit) {
        return this.processorController.createProcessorUnit(processorUnit);
    }
    @GetMapping("/{ID}")
    public ProcessorUnit getProcessorUnit(@PathVariable Long id) {
        return this.processorController.getProcessorUnit(id);
    }

    @GetMapping
    public List<ProcessorUnit> getAllProcessorUnits() {
        return this.processorController.getAllProcessorUnits();
    }

    @GetMapping("/?manufacturer={manufacturer}")
    public List<ProcessorUnit> getAllDrivesByManufacturer(@PathVariable String manufacturer) {
        return this.processorController.getAllProcessorUnitsByManufacturer(manufacturer);
    }

    @GetMapping("/?ecr={ecr}")
    public List<ProcessorUnit> getAllDrivesByEcr(@PathVariable String ecr) {
        return this.processorController.getAllProcessorUnitsByEcr(ecr);
    }

    @PutMapping
    public void updateProcessorUnit(@RequestBody ProcessorUnit processorUnit) {
        this.processorController.updateProcessorUnit(processorUnit);
    }

    @DeleteMapping("/{ID}")
    public void deleteProcessorUnit(@PathVariable Long id) {
        this.processorController.deleteProcessorUnit(id);
    }
}
