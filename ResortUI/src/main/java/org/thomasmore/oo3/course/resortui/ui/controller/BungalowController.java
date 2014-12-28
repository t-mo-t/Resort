

package org.thomasmore.oo3.course.resortui.ui.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.thomasmore.oo3.course.resortui.ui.model.BungalowPageDto;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.ui.model.BungalowListDetailDto;
import org.thomasmore.oo3.course.resortui.entity.BungalowEntity;
import org.thomasmore.oo3.course.resortui.dao.BungalowDao;

/**
 *
 * @author lucs
 */
@Named(value = "test")

@RequestScoped
public class BungalowController {

       private BungalowPageDto dto;

    @EJB
    private BungalowDao bungalowDao;
    
    @PostConstruct
    public void init() {
        
        List<BungalowEntity> bungalows = bungalowDao.listAll();
        dto = new BungalowPageDto();
        
     for (BungalowEntity bungalow : bungalows) {
            BungalowListDetailDto listDetail = new BungalowListDetailDto();
            listDetail.setId(bungalow.getId());
            listDetail.setName(bungalow.getName());
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
