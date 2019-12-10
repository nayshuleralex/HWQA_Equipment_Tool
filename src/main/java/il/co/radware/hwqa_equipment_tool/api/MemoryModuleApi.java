package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.entities.MemoryModule;
import il.co.radware.hwqa_equipment_tool.logic.MemoryModuleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memories")
public class MemoryModuleApi {

    @Autowired
    private MemoryModuleController memoryController;

    @PostMapping
    public Long createMemory(@RequestBody MemoryModule memory) {
        return this.memoryController.createMemory(memory);
    }

    @GetMapping("/{ID}")
    public MemoryModule getMemory(Long id) {
        return this.memoryController.getMemory(id);
    }

    @GetMapping
    public List<MemoryModule> getAllMemories() {
        return this.memoryController.getAllMemories();
    }

    @GetMapping("/?manufacturer={manufacturer}")
    public List<MemoryModule> getAllMemoryModulesByManufacturer(@PathVariable String manufacturer) {
        return this.memoryController.getAllMemoriesByManufacturer(manufacturer);
    }

    @GetMapping("/?ecr={ecr}")
    public List<MemoryModule> getAllMemoryModulesByEcr(@PathVariable String ecr) {
        return this.memoryController.getAllMemoriesByEcr(ecr);
    }

    @PutMapping
    public void updateMemory(@RequestBody MemoryModule memory) {
        this.memoryController.updateMemory(memory);
    }

    @DeleteMapping("/{ID}")
    public void deleteMemory(@PathVariable Long id) {
        this.memoryController.deleteMemory(id);
    }
}
