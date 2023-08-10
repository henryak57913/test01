package com.group.service;

import com.group.entity.Group;

import java.util.List;

public interface GroupService {
    void insert(Group group);

    void update(Integer groupId, Group group);

    void delete(Integer groupId);

    Group getGroupByGroupId(Integer groupId);

    List<Group> getAll();
}
