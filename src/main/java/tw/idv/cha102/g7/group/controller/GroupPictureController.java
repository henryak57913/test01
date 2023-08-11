package tw.idv.cha102.g7.group.controller;

<<<<<<< HEAD:src/main/java/tw/idv/cha102/g7/group/controller/GroupPictureController.java
import tw.idv.cha102.g7.group.entity.GroupPicture;
import tw.idv.cha102.g7.group.service.GroupPictureService;
=======
import com.group.entity.GroupPicture;
import com.group.service.GroupPictureService;
>>>>>>> 284128e589a7f6c3592f1d8d5b454cdf16347e34:src/main/java/com/group/controller/GroupPictureController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupPictureController {

    @Autowired
    private GroupPictureService groupPictureService;

    @PostMapping("/groupPicture")
    public void insert(@RequestBody GroupPicture groupPicture){
        groupPictureService.insert(groupPicture);
    }

    @PutMapping("/groupPicture/{groupPicId}")
    public void update(@PathVariable Integer groupPicId,
                       @RequestBody GroupPicture groupPicture){
        groupPictureService.update(groupPicId ,groupPicture);
    }

    @DeleteMapping("/groupPicture/{groupPicId}")
    public void delete(@PathVariable Integer groupPicId){
        groupPictureService.delete(groupPicId);
    }

    @GetMapping("/groupPicture/{groupPicId}")
    public GroupPicture getGroupPictureByGroupPicId(@PathVariable Integer groupPicId){
        return groupPictureService.getGroupPictureByGroupPicId(groupPicId);
    }

    @GetMapping("/groupPicture/all")
    public List<GroupPicture> getAll(){
        return groupPictureService.getAll();
    }
}

