
package org.thomasmore.oo3.course.resortui.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.doa.ParkDao;
import org.thomasmore.oo3.course.resortui.entity.ParkEntity;
import org.thomasmore.oo3.course.resortui.model.BungalowListDetailDto;
import org.thomasmore.oo3.course.resortui.model.BungalowPageDto;
import org.thomasmore.oo3.course.resortui.model.ParkListDetailDto;
import org.thomasmore.oo3.course.resortui.model.ParkPageDto;

/**
 *
 * @author Jasper & Nico
 */

@Named(value = "park")
@RequestScoped
public class ParkController {
    
     private ParkPageDto dto;
     
     @EJB
    private ParkDao parkDao;
     
     @PostConstruct
    public void init() {
        
        List<ParkEntity> parks = parkDao.listAll();
        dto = new ParkPageDto();
        for (ParkEntity park : parks) {
            ParkListDetailDto listDetail = new ParkListDetailDto();
            listDetail.setId(park.getId());
            listDetail.setName(park.getName());
            dto.getList().add(listDetail);
        }
        /*for (int i = 0; i < 10; i++) {
            ParkListDetailDto listDetail = new ParkListDetailDto();
            listDetail.setId("@"+i);
            listDetail.setName("B"+(i+1));//clarification needed!
            dto.getList().add(listDetail);
        }*/
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
