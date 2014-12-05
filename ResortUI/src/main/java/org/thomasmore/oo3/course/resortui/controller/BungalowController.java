package org.thomasmore.oo3.course.resortui.controller;

import java.util.Date;
import javax.annotation.PostConstruct;
import org.thomasmore.oo3.course.resortui.model.BungalowPageDto;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.BungalowDetailDto;
import org.thomasmore.oo3.course.resortui.model.BungalowListDetailDto;

/**
 *
 * @author lucs
 */
@Named(value = "bungalow")
@RequestScoped
public class BungalowController {

    private BungalowPageDto dto;

    @PostConstruct
    public void init() {
        
        
        dto = new BungalowPageDto();
        
        for (int i = 0; i < 10; i++) {
            BungalowListDetailDto listDetail = new BungalowListDetailDto();
            listDetail.setId("@"+i);
            listDetail.setName("B"+(i+1));
            dto.getList().add(listDetail);
        }
    }

    public void add(){
        dto.getDetail().setId("NEW");
        dto.getList().add(dto.getDetail());
    }
    
    

    public BungalowPageDto getDto() {
        return dto;
    }

    public void setDto(BungalowPageDto dto) {
        this.dto = dto;
    }

}
