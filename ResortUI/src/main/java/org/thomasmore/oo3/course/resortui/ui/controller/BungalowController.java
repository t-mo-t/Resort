

package org.thomasmore.oo3.course.resortui.ui.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.thomasmore.oo3.course.resortui.ui.model.BungalowPageDto;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.thomasmore.oo3.course.resortui.ui.model.BungalowListDetailDto;
import org.thomasmore.oo3.course.resortui.entity.BungalowEntity;
import org.thomasmore.oo3.course.resortui.dao.BungalowDao;

/**
 *
 * @author lucs
 */
@Named(value = "Bungalow")

@RequestScoped
public class BungalowController {

       private BungalowPageDto dto;

    @EJB
    private BungalowDao bungalowDao;
    
@PostConstruct
    
//Je gaat deze parameter uitlezen en in de details van de dto opvullen
public void init() {
        dto = new BungalowPageDto();

        HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String editId = req.getParameter("edit");

        BungalowEntity be = bungalowDao.findById(editId);
        if (be != null) {
            dto.getDetail().setId(be.getId());
            dto.getDetail().setName(be.getName());
        }

        List<BungalowEntity> bungalows = bungalowDao.listAll();


        for (BungalowEntity bungalow : bungalows) {
            BungalowListDetailDto listDetail = new BungalowListDetailDto();
            listDetail.setId(bungalow.getId());
            listDetail.setName(bungalow.getName());
            dto.getList().add(listDetail);
        }

    }

  public String save() {
        String id = dto.getDetail().getId();
        BungalowEntity be = null;
        if (id != null) {
            be = bungalowDao.findById(id);
        }
        if (be == null) {
            be = new BungalowEntity();
        }
        be.setName(dto.getDetail().getName());
        bungalowDao.save(be);

        // Forces page refresh
        return "bungalow.xhtml??faces-redirect=true";
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
