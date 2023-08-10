package com.group.service;

import com.group.entity.MemberDetail;

import java.util.List;

public interface MemberDetailService {

    void insert(MemberDetail memberDetail);

    void update(Integer detailId, MemberDetail memberDetail);

    void delete(Integer detailId);

    MemberDetail getMemberDetailByDetailId(Integer detailId);

    List<MemberDetail> getAll();
}
