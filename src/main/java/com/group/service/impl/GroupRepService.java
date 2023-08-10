package com.group.service.impl;

import com.group.dao.GroupRepDAO;
import com.group.entity.GroupRep;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GroupRepService {

    @Autowired
    private GroupRepDAO groupRepDAO;

    public void insert(GroupRep groupRep) {
        groupRepDAO.insert(groupRep);
    }

    public void update(Integer groupRepId, GroupRep groupRep) {
        if (getGroupRepByGroupRepId(groupRepId) != null) {
            groupRepDAO.update(groupRepId, groupRep);
        } else {
            throw new RuntimeException();
        }
    }

    public void delete(Integer groupRepId) {
        groupRepDAO.delete(groupRepId);
    }

    public GroupRep getGroupRepByGroupRepId(Integer groupRepId) {
        return groupRepDAO.getGroupRepByGroupRepId(groupRepId);
    }

    public List<GroupRep> getAll() {
        return groupRepDAO.getAll();
    }
}