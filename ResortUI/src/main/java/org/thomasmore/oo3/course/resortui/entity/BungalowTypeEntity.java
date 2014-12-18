package org.thomasmore.oo3.course.resortui.entity;

/**
 *
 * @author Pepijn Mores
 */
public class BungalowTypeEntity extends BasicEntity {

    private BungalowEntity bungalowEntity;
    private String type;

    public BungalowEntity getBungalowEntity() {
        return bungalowEntity;
    }

    public String getType() {
        return type;
    }

    public void setBungalowEntity(BungalowEntity bungalowEntity) {
        this.bungalowEntity = bungalowEntity;
    }

    public void setType(String type) {
        this.type = type;
    }

}
