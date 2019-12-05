package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.entities.DiskDrive;
import il.co.radware.hwqa_equipment_tool.logic.DiskDriveController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drives")
public class DiskDriveApi {

    @Autowired
    private DiskDriveController driveController;

    @PostMapping
    public Long createDrive(@RequestBody DiskDrive drive) {
        return this.driveController.createDrive(drive);
    }


    @GetMapping("/{ID}")
    public DiskDrive getDrive(@PathVariable("ID") long id) {
        return this.driveController.getDrive(id);
    }

    @GetMapping
    public List<DiskDrive> getAllDrives() {
        return this.driveController.getAllDrives();
    }

    @GetMapping("/?manufacturer={manufacturer}")
    public List<DiskDrive> getAllDrivesByManufacturer(@PathVariable String manufacturer) {
        return this.driveController.getAllDrivesByManufacturer(manufacturer);
    }

    @GetMapping("/?ecr={ecr}")
    public List<DiskDrive> getAllDrivesByEcr(@PathVariable String ecr) {
        return this.driveController.getAllDrivesByEcr(ecr);
    }

    @PutMapping
    public void updateDrive(@RequestBody DiskDrive drive) {
        this.driveController.updateDrive(drive);
    }


    @DeleteMapping("/{ID}")
    public void deleteDrive(@PathVariable("ID") long id) {
        this.driveController.deleteDrive(id);
    }


}
