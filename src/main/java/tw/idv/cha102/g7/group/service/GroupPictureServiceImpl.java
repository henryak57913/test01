package tw.idv.cha102.g7.group.service;

<<<<<<<< HEAD:src/main/java/tw/idv/cha102/g7/group/service/GroupPictureService.java
import tw.idv.cha102.g7.group.dao.GroupPictureDAO;
import tw.idv.cha102.g7.group.entity.GroupPicture;
========
import com.group.dao.GroupPictureDAO;
import com.group.entity.GroupPicture;
import com.group.service.GroupPictureService;
>>>>>>>> 284128e589a7f6c3592f1d8d5b454cdf16347e34:src/main/java/tw/idv/cha102/g7/group/service/GroupPictureServiceImpl.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupPictureServiceImpl implements GroupPictureService {

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
