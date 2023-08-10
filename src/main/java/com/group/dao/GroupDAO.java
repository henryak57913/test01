package com.group.dao;

import com.group.entity.Group;

import java.util.List;

public interface GroupDAO {
    void insert(Group group);
    void update(Integer groupId ,Group group);
    void delete(Integer groupId);
    Group getGroupByGroupId(Integer groupId);
    List<Group> getAll();
}
