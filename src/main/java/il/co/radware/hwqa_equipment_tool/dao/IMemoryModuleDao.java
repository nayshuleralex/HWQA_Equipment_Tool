package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.MemoryModule;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMemoryModuleDao extends CrudRepository<MemoryModule, Long> {

    @Query("SELECT m FROM MemoryModule m WHERE m.model = :model")
    MemoryModule findByModel(@Param("model") String model);

    @Query("SELECT m FROM MemoryModule m WHERE m.manufacturer = :manufacturer")
    List<MemoryModule> findAllByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT m FROM MemoryModule m WHERE m.ecr = :ecr")
    List<MemoryModule> findAllByEcr(@Param("ecr") String ecr);
}
