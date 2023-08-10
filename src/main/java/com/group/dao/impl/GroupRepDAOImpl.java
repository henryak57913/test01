package com.group.dao.impl;

import com.group.dao.GroupRepDAO;
import com.group.entity.GroupRep;
import com.group.repository.GroupRepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupRepDAOImpl implements GroupRepDAO {
    @Autowired
    GroupRepRepository groupRepRepository;

    @Override
    public void insert(GroupRep groupRep) {
        groupRepRepository.save(groupRep);
    }

    @Override
    public void update(Integer groupRepId, GroupRep groupRep) {
        groupRep.setGroupRepId(groupRepId);
        groupRepRepository.save(groupRep);
    }

    @Override
    public void delete(Integer groupRepId) {
        groupRepRepository.deleteById(groupRepId);
    }

    @Override
    public GroupRep getGroupRepByGroupRepId(Integer groupRepId) {
        GroupRep groupRep = groupRepRepository.findById(groupRepId).orElse(null);
        return groupRep;
    }

    @Override
    public List<GroupRep> getAll() {
        List<GroupRep> list = (List<GroupRep>) groupRepRepository.findAll();
        return list;
    }
}
