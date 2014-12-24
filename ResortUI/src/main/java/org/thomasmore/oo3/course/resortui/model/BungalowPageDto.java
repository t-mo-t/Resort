package org.thomasmore.oo3.course.resortui.model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lucs
 */
public class BungalowPageDto {

    private BungalowDetailDto detail = new BungalowDetailDto();
    private List<String> parkList = new LinkedList<>();
    private List<BungalowListDetailDto> list = new LinkedList<>();

    public BungalowDetailDto getDetail() {
        return detail;
    }

    public void setDetail(BungalowDetailDto detail) {
        this.detail = detail;
    }

    public List<BungalowListDetailDto> getList() {
        return list;
    }

    public void setList(List<BungalowListDetailDto> list) {
        this.list = list;
    }

    public List<String> getParkList() {
        return parkList;
    }

    public void setParkList(List<String> parkList) {
        this.parkList = parkList;
    }
    

}
