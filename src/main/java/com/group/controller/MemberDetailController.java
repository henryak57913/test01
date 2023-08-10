package com.group.controller;

import com.group.entity.MemberDetail;
import com.group.service.impl.MemberDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
