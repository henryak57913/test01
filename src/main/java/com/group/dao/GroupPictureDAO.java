package com.group.dao;

import com.group.entity.GroupPicture;

import java.util.List;

public interface GroupPictureDAO {
    void insert(GroupPicture groupPicture);
    void update(Integer groupPicId, GroupPicture groupPicture);
    void delete(Integer groupPicId);
    GroupPicture getGroupPictureByGroupPicId(Integer groupPicId);
    List<GroupPicture> getAll();
}
