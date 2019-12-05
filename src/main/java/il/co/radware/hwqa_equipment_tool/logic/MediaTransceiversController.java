package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.IMediaTransceiverDao;
import il.co.radware.hwqa_equipment_tool.entities.MediaTransceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MediaTransceiversController {

    @Autowired
    private IMediaTransceiverDao mediaTransceiverDao;

    public Long createTransceiver(MediaTransceiver transceiver) {
        return this.mediaTransceiverDao.save(transceiver).getId();
    }

    public MediaTransceiver getTransceiver(Long id) {
        return this.mediaTransceiverDao.findById(id).get();
    }

    public List<MediaTransceiver> getAllTransceivers() {
        return (List<MediaTransceiver>) this.mediaTransceiverDao.findAll();
    }

    public void updateTransceiver(MediaTransceiver transceiver) {
        this.mediaTransceiverDao.save(transceiver);
    }

    public void deleteTransceiver(Long id) {
        this.mediaTransceiverDao.deleteById(id);
    }

    public List<MediaTransceiver> getAllTransceiversByManufacturer(String manufacturer) {
        return this.mediaTransceiverDao.findAllByManufacturer(manufacturer);
    }

    public List<MediaTransceiver> getAllTransceiversByEcr(String ecr) {
        return this.mediaTransceiverDao.findAllByEcr(ecr);
    }
}
