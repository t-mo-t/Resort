package org.thomasmore.oo3.course.resortui.controller;

import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.ParkListDetailDto;
import org.thomasmore.oo3.course.resortui.sample.business.entity.SampleParkEntity;
import org.thomasmore.oo3.course.resortui.model.ParkPageDto;
import org.thomasmore.oo3.course.resortui.sample.business.enitity.ParkEntity;
import org.thomasmore.oo3.course.resortui.sample.dao.SampleParkDao;

@Named(value = "park")
@RequestScoped
public class ParkController {

    private ParkPageDto dto;
    @EJB
    private SampleParkDao parksDao;

    @PostConstruct
    public void init() {
        List<SampleParkEntity> parks = parksDao.listAll();
        dto = new ParkPageDto();
        for (SampleParkEntity park : parks) {
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

    public void add() {
        dto.getDetail().setId(UUID.randomUUID().toString());
        dto.getList().add(dto.getDetail());
        SampleParkEntity parkentity = new SampleParkEntity();
        parkentity.setId(dto.getDetail().getId());
        parkentity.setName(dto.getDetail().getName());
        parkentity.setCountry(dto.getDetail().getCountry());
        parkentity.setProvince(dto.getDetail().getProvince());
        parkentity.setStreet(dto.getDetail().getStreet());
        parkentity.setStreetnumber(dto.getDetail().getStreetnumber());
        parksDao.save(parkentity);
    }

   /* public void remove() {verwijderen uit databank en lijst
        String id = dto.getDetail().getId();
        ParkListDetailDto removeFromListobject = new ParkListDetailDto();
        for (ParkListDetailDto parkListDetailDto : dto.getList()) {
               if(parkListDetailDto.getId().equals(id)){
                   removeFromListobject = parkListDetailDto;
               }
            
        }
        dto.getList().remove(removeFromListobject);
        parksDao.deleteById(id);
    }*/

    public ParkPageDto getDto() {
        return dto;
    }

    public void setDto(ParkPageDto dto) {
        this.dto = dto;
    }

}
