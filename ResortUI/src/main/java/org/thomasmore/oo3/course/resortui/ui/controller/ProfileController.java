
package org.thomasmore.oo3.course.resortui.ui.controller;

/**
 *
 * @author Moegie
 */

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.ui.model.ProfileDto;
import org.thomasmore.oo3.course.resortui.ui.model.SessionDto;
import org.thomasmore.oo3.course.resortui.ui.model.ProfileDto;
import org.thomasmore.oo3.course.resortui.ui.model.SessionDto;

@Named(value="profile")
@RequestScoped
public class ProfileController {
    private ProfileDto dto;
    
    @Inject
    private SessionDto sessionDto;
    
    @PostConstruct
    public void init(){
        dto = new ProfileDto();
        
        
    }

    public ProfileDto getDto() {
        return dto;
    }

    public void setDto(ProfileDto dto) {
        this.dto = dto;
    }

    public SessionDto getSessionDto() {
        return sessionDto;
    }

    public void setSessionDto(SessionDto sessionDto) {
        this.sessionDto = sessionDto;
    }
    
    
}
