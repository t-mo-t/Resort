
package org.thomasmore.oo3.course.resortui.controller;

import org.thomasmore.oo3.course.resortui.model.ProfilePageDto;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named(value="profile")
@RequestScoped
public class ProfileController {
    private ProfilePageDto dto = new ProfilePageDto();

    public ProfilePageDto getDto() {
        return dto;
    }

    public void setDto(ProfilePageDto dto) {
        this.dto = dto;
    }
    
    
}
