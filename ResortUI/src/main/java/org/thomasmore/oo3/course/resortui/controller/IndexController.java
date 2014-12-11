package org.thomasmore.oo3.course.resortui.controller;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.IndexPageDto;
import org.thomasmore.oo3.course.resortui.sample.business.entity.SampleParkEntity;
import org.thomasmore.oo3.course.resortui.sample.dao.SampleParkDao;

@Named(value = "index")
@RequestScoped
public class IndexController {

    private IndexPageDto dto;
    
    @EJB
    private SampleParkDao parkDao;

    @PostConstruct
    public void init()
    {
        SampleParkEntity entity =  new SampleParkEntity();
        entity.setName("abc");
        try {
            parkDao.save(entity);
        }
        catch (Exception ex) {
            Logger.getLogger(IndexController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public IndexPageDto getDto() {
        return dto;
    }

    public void setDto(IndexPageDto dto) {
        this.dto = dto;
    }

}
