package com.group.dao.impl;

import com.group.dao.RegFormDAO;
import com.group.entity.RegForm;
import com.group.repository.RegFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegFormImpl implements RegFormDAO {
    @Autowired
    RegFormRepository regFormRepository;
    @Override
    public void insert(RegForm regForm) {
        regFormRepository.save(regForm);
    }

    @Override
    public void update(Integer formId, RegForm regForm) {
        regForm.setFormId(formId);
        regFormRepository.save(regForm);
    }

    @Override
    public void delete(Integer formId) {
        regFormRepository.deleteById(formId);
    }

    @Override
    public RegForm getRegFormByFormId(Integer formId) {
        return regFormRepository.findById(formId).orElse(null);
    }

    @Override
    public List<RegForm> getAll() {
        return (List<RegForm>) regFormRepository.findAll();
    }
}
