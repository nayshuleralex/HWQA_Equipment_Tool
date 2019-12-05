package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.DiskDrive;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDiskDriveDao extends CrudRepository<DiskDrive, Long> {

    @Query("SELECT d FROM DiskDrive d WHERE d.model = :model")
    DiskDrive findByModel(@Param("model") String model);

    @Query("SELECT d FROM DiskDrive d WHERE d.manufacturer = :manufacturer")
    List<DiskDrive> findAllByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT d FROM DiskDrive d WHERE d.ecr = :ecr")
    List<DiskDrive> findAllByEcr(@Param("ecr") String ecr);

}
