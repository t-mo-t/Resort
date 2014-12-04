package org.thomasmore.oo3.course.resortui.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.ParkListDetailDto;
import org.thomasmore.oo3.course.resortui.model.ParkPageDto;

@Named(value = "park")
@RequestScoped
public class ParkController {
    
    private ParkPageDto dto;
    
    @PostConstruct
    public void init() {
        
        dto = new ParkPageDto();
        for (int i = 0; i < 10; i++) {
            ParkListDetailDto listDetail = new ParkListDetailDto();
            listDetail.setId("@"+i);
            listDetail.setName("P"+(i+1));
            dto.getList().add(listDetail);
        }
    }
        public void add(){
        dto.getDetail().setId("NEW");
        dto.getList().add(dto.getDetail());
    }

    public ParkPageDto getDto() {
        return dto;
    }

    public void setDto(ParkPageDto dto) {
        this.dto = dto;
    }
        
}
