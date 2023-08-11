package tw.idv.cha102.g7.group.service;

<<<<<<<< HEAD:src/main/java/tw/idv/cha102/g7/group/service/GroupRepService.java
import tw.idv.cha102.g7.group.dao.GroupRepDAO;
import tw.idv.cha102.g7.group.entity.GroupRep;
========
import com.group.dao.GroupRepDAO;
import com.group.entity.GroupRep;
import com.group.service.GroupPictureService;
import com.group.service.GroupRepService;
>>>>>>>> 284128e589a7f6c3592f1d8d5b454cdf16347e34:src/main/java/tw/idv/cha102/g7/group/service/GroupRepServiceImpl.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupRepServiceImpl implements GroupRepService {

    @Autowired
    private GroupRepDAO groupRepDAO;

    public void insert(GroupRep groupRep) {
        groupRepDAO.insert(groupRep);
    }

    public void update(Integer groupRepId, GroupRep groupRep) {
        if (getGroupRepByGroupRepId(groupRepId) != null) {
            groupRepDAO.update(groupRepId, groupRep);
        } else {
            throw new RuntimeException();
        }
    }

    public void delete(Integer groupRepId) {
        groupRepDAO.delete(groupRepId);
    }


    public GroupRep getGroupRepByGroupRepId(Integer groupRepId) {
        return groupRepDAO.getGroupRepByGroupRepId(groupRepId);
    }

    public List<GroupRep> getAll() {
        return groupRepDAO.getAll();
    }

}
