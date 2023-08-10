package com.group.dao;

import com.group.entity.MemberDetail;

import java.util.List;

public interface MemberDetailDAO {
    void insert(MemberDetail memberDetail);
    void update(Integer detailId, MemberDetail memberDetail);
    void delete(Integer detailId);
    MemberDetail getMemberDetailBydetailId(Integer detailId);
    List<MemberDetail> getAll();
}
