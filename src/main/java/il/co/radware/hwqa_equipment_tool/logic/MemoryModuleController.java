package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.IMemoryModuleDao;
import il.co.radware.hwqa_equipment_tool.entities.MemoryModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MemoryModuleController {

    @Autowired
    private IMemoryModuleDao memoryModuleDao;

    public Long createMemory(MemoryModule memory) {
        return this.memoryModuleDao.save(memory).getId();
    }

    public MemoryModule getMemory(Long id) {
        return this.memoryModuleDao.findById(id).get();
    }

    public MemoryModule getMemoryByModel(String memoryModel) {
        return this.memoryModuleDao.findByModel(memoryModel);
    }

    public List<MemoryModule> getAllMemories() {
        return (List<MemoryModule>) this.memoryModuleDao.findAll();
    }

    public void updateMemory(MemoryModule memory) {
        this.memoryModuleDao.save(memory);
    }

    public void deleteMemory(Long id) {
        this.memoryModuleDao.deleteById(id);
    }

    public List<MemoryModule> getAllMemoriesByManufacturer(String manufacturer) {
        return this.memoryModuleDao.findAllByManufacturer(manufacturer);
    }

    public List<MemoryModule> getAllMemoriesByEcr(String ecr) {
        return this.memoryModuleDao.findAllByEcr(ecr);
    }
}
