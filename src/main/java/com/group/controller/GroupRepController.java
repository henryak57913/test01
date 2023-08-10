package com.group.controller;

import com.group.entity.GroupRep;
import com.group.service.impl.GroupRepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
