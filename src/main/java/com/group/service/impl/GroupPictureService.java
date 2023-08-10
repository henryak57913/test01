package com.group.service.impl;

import com.group.dao.GroupPictureDAO;
import com.group.entity.GroupPicture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupPictureService {

    @Autowired
    GroupPictureDAO groupPictureDAO;

    public void insert(GroupPicture groupPicture) {
        groupPictureDAO.insert(groupPicture);
    }

    public void update(Integer groupPicId, GroupPicture groupPicture) {
        if (getGroupPictureByGroupPicId(groupPicId) != null) {
            groupPictureDAO.update(groupPicId, groupPicture);
        }
    }

    public void delete(Integer groupPicId){
        groupPictureDAO.delete(groupPicId);
    }

    public GroupPicture getGroupPictureByGroupPicId(Integer groupPicId){
        return groupPictureDAO.getGroupPictureByGroupPicId(groupPicId);
    }

    public List<GroupPicture> getAll(){
        return groupPictureDAO.getAll();
    }
}
