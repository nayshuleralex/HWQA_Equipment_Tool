package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.DiskDrive;
import il.co.radware.hwqa_equipment_tool.entities.SataFlash;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ISataFlashDao extends CrudRepository<SataFlash, Long> {

    @Query("SELECT f FROM SataFlash f WHERE f.model = :model")
    SataFlash findByModel(@Param("model") String model);

    @Query("SELECT f FROM SataFlash f WHERE f.manufacturer = :manufacturer")
    List<SataFlash> findAllByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT f FROM SataFlash f WHERE f.ecr = :ecr")
    List<SataFlash> findAllByEcr(@Param("ecr") String ecr);

}
