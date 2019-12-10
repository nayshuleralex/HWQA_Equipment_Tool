package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.DaughterBoard;
import il.co.radware.hwqa_equipment_tool.entities.ExtensionCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDaughterBoardDao extends CrudRepository<DaughterBoard, Long> {

    @Query("SELECT b FROM DaughterBoard b WHERE b.model = :model")
    DaughterBoard findByModel(@Param("model") String model);

    @Query("SELECT b FROM DaughterBoard b WHERE b.manufacturer = :manufacturer")
    List<DaughterBoard> findAllByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT b FROM DaughterBoard b WHERE b.ecr = :ecr")
    List<DaughterBoard> findAllByEcr(@Param("ecr") String ecr);
}
