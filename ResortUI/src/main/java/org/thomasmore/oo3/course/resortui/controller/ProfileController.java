/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thomasmore.oo3.course.resortui.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.ProfilePageDto;

/**
 *
 * @author Gun
 */
@Named(value = "profile")
@RequestScoped
public class ProfileController {
 private ProfilePageDto dto=new ProfilePageDto();

    public ProfilePageDto getDto() {
        return dto;
    }

    public void setDto(ProfilePageDto dto) {
        this.dto = dto;
    }
 
 }

