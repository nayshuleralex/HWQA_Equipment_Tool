package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.IPowerSupplyDao;
import il.co.radware.hwqa_equipment_tool.entities.PowerSupply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PowerSupplyController {

    @Autowired
    private IPowerSupplyDao powerSupplyDao;

    public Long createPowerSupply(PowerSupply powerSupply) {
        return this.powerSupplyDao.save(powerSupply).getId();
    }

    public PowerSupply getPowerSupply(Long id) {
        return this.powerSupplyDao.findById(id).get();
    }

    public List<PowerSupply> getAllPowerSupplies() {
        return (List<PowerSupply>) this.powerSupplyDao.findAll();
    }

    public void updatePowerSupply(PowerSupply powerSupply) {
        this.powerSupplyDao.save(powerSupply);
    }

    public void deletePowerSupply(Long id) {
        this.powerSupplyDao.deleteById(id);
    }

    public List<PowerSupply> getAllPowerSuppliesByManufacturer(String manufacturer) {
        return this.powerSupplyDao.findAllByManufacturer(manufacturer);
    }

    public List<PowerSupply> getAllPowerSuppliesByEcr(String ecr) {
        return this.powerSupplyDao.findAllByEcr(ecr);
    }
}
