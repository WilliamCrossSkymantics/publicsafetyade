

package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class PublicSafetyIntBuildingInstallationProperty extends FeatureProperty<PublicSafetyIntBuildingInstallation> implements ADEModelObject {
    public PublicSafetyIntBuildingInstallationProperty() {
    }

    public PublicSafetyIntBuildingInstallationProperty(PublicSafetyIntBuildingInstallation publicSafetyIntBuildingInstallation) {
        super(publicSafetyIntBuildingInstallation);
    }

    public PublicSafetyIntBuildingInstallationProperty(String href) {
        super(href);
    }

    public PublicSafetyIntBuildingInstallation getPublicSafetyIntBuildingInstallation() {
        return (PublicSafetyIntBuildingInstallation)super.getObject();
    }

    public boolean isSetPublicSafetyIntBuildingInstallation() {
        return super.isSetObject();
    }

    public void setPublicSafetyIntBuildingInstallation(PublicSafetyIntBuildingInstallation PublicSafetyIntBuildingInstallation) {
        super.setObject(PublicSafetyIntBuildingInstallation);
    }

    public void unsetPublicSafetyIntBuildingInstallation() {
        super.unsetObject();
    }

    public Class<PublicSafetyIntBuildingInstallation> getAssociableClass() {
        return PublicSafetyIntBuildingInstallation.class;
    }

    public Object copy(CopyBuilder copyBuilder) {
        return this.copyTo(new PublicSafetyIntBuildingInstallationProperty(), copyBuilder);
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSafetyIntBuildingInstallationProperty copy = target == null ? new PublicSafetyIntBuildingInstallationProperty() : (PublicSafetyIntBuildingInstallationProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
