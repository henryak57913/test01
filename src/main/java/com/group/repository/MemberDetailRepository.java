package com.group.repository;

import com.group.entity.GroupPicture;
import com.group.entity.MemberDetail;
import org.springframework.data.repository.CrudRepository;

public interface MemberDetailRepository extends CrudRepository<MemberDetail, Integer> {
}
