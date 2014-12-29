package org.thomasmore.oo3.course.resortui.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.thomasmore.oo3.course.resortui.model.ParkListDetailDto;
import org.thomasmore.oo3.course.resortui.entity.ParkEntity;
import org.thomasmore.oo3.course.resortui.model.ParkPageDto;
import org.thomasmore.oo3.course.resortui.dao.ParkDao;


@Named(value = "park")
@RequestScoped

public class ParkController {

    private ParkPageDto dto;
    @EJB
    private ParkDao parksDao;

    @PostConstruct
    public void init() {

        dto = new ParkPageDto();
        HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();

        String editId = req.getParameter("edit");

        ParkEntity parkEntity = parksDao.findById(editId);
        if (parkEntity != null) {
            dto.getDetail().setId(parkEntity.getId());
            dto.getDetail().setId(parkEntity.getName());
            dto.getDetail().setId(parkEntity.getCountry());
            dto.getDetail().setId(parkEntity.getProvince());
            dto.getDetail().setId(parkEntity.getStreet());
            parkEntity.setStreetnumber(dto.getDetail().getStreetnumber());

        }
        List<ParkEntity> parks = parksDao.listAll();
        for (ParkEntity park : parks) {
            ParkListDetailDto listDetail = new ParkListDetailDto();
            listDetail.setId(park.getId());
            listDetail.setName(park.getName());
            listDetail.setCountry(park.getCountry());
            listDetail.setProvince(park.getProvince());
            listDetail.setStreet(park.getStreet());
            listDetail.setStreetnumber(park.getStreetnumber());
            dto.getList().add(listDetail);
        }
    }

    public String add() {
        String id = dto.getDetail().getId();
        ParkEntity parkEntity = null;
        if (id != null) {
            parkEntity = parksDao.findById(id);
        }
        if (parkEntity == null) {
            parkEntity = new ParkEntity();
        }

        parkEntity.setId(dto.getDetail().getId());
        parkEntity.setName(dto.getDetail().getName());
        parkEntity.setCountry(dto.getDetail().getCountry());
        parkEntity.setProvince(dto.getDetail().getProvince());
        parkEntity.setStreet(dto.getDetail().getStreet());
        parkEntity.setStreetnumber(dto.getDetail().getStreetnumber());
        parksDao.save(parkEntity);
      return "bungalow.xhtml??faces-redirect=true"; 
    }

    public void remove() {
        String id = dto.getDetail().getId();
        ParkListDetailDto removeFromListobject = new ParkListDetailDto();
        for (ParkListDetailDto parkListDetailDto : dto.getList()) {
            if (parkListDetailDto.getId().equals(id)) {
                removeFromListobject = parkListDetailDto;
            }

        }
        dto.getList().remove(removeFromListobject);
        parksDao.deleteById(id);
    }

    public ParkPageDto getDto() {
        return dto;
    }

    public void setDto(ParkPageDto dto) {
        this.dto = dto;
    }
}
