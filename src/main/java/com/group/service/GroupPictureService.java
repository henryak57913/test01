package com.group.service;

import com.group.entity.GroupPicture;

import java.util.List;

public interface GroupPictureService {

    void insert(GroupPicture groupPicture);

    void update(Integer groupPicId, GroupPicture groupPicture);

    void delete(Integer groupPicId);

    GroupPicture getGroupPictureByGroupPicId(Integer groupPicId);

    List<GroupPicture> getAll();
}
