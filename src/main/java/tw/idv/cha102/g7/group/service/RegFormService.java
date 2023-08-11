package tw.idv.cha102.g7.group.service;

import tw.idv.cha102.g7.group.dao.RegFormDAO;
import tw.idv.cha102.g7.group.entity.RegForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegFormService {
    @Autowired
    RegFormDAO regFormDAO;

    public void insert(RegForm regForm){
        regFormDAO.insert(regForm);
    }

    public void update(Integer formId, RegForm regForm){
        if(getRegFormByFormId(formId) != null) {
            regFormDAO.update(formId, regForm);
        } else {
            throw new RuntimeException();
        }
    }

    public void delete(Integer formId){
        regFormDAO.delete(formId);
    }

    public RegForm getRegFormByFormId(Integer formId){
        return regFormDAO.getRegFormByFormId(formId);
    }

    public List<RegForm> getAll(){
        return regFormDAO.getAll();
    }
}
