
package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class PublicSafetyDoorPropertyElement extends ADEGenericApplicationProperty<PublicSafetyDoorProperty> {
    public PublicSafetyDoorPropertyElement() {
    }

    public PublicSafetyDoorPropertyElement(PublicSafetyDoorProperty property) {
        super(property);
    }

    public Object copy(CopyBuilder copyBuilder) {
        return this.copyTo(new PublicSafetyDoorPropertyElement(), copyBuilder);
    }
}
