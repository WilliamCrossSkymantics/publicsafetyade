

package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class PublicSafetyRoomProperty extends FeatureProperty<PublicSafetyRoom> implements ADEModelObject {
    public PublicSafetyRoomProperty() {
    }

    public PublicSafetyRoomProperty(PublicSafetyRoom publicSafetyRoom) {
        super(publicSafetyRoom);
    }

    public PublicSafetyRoomProperty(String href) {
        super(href);
    }

    public PublicSafetyRoom getPublicSafetyRoom() {
        return (PublicSafetyRoom)super.getObject();
    }

    public boolean isSetPublicSafetyRoom() {
        return super.isSetObject();
    }

    public void setPublicSafetyRoom(PublicSafetyRoom PublicSafetyRoom) {
        super.setObject(PublicSafetyRoom);
    }

    public void unsetPublicSafetyRoom() {
        super.unsetObject();
    }

    @Override
    public Class<PublicSafetyRoom> getAssociableClass() {
        return PublicSafetyRoom.class;
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return this.copyTo(new PublicSafetyRoomProperty(), copyBuilder);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSafetyRoomProperty copy = target == null ? new PublicSafetyRoomProperty() : (PublicSafetyRoomProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
