package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.PowerSupplyCage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPowerSupplyCageDao extends CrudRepository<PowerSupplyCage, Long> {

    @Query("SELECT p FROM PowerSupplyCage p WHERE p.model = :model")
    PowerSupplyCage findByModel(@Param("model") String model);

    @Query("SELECT p FROM PowerSupplyCage p WHERE p.manufacturer = :manufacturer")
    List<PowerSupplyCage> findAllByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT p FROM PowerSupplyCage p WHERE p.ecr = :ecr")
    List<PowerSupplyCage> findAllByEcr(@Param("ecr") String ecr);
}
