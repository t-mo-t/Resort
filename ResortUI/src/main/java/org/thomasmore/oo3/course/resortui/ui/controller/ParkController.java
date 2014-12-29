

package org.thomasmore.oo3.course.resortui.ui.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.thomasmore.oo3.course.resortui.ui.model.ParkPageDto;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.ui.model.ParkListDetailDto;
import org.thomasmore.oo3.course.resortui.entity.ParkEntity;
import org.thomasmore.oo3.course.resortui.dao.ParkDao;

/**
 *
 * @author lucs
 */
@Named(value = "Park")

@RequestScoped
public class ParkController {

       private ParkPageDto dto;

    @EJB
    private ParkDao ParkDao;
    
    @PostConstruct
    public void init() {
        
        List<ParkEntity> Parks = ParkDao.listAll();
        dto = new ParkPageDto();
        
     for (ParkEntity Park : Parks) {
            ParkListDetailDto listDetail = new ParkListDetailDto();
            listDetail.setId(Park.getId());
            listDetail.setName(Park.getName());
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
