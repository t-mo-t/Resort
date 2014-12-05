package org.thomasmore.oo3.course.resortui.controller;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.IndexPageDto;

@Named(value = "index")
@RequestScoped
public class IndexController {

    private IndexPageDto dto;

    @PostConstruct
    public void init() {
        
        Date date = new Date();
        System.out.println("IndexController - init");
    }

    public IndexPageDto getDto() {
        return dto;
    }

    public void setDto(IndexPageDto dto) {
        this.dto = dto;
    }

}
