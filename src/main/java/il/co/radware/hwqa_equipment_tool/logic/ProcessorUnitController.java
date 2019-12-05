package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.IProcessorUnitDao;
import il.co.radware.hwqa_equipment_tool.entities.ProcessorUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProcessorUnitController {

    @Autowired
    private IProcessorUnitDao processorUnitDao;

    public Long createProcessorUnit(ProcessorUnit processorUnit) {
        return this.processorUnitDao.save(processorUnit).getId();
    }

    public ProcessorUnit getProcessorUnit(Long id) {
        return this.processorUnitDao.findById(id).get();
    }

    public List<ProcessorUnit> getAllProcessorUnits() {
        return (List<ProcessorUnit>) this.processorUnitDao.findAll();
    }

    public void updateProcessorUnit(ProcessorUnit processorUnit) {
        this.processorUnitDao.save(processorUnit);
    }

    public void deleteProcessorUnit(Long id) {
        this.processorUnitDao.deleteById(id);
    }

    public List<ProcessorUnit> getAllProcessorUnitsByManufacturer(String manufacturer) {
        return this.processorUnitDao.findAllByManufacturer(manufacturer);
    }

    public List<ProcessorUnit> getAllProcessorUnitsByEcr(String ecr) {
        return this.processorUnitDao.findAllByEcr(ecr);
    }
}
