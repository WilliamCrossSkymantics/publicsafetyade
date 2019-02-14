
package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class PublicSafetyRoomPropertyElement extends ADEGenericApplicationProperty<PublicSafetyRoomProperty> {
    public PublicSafetyRoomPropertyElement() {
    }

    public PublicSafetyRoomPropertyElement(PublicSafetyRoomProperty property) {
        super(property);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return this.copyTo(new PublicSafetyRoomPropertyElement(), copyBuilder);
    }
}
