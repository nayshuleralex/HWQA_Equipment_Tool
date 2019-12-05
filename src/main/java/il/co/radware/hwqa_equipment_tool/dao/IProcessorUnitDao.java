package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.ProcessorUnit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProcessorUnitDao extends CrudRepository<ProcessorUnit, Long> {

    @Query("SELECT p FROM ProcessorUnit p WHERE p.model = :model")
    ProcessorUnit findByModel(@Param("model") String model);

    @Query("SELECT p FROM ProcessorUnit p WHERE p.manufacturer = :manufacturer")
    List<ProcessorUnit> findAllByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT p FROM MediaTransceiver p WHERE p.ecr = :ecr")
    List<ProcessorUnit> findAllByEcr(@Param("ecr") String ecr);
}
