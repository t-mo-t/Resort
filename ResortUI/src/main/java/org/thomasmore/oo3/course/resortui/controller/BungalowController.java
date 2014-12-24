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
import org.thomasmore.oo3.course.resortui.model.BungalowPageDto;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.BungalowDetailDto;
import org.thomasmore.oo3.course.resortui.model.BungalowListDetailDto;
import org.thomasmore.oo3.course.resortui.entity.BungalowEntity;
import org.thomasmore.oo3.course.resortui.dao.BungalowDao;
import org.thomasmore.oo3.course.resortui.dao.ParkDao;
import org.thomasmore.oo3.course.resortui.entity.ParkEntity;

/**
 *
 * @author lucs
 */
@Named(value = "bungalow")
@RequestScoped
public class BungalowController {

    private BungalowPageDto dto;
    @EJB
    private BungalowDao bungalowsDao;
    @EJB
    private ParkDao parkDao;
    @PostConstruct
    public void init() {
        List<ParkEntity> parks = parkDao.listAll();
        for (ParkEntity park : parks) {
            dto.getParkList().add(park.getName());
        }
        List<BungalowEntity> bungalows=bungalowsDao.listAll();
        dto = new BungalowPageDto();
        
        for (BungalowEntity bungalow : bungalows) {
            BungalowListDetailDto listDetail = new BungalowListDetailDto();
            listDetail.setId(bungalow.getId());
            listDetail.setName(bungalow.getName());
            listDetail.setCode(bungalow.getCode());
            listDetail.setMaxcustomers(bungalow.getMaxcustomers());
            listDetail.setType(bungalow.getType());
            listDetail.setDescription(bungalow.getDescription());
            listDetail.setDishwasher(bungalow.isDishwasher());
            listDetail.setJacuzzi(bungalow.isJacuzzi());
            listDetail.setSauna(bungalow.isSauna());
            listDetail.setSunbed(bungalow.isSunbed());
            listDetail.setPark(bungalow.getPark());
            dto.getList().add(listDetail);
        }
    }
    

    public void add(){
        dto.getDetail().setId(UUID.randomUUID().toString());
        dto.getList().add(dto.getDetail());
        BungalowEntity bungalowentity = new BungalowEntity();
        bungalowentity.setId(dto.getDetail().getId());
        bungalowentity.setName(dto.getDetail().getName());
        bungalowentity.setCode(dto.getDetail().getCode());
        bungalowentity.setMaxcustomers(dto.getDetail().getMaxcustomers());
        bungalowentity.setType(dto.getDetail().getType());
        bungalowentity.setDescription(dto.getDetail().getDescription());
        bungalowentity.setDishwasher(dto.getDetail().isDishwasher());
        bungalowentity.setJacuzzi(dto.getDetail().isJacuzzi());
        bungalowentity.setSauna(dto.getDetail().isSauna());
        bungalowentity.setSunbed(dto.getDetail().isSunbed());
        bungalowsDao.save(bungalowentity);
    }
    
    

    public BungalowPageDto getDto() {
        return dto;
    }

    public void setDto(BungalowPageDto dto) {
        this.dto = dto;
    }

}
