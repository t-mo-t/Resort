/*
 * Copyright (C) 2014 lucs
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.thomasmore.oo3.course.resortui.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.thomasmore.oo3.course.resortui.model.ParkPageDto;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.business.entity.ParkEntity;
import org.thomasmore.oo3.course.resortui.dao.ParkDao;
import org.thomasmore.oo3.course.resortui.model.ParkDetailDto;
import org.thomasmore.oo3.course.resortui.model.ParkListDetailDto;

/**
 *
 * @author raf en marnix ook
 */
@Named(value = "park")
@RequestScoped
public class ParkController {

    private ParkPageDto dto;

    @EJB
    private ParkDao parksDao;

    @PostConstruct
    public void init() {

        List<ParkEntity> parks = parksDao.listAll();
        dto = new ParkPageDto();

        for (ParkEntity park : parks) {
            ParkListDetailDto listDetail = new ParkListDetailDto();
            listDetail.setName(park.getName());
            listDetail.setId(park.getId());
            listDetail.setNumber(park.getNumber());
            listDetail.setCountry(park.getCountry());
            listDetail.setCity(park.getCity());
            listDetail.setClosingFrom(park.getClosingFrom());
            listDetail.setClosingTill(park.getClosingTill());
            dto.getList().add(listDetail);

        }
    }

    public void add() {

        ParkDetailDto detailDto = dto.getDetail();
        ParkEntity parkEntity = new ParkEntity();
        parkEntity.setName(detailDto.getName());
        parkEntity.setId(UUID.randomUUID().toString());
        parkEntity.setNumber(detailDto.getNumber());
        parkEntity.setCountry(detailDto.getCountry());
        parkEntity.setCity(detailDto.getCity());
        parkEntity.setClosingFrom(detailDto.getClosingFrom());
        parkEntity.setClosingTill(detailDto.getClosingTill());

        parksDao.save(parkEntity);
    }

    public ParkPageDto getDto() {
        return dto;
    }

    public void setDto(ParkPageDto dto) {
        this.dto = dto;
    }

}
