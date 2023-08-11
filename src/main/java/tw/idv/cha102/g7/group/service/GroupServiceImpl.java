package tw.idv.cha102.g7.group.service;

<<<<<<<< HEAD:src/main/java/tw/idv/cha102/g7/group/service/GroupService.java
import tw.idv.cha102.g7.group.dao.GroupDAO;
import tw.idv.cha102.g7.group.entity.Group;
========
import com.group.dao.GroupDAO;
import com.group.entity.Group;
import com.group.service.GroupService;
>>>>>>>> 284128e589a7f6c3592f1d8d5b454cdf16347e34:src/main/java/tw/idv/cha102/g7/group/service/GroupServiceImpl.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDAO groupDAO;

    public void insert(Group group){
        groupDAO.insert(group);
    }

    public void update(Integer groupId, Group group){
        if(getGroupByGroupId(groupId) != null) {
            groupDAO.update(groupId, group);
        } else {
            throw new RuntimeException();
        }
    }

    public void delete(Integer groupId){
        groupDAO.delete(groupId);
    }

    public Group getGroupByGroupId(Integer groupId){
        return groupDAO.getGroupByGroupId(groupId);
    }

    public List<Group> getAll(){
        return groupDAO.getAll();
    }
}
