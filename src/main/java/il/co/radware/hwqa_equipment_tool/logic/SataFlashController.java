package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.ISataFlashDao;
import il.co.radware.hwqa_equipment_tool.entities.DiskDrive;
import il.co.radware.hwqa_equipment_tool.entities.SataFlash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SataFlashController {

    @Autowired
    private ISataFlashDao sataFlashDao;

    public Long createSataFlash(SataFlash sataFlash) {
        return this.sataFlashDao.save(sataFlash).getId();
    }

    public SataFlash getSataFlash(long id) {
        return this.sataFlashDao.findById(id).get();
    }

    public SataFlash getSataFlashByModel(String sataFlashModel) {
        return this.sataFlashDao.findByModel(sataFlashModel);
    }

    public List<SataFlash> getAllSataFlashes() {
        return (List<SataFlash>) this.sataFlashDao.findAll();
    }

    public void updateSataFlash(SataFlash sataFlash) {
        this.sataFlashDao.save(sataFlash);
    }

    public void deleteSataFlash(long id) {
        this.sataFlashDao.deleteById(id);
    }

    public List<SataFlash> getAllSataFlashesByManufacturer(String manufacturer) {
        return sataFlashDao.findAllByManufacturer(manufacturer);
    }

    public List<SataFlash> getAllSataFlashesByEcr(String ecr) {
        return sataFlashDao.findAllByEcr(ecr);
    }
}