package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.IDiskDriveDao;
import il.co.radware.hwqa_equipment_tool.entities.DiskDrive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DiskDriveController {

    @Autowired
    private IDiskDriveDao diskDriveDao;

    public Long createDrive(DiskDrive drive) {
        return this.diskDriveDao.save(drive).getId();
    }

    public DiskDrive getDrive(long id) {
        return this.diskDriveDao.findById(id).get();
    }

    public List<DiskDrive> getAllDrives() {
        return (List<DiskDrive>) this.diskDriveDao.findAll();
    }

    public void updateDrive(DiskDrive drive) {
        this.diskDriveDao.save(drive);
    }

    public void deleteDrive(long id) {
        this.diskDriveDao.deleteById(id);
    }

    public List<DiskDrive> getAllDrivesByManufacturer(String manufacturer) {
        return diskDriveDao.findAllByManufacturer(manufacturer);
    }

    public List<DiskDrive> getAllDrivesByEcr(String ecr) {
        return diskDriveDao.findAllByEcr(ecr);
    }
}
