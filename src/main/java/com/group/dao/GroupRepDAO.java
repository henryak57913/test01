package com.group.dao;

import com.group.entity.GroupRep;

import java.util.List;

public interface GroupRepDAO {
    void insert(GroupRep groupRep);
    void update(Integer groupRepId, GroupRep groupRep);
    void delete(Integer groupRepId);
    GroupRep getGroupRepByGroupRepId(Integer groupRepId);
    List<GroupRep> getAll();
}
