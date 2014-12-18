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
        SampleParkEntity parkenttity = new SampleParkEntity();
        parkenttity.setId(dto.getDetail().getId());
        parkenttity.setName(dto.getDetail().getName());
        parkenttity.setCountry(dto.getDetail().getCountry());
        parkenttity.setProvince(dto.getDetail().getProvince());
        parkenttity.setStreet(dto.getDetail().getStreet());
        parkenttity.setStreetnumber(dto.getDetail().getStreetnumber());
        parksDao.save(parkenttity);
    }

    public ParkPageDto getDto() {
        return dto;
    }

    public void setDto(ParkPageDto dto) {
        this.dto = dto;
    }

}
