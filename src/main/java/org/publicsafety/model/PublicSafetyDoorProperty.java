
package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class PublicSafetyDoorProperty extends FeatureProperty<PublicSafetyDoor> implements ADEModelObject {
    public PublicSafetyDoorProperty() {
    }

    public PublicSafetyDoorProperty(PublicSafetyDoor publicSafetyDoor) {
        super(publicSafetyDoor);
    }

    public PublicSafetyDoorProperty(String href) {
        super(href);
    }

    public PublicSafetyDoor getPublicSafetyDoor() {
        return (PublicSafetyDoor)super.getObject();
    }

    public boolean isSetPublicSafetyDoor() {
        return super.isSetObject();
    }

    public void setPublicSafetyDoor(PublicSafetyDoor publicSafetyDoor) {
        super.setObject(publicSafetyDoor);
    }

    public void unsetPublicSafetyDoor() {
        super.unsetObject();
    }

    public Class<PublicSafetyDoor> getAssociableClass() {
        return PublicSafetyDoor.class;
    }

    public Object copy(CopyBuilder copyBuilder) {
        return this.copyTo(new PublicSafetyDoorProperty(), copyBuilder);
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSafetyDoorProperty copy = target == null ? new PublicSafetyDoorProperty() : (PublicSafetyDoorProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
