package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.PowerSupply;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPowerSupplyDao extends CrudRepository<PowerSupply, Long> {

    @Query("SELECT p FROM PowerSupply p WHERE p.model = :model")
    PowerSupply findByModel(@Param("model") String model);

    @Query("SELECT p FROM PowerSupply p WHERE p.manufacturer = :manufacturer")
    List<PowerSupply> findAllByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT p FROM PowerSupply p WHERE p.ecr = :ecr")
    List<PowerSupply> findAllByEcr(@Param("ecr") String ecr);
}
