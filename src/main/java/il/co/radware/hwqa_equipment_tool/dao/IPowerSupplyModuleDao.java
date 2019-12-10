package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.PowerSupplyCage;
import il.co.radware.hwqa_equipment_tool.entities.PowerSupplyModule;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPowerSupplyModuleDao extends CrudRepository<PowerSupplyModule, Long> {

    @Query("SELECT p FROM PowerSupplyModule p WHERE p.model = :model")
    PowerSupplyModule findByModel(@Param("model") String model);

    @Query("SELECT p FROM PowerSupplyModule p WHERE p.manufacturer = :manufacturer")
    List<PowerSupplyModule> findAllByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT p FROM PowerSupplyModule p WHERE p.ecr = :ecr")
    List<PowerSupplyModule> findAllByEcr(@Param("ecr") String ecr);
}
