package il.co.radware.hwqa_equipment_tool.logic;

import il.co.radware.hwqa_equipment_tool.dao.IDaughterBoardDao;
import il.co.radware.hwqa_equipment_tool.entities.DaughterBoard;
import il.co.radware.hwqa_equipment_tool.entities.DiskDrive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DaughterBoardController {

    @Autowired
    private IDaughterBoardDao daughterBoardDao;

    public Long createDaughterBoard(DaughterBoard daughterBoard) {
        return this.daughterBoardDao.save(daughterBoard).getId();
    }

    public DaughterBoard getDaughterBoard(long id) {
        return this.daughterBoardDao.findById(id).get();
    }

    public List<DaughterBoard> getAllDaughterBoards() {
        return (List<DaughterBoard>) this.daughterBoardDao.findAll();
    }

    public void updateDaughterBoard(DaughterBoard daughterBoard) {
        this.daughterBoardDao.save(daughterBoard);
    }

    public void deleteDaughterBoard(long id) {
        this.daughterBoardDao.deleteById(id);
    }

    public List<DaughterBoard> getAllDaughterBoardsByManufacturer(String manufacturer) {
        return daughterBoardDao.findAllByManufacturer(manufacturer);
    }

    public List<DaughterBoard> getAllDaughterBoardsByEcr(String ecr) {
        return daughterBoardDao.findAllByEcr(ecr);
    }
}
