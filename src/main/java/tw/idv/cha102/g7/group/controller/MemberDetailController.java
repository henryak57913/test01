package tw.idv.cha102.g7.group.controller;

<<<<<<< HEAD:src/main/java/tw/idv/cha102/g7/group/controller/MemberDetailController.java
import tw.idv.cha102.g7.group.entity.MemberDetail;
import tw.idv.cha102.g7.group.service.MemberDetailService;
=======
import com.group.entity.MemberDetail;
import com.group.service.MemberDetailService;
>>>>>>> 284128e589a7f6c3592f1d8d5b454cdf16347e34:src/main/java/com/group/controller/MemberDetailController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberDetailController {
    @Autowired
    private MemberDetailService memberDetailService;

    @PostMapping("/memberDetail")
    public void insert(@RequestBody MemberDetail memberDetail){
        memberDetailService.insert(memberDetail);
    }

    @PutMapping("/memberDetail/{detailId}")
    public void update(@PathVariable Integer detailId,
                       @RequestBody MemberDetail memberDetail){
        memberDetailService.update(detailId, memberDetail);
    }

    @DeleteMapping("/memberDetail/{detailId}")
    public void delete(@PathVariable Integer detailId){
        memberDetailService.delete(detailId);
    }

    @GetMapping("/memberDetail/{detailId}")
    public MemberDetail getMemberDetailByDetailId(@PathVariable Integer detailId){
        return memberDetailService.getMemberDetailByDetailId(detailId);
    }

    @GetMapping("/memberDetail/all")
    public List<MemberDetail> getAll(){
        return memberDetailService.getAll();
    }
}
