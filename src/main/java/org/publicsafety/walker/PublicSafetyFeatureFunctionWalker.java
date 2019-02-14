//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.publicsafety.walker;

import java.util.Iterator;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.building.AbstractOpening;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.feature.FeatureProperty;
import org.citygml4j.util.walker.FeatureFunctionWalker;
import org.publicsafety.model.*;

public class PublicSafetyFeatureFunctionWalker<T> implements ADEWalker<FeatureFunctionWalker<T>> {
    private FeatureFunctionWalker<T> walker;

    public PublicSafetyFeatureFunctionWalker() {
    }

    public void setParentWalker(FeatureFunctionWalker<T> walker) {
        this.walker = walker;
    }

    public T apply(PublicSafetyDoor publicSafetyDoor) {
        return this.walker.apply((AbstractOpening) publicSafetyDoor);
    }

    public T apply(PublicSafetyRoom publicSafetyRoom) {
        return this.walker.apply((AbstractCityObject) publicSafetyRoom);
    }

    public T apply(Hatch hatch) {
        return this.walker.apply((AbstractOpening) hatch);
    }

    public T apply(PublicSafetyIntBuildingInstallation publicSafetyIntBuildingInstallation) {
        T object = this.walker.apply((AbstractCityObject) publicSafetyIntBuildingInstallation);
        if (object != null)
            return object;

            if (publicSafetyIntBuildingInstallation.isSetknownHazards()) {
                for (PublicSafetyHazardProperty hazardProperty : publicSafetyIntBuildingInstallation.getknownHazards()) {
                    object = walker.apply((FeatureProperty<?>) hazardProperty);
                    if (object != null)
                        return object;
                }
            }

            if (publicSafetyIntBuildingInstallation.isSetInstalledAlarm()) {
                for (PublicSafetyHazardProperty hazardProperty : publicSafetyIntBuildingInstallation.getknownHazards()) {
                    object = walker.apply((FeatureProperty<?>) hazardProperty);
                    if (object != null)
                        return object;
                }
            }

            return null;
        }



    public T apply(PublicSafetyDoorPropertyElement publicSafetyDoorPropertyElement) {
        return this.walker.apply((FeatureProperty<?>)publicSafetyDoorPropertyElement.getValue());
    }

    public T apply(PublicSafetyRoomPropertyElement publicSafetyRoomPropertyElement) {
        return this.walker.apply((FeatureProperty<?>)publicSafetyRoomPropertyElement.getValue());
    }

    public T apply(PublicSafetyIntBuildingInstallationPropertyElement publicSafetyIntBuildingInstallationPropertyElement) {
        return this.walker.apply((FeatureProperty<?>)publicSafetyIntBuildingInstallationPropertyElement.getValue());
    }
}
