package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.MediaTransceiver;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMediaTransceiverDao extends CrudRepository<MediaTransceiver, Long> {

    @Query("SELECT m FROM MediaTransceiver m WHERE m.model = :model")
    MediaTransceiver findByModel(@Param("model") String model);

    @Query("SELECT m FROM MediaTransceiver m WHERE m.manufacturer = :manufacturer")
    List<MediaTransceiver> findAllByManufacturer(@Param("manufacturer") String manufacturer);

    @Query("SELECT m FROM MediaTransceiver m WHERE m.ecr = :ecr")
    List<MediaTransceiver> findAllByEcr(@Param("ecr") String ecr);
}
