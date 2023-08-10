package com.group.dao;

import com.group.entity.RegForm;

import java.util.List;

public interface RegFormDAO {
    void insert(RegForm regForm);
    void update(Integer formId ,RegForm regForm);
    void delete(Integer formId);
    RegForm getRegFormByFormId(Integer formId);
    List<RegForm> getAll();
}
