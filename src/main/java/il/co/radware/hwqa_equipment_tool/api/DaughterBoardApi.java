package il.co.radware.hwqa_equipment_tool.api;

import il.co.radware.hwqa_equipment_tool.entities.DaughterBoard;
import il.co.radware.hwqa_equipment_tool.logic.DaughterBoardController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/daughter_boards")
public class DaughterBoardApi {

    @Autowired
    private DaughterBoardController daughterBoardController;

    @PostMapping
    public long createDaughterBoard(@RequestBody DaughterBoard daughterBoard) {
        return this.daughterBoardController.createDaughterBoard(daughterBoard);
    }


    @GetMapping("/{ID}")
    public DaughterBoard getDaughterBoard(@PathVariable("ID") long id) {
        return this.daughterBoardController.getDaughterBoard(id);
    }

    @GetMapping
    public List<DaughterBoard> getAllDaughterBoards() {
        return this.daughterBoardController.getAllDaughterBoards();
    }

    @GetMapping("/?manufacturer={manufacturer}")
    public List<DaughterBoard> getAllDaughterBoardsByManufacturer(@PathVariable String manufacturer) {
        return this.daughterBoardController.getAllDaughterBoardsByManufacturer(manufacturer);
    }

    @GetMapping("/?ecr={ecr}")
    public List<DaughterBoard> getAllDaughterBoardsByEcr(@PathVariable String ecr) {
        return this.daughterBoardController.getAllDaughterBoardsByEcr(ecr);
    }

    @PutMapping
    public void updateDaughterBoard(@RequestBody DaughterBoard daughterBoard) {
        this.daughterBoardController.updateDaughterBoard(daughterBoard);
    }


    @DeleteMapping("/{ID}")
    public void deleteDaughterBoard(@PathVariable("ID") long id) {
        this.daughterBoardController.deleteDaughterBoard(id);
    }


}
