package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.entities.ExtensionCard;
import il.co.radware.hwqa_equipment_tool.logic.ExtensionCardController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class ExtensionCardApi {

    @Autowired
    private ExtensionCardController cardController;


    @PostMapping
    public Long createCard(@RequestBody ExtensionCard card) {
        return this.cardController.createCard(card);
    }

    @GetMapping("/{ID}")
    public ExtensionCard getCard(@PathVariable Long id) {
        return this.cardController.getCard(id);
    }

    @GetMapping
    public List<ExtensionCard> getAllCards() {
        return this.cardController.getAllCards();
    }

    @GetMapping("/?manufacturer={manufacturer}")
    public List<ExtensionCard> getAllDrivesByManufacturer(@PathVariable String manufacturer) {
        return this.cardController.getAllCardsByManufacturer(manufacturer);
    }

    @GetMapping("/?ecr={ecr}")
    public List<ExtensionCard> getAllDrivesByEcr(@PathVariable String ecr) {
        return this.cardController.getAllCardsByEcr(ecr);
    }

    @PutMapping
    public void updateCard(@RequestBody ExtensionCard card) {
        this.cardController.updateCard(card);
    }

    @DeleteMapping("/{ID}")
    public void deleteCard(@PathVariable Long id) {
        this.cardController.deleteCard(id);
    }
}
