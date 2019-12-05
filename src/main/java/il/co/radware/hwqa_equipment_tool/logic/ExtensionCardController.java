package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.IExtensionCardDao;
import il.co.radware.hwqa_equipment_tool.entities.ExtensionCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ExtensionCardController {

    @Autowired
    private IExtensionCardDao extensionCardDao;

    public Long createCard(ExtensionCard card) {
        return this.extensionCardDao.save(card).getId();
    }

    public ExtensionCard getCard(Long id) {
        return this.extensionCardDao.findById(id).get();
    }

    public List<ExtensionCard> getAllCards() {
        return (List<ExtensionCard>) this.extensionCardDao.findAll();
    }

    public void updateCard(ExtensionCard card) {
        this.extensionCardDao.save(card);
    }

    public void deleteCard(Long id) {
        this.extensionCardDao.deleteById(id);
    }

    public List<ExtensionCard> getAllCardsByManufacturer(String manufacturer) {
        return this.extensionCardDao.findAllByManufacturer(manufacturer);
    }

    public List<ExtensionCard> getAllCardsByEcr(String ecr) {
        return this.extensionCardDao.findAllByEcr(ecr);
    }
}
