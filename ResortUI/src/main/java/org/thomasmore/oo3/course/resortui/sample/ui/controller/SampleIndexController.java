/*
 * Copyright (C) 2014 lucs
 * Hier zijn wat extra comments...
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
package org.thomasmore.oo3.course.resortui.sample.ui.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.sample.business.entity.SampleParkEntity;
import org.thomasmore.oo3.course.resortui.sample.dao.SampleParkDao;
import org.thomasmore.oo3.course.resortui.sample.ui.model.SampleIndexPageDto;

/**
 *
 * @author lucs
 */
@Named(value = "sampleIndex")
@RequestScoped
public class SampleIndexController
{

    private SampleIndexPageDto dto;
    
    @EJB
    private SampleParkDao parkDao;

    @PostConstruct
    public void init()
    {
        SampleParkEntity entity =  new SampleParkEntity();
        entity.setName("abc");
        try {
            parkDao.save(entity);
        }
        catch (Exception ex) {
            Logger.getLogger(SampleIndexController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SampleIndexPageDto getDto()
    {
        return dto;
    }

    public void setDto(SampleIndexPageDto dto)
    {
        this.dto = dto;
    }

}
