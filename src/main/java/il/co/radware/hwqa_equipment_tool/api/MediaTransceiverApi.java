package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.entities.MediaTransceiver;
import il.co.radware.hwqa_equipment_tool.logic.MediaTransceiversController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transceivers")
public class MediaTransceiverApi {

    @Autowired
    private MediaTransceiversController transceiversController;

    @PostMapping
    public Long createTransceiver(@RequestBody MediaTransceiver transceiver) {
        return this.transceiversController.createTransceiver(transceiver);
    }

    @GetMapping("/{ID}")
    public MediaTransceiver getTransceiver(@PathVariable Long id) {
        return this.transceiversController.getTransceiver(id);
    }

    @GetMapping
    public List<MediaTransceiver> getAllTransceivers() {
        return this.transceiversController.getAllTransceivers();
    }

    @GetMapping("/?manufacturer={manufacturer}")
    public List<MediaTransceiver> getAllMediaTransceiversByManufacturer(@PathVariable String manufacturer) {
        return this.transceiversController.getAllTransceiversByManufacturer(manufacturer);
    }

    @GetMapping("/?ecr={ecr}")
    public List<MediaTransceiver> getAllMediaTransceiversByEcr(@PathVariable String ecr) {
        return this.transceiversController.getAllTransceiversByEcr(ecr);
    }

    @PutMapping
    public void updateTransceiver(@RequestBody MediaTransceiver transceiver) {
        this.transceiversController.updateTransceiver(transceiver);
    }

    @DeleteMapping("/{ID}")
    public void deleteTransceiver(@PathVariable Long id) {
        this.transceiversController.deleteTransceiver(id);
    }
}
