package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.ExtensionCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IExtensionCardDao extends CrudRepository<ExtensionCard, Long> {

    @Query("SELECT e FROM ExtensionCard e WHERE e.model = :model")
    ExtensionCard findByModel(@Param("model") String model);

    @Query("SELECT e FROM ExtensionCard e WHERE e.manufacturer = :manufacturer")
    List<ExtensionCard> findAllByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT e FROM ExtensionCard e WHERE e.ecr = :ecr")
    List<ExtensionCard> findAllByEcr(@Param("ecr") String ecr);
}
