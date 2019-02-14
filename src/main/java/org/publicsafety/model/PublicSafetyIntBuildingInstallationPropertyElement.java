

package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class PublicSafetyIntBuildingInstallationPropertyElement extends ADEGenericApplicationProperty<PublicSafetyIntBuildingInstallationProperty> {
    public PublicSafetyIntBuildingInstallationPropertyElement() {
    }

    public PublicSafetyIntBuildingInstallationPropertyElement(PublicSafetyIntBuildingInstallationProperty property) {
        super(property);
    }

    public Object copy(CopyBuilder copyBuilder) {
        return this.copyTo(new PublicSafetyIntBuildingInstallationPropertyElement(), copyBuilder);
    }
}
