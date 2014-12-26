
package org.thomasmore.oo3.course.resortui.ui.model;



import java.util.LinkedList;
import java.util.List;

public class ParkPageDto {
    
    private  ParkDetailDto detail = new ParkDetailDto();
    private List<ParkListDetailDto> list = new LinkedList<>();
        
    
    public ParkDetailDto getDetail(){
        return detail;
    }
    
    public void setDetail(ParkDetailDto detail) {
        this.detail = detail;
    }
    
    public List<ParkListDetailDto> getList(){
        return list;
    }
    
    public void setList(List<ParkListDetailDto> list){
        this.list = list;
    }
    
    
}
