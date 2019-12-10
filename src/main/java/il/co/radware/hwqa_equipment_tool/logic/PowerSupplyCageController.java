package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.IPowerSupplyCageDao;
import il.co.radware.hwqa_equipment_tool.entities.PowerSupplyCage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PowerSupplyCageController {

    @Autowired
    private IPowerSupplyCageDao powerSupplyCageDao;

    public Long createPowerSupplyCage(PowerSupplyCage powerSupplyCage) {
        return this.powerSupplyCageDao.save(powerSupplyCage).getId();
    }

    public PowerSupplyCage getPowerSupplyCage(Long id) {
        return this.powerSupplyCageDao.findById(id).get();
    }

    public PowerSupplyCage getPowerSupplyCageByModel(String powerSupplyCageModel) {
        return this.powerSupplyCageDao.findByModel(powerSupplyCageModel);
    }

    public List<PowerSupplyCage> getAllPowerSupplyCages() {
        return (List<PowerSupplyCage>) this.powerSupplyCageDao.findAll();
    }

    public void updatePowerSupplyCage(PowerSupplyCage powerSupplyCage) {
        this.powerSupplyCageDao.save(powerSupplyCage);
    }

    public void deletePowerSupplyCage(Long id) {
        this.powerSupplyCageDao.deleteById(id);
    }

    public List<PowerSupplyCage> getAllPowerSupplyCagesByManufacturer(String manufacturer) {
        return this.powerSupplyCageDao.findAllByManufacturer(manufacturer);
    }

    public List<PowerSupplyCage> getAllPowerSupplyCagesByEcr(String ecr) {
        return this.powerSupplyCageDao.findAllByEcr(ecr);
    }
}
