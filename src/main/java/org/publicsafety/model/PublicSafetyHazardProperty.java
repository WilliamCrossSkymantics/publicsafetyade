
package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class PublicSafetyHazardProperty extends FeatureProperty<PublicSafetyHazard> implements ADEModelObject {
    public PublicSafetyHazardProperty() {
    }

    public PublicSafetyHazardProperty(PublicSafetyHazard publicSafetyHazard) {
        super(publicSafetyHazard);
    }

    public PublicSafetyHazardProperty(String href) {
        super(href);
    }

    public PublicSafetyHazard getPublicSafetyHazard() {
        return (PublicSafetyHazard)super.getObject();
    }

    public boolean isSetPublicSafetyHazard() {
        return super.isSetObject();
    }

    public void setPublicSafetyHazard(PublicSafetyHazard publicSafetyHazard) {
        super.setObject(publicSafetyHazard);
    }

    public void unsetPublicSafetyHazard() {
        super.unsetObject();
    }

    public Class<PublicSafetyHazard> getAssociableClass() {
        return PublicSafetyHazard.class;
    }

    public Object copy(CopyBuilder copyBuilder) {
        return this.copyTo(new PublicSafetyHazardProperty(), copyBuilder);
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSafetyHazardProperty copy = target == null ? new PublicSafetyHazardProperty() : (PublicSafetyHazardProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
