package tw.idv.cha102.g7.group.service;

import tw.idv.cha102.g7.group.dao.GroupDAO;
import tw.idv.cha102.g7.group.entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupService {

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
