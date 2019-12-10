package il.co.radware.hwqa_equipment_tool.dao;

import il.co.radware.hwqa_equipment_tool.entities.Device;
import il.co.radware.hwqa_equipment_tool.entities.MediaTransceiver;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDeviceDao extends CrudRepository<Device, Long> {

}
