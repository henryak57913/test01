package tw.idv.cha102.g7.group.service;

import tw.idv.cha102.g7.group.dao.MemberDetailDAO;
import tw.idv.cha102.g7.group.entity.MemberDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberDetailService {
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
