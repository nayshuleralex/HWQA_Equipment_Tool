package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.IPowerSupplyModuleDao;
import il.co.radware.hwqa_equipment_tool.entities.PowerSupplyCage;
import il.co.radware.hwqa_equipment_tool.entities.PowerSupplyModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PowerSupplyModuleController {

    @Autowired
    private IPowerSupplyModuleDao powerSupplyModuleDao;

    public Long createPowerSupplyModule(PowerSupplyModule powerSupplyModule) {
        return this.powerSupplyModuleDao.save(powerSupplyModule).getId();
    }

    public PowerSupplyModule getPowerSupplyModule(Long id) {
        return this.powerSupplyModuleDao.findById(id).get();
    }

    public PowerSupplyModule getPowerSupplyModuleByModel(String powerSupplyModuleModel) {
        return this.powerSupplyModuleDao.findByModel(powerSupplyModuleModel);
    }

    public List<PowerSupplyModule> getAllPowerSupplyModules() {
        return (List<PowerSupplyModule>) this.powerSupplyModuleDao.findAll();
    }

    public void updatePowerSupplyModule(PowerSupplyModule powerSupplyModule) {
        this.powerSupplyModuleDao.save(powerSupplyModule);
    }

    public void deletePowerSupplyModule(Long id) {
        this.powerSupplyModuleDao.deleteById(id);
    }

    public List<PowerSupplyModule> getAllPowerSupplyModulesByManufacturer(String manufacturer) {
        return this.powerSupplyModuleDao.findAllByManufacturer(manufacturer);
    }

    public List<PowerSupplyModule> getAllPowerSupplyModulesByEcr(String ecr) {
        return this.powerSupplyModuleDao.findAllByEcr(ecr);
    }
}
