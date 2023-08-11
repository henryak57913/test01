package tw.idv.cha102.g7.group.service;

<<<<<<<< HEAD:src/main/java/tw/idv/cha102/g7/group/service/MemberDetailService.java
import tw.idv.cha102.g7.group.dao.MemberDetailDAO;
import tw.idv.cha102.g7.group.entity.MemberDetail;
========
import com.group.dao.MemberDetailDAO;
import com.group.entity.MemberDetail;
import com.group.service.MemberDetailService;
>>>>>>>> 284128e589a7f6c3592f1d8d5b454cdf16347e34:src/main/java/tw/idv/cha102/g7/group/service/MemberDetailServiceImpl.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemberDetailServiceImpl implements MemberDetailService {
    @Autowired
    MemberDetailDAO memberDetailDAO;

    public void insert(MemberDetail memberDetail){
        memberDetailDAO.insert(memberDetail);
    }

    public void update(Integer detailId, MemberDetail memberDetail){
        if(getMemberDetailByDetailId(detailId) != null) {
            memberDetailDAO.update(detailId, memberDetail);
        } else {
            throw new RuntimeException();
        }
    }

    public void delete(Integer detailId){
        memberDetailDAO.delete(detailId);
    }

    public MemberDetail getMemberDetailByDetailId(Integer detailId){
        return memberDetailDAO.getMemberDetailBydetailId(detailId);
    }

    public List<MemberDetail> getAll(){
        return memberDetailDAO.getAll();
    }
}
