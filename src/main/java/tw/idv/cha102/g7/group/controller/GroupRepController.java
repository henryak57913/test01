package tw.idv.cha102.g7.group.controller;

<<<<<<< HEAD:src/main/java/tw/idv/cha102/g7/group/controller/GroupRepController.java
import tw.idv.cha102.g7.group.entity.GroupRep;
import tw.idv.cha102.g7.group.service.GroupRepService;
=======
import com.group.entity.GroupRep;
import com.group.service.GroupRepService;
>>>>>>> 284128e589a7f6c3592f1d8d5b454cdf16347e34:src/main/java/com/group/controller/GroupRepController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupRepController {

    @Autowired
    private GroupRepService groupRepService;

    @PostMapping("/groupRep")
    public void insert(@RequestBody GroupRep groupRep){
        groupRepService.insert(groupRep);
    }

    @PutMapping("/groupRep/{groupRepId}")
    public void update(@PathVariable Integer groupRepId,
                       @RequestBody GroupRep groupRep){
        groupRepService.update(groupRepId, groupRep);
    }

    @DeleteMapping("/groupRep/{groupRepId}")
    public void delete(@PathVariable Integer groupRepId){
        groupRepService.delete(groupRepId);
    }

    @GetMapping("/groupRep/{groupRepId}")
    public GroupRep getGroupReqByGroupRepId(@PathVariable Integer groupRepId){
        return groupRepService.getGroupRepByGroupRepId(groupRepId);
    }

    @GetMapping("/groupRep/all")
    public List<GroupRep> getAll(){
        return groupRepService.getAll();
    }
}
