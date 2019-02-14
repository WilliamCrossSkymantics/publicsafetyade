
package org.publicsafety.walker;

import java.util.Iterator;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.building.AbstractOpening;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.feature.FeatureProperty;
import org.citygml4j.util.walker.FeatureWalker;
import org.publicsafety.model.*;

public class PublicSafetyFeatureWalker implements ADEWalker<FeatureWalker> {
    private FeatureWalker walker;

    public PublicSafetyFeatureWalker() {
    }

    public void setParentWalker(FeatureWalker featureWalker) {
        this.walker = featureWalker;
    }

    public void visit(PublicSafetyRoom publicSafetyRoom) {
        walker.visit((AbstractCityObject) publicSafetyRoom);
    }

    public void visit(PublicSafetyDoor publicSafetyDoor) {
        this.walker.visit((AbstractOpening) publicSafetyDoor);
    }

    public void visit(Hatch hatch) {
        this.walker.visit((AbstractOpening) hatch);
    }

    public void visit(PublicSafetyIntBuildingInstallation publicSafetyIntBuildingInstallation) {
        this.walker.visit((AbstractCityObject) publicSafetyIntBuildingInstallation);

        if (publicSafetyIntBuildingInstallation.isSetInstalledAlarm()) {
           for (PublicSafetyAlarmProperty alarmProperty : publicSafetyIntBuildingInstallation.getInstalledAlarm()) {
               walker.visit((FeatureProperty<PublicSafetyAlarm>) alarmProperty);
           }

        }


        if (publicSafetyIntBuildingInstallation.isSetknownHazards()) {
            for (PublicSafetyHazardProperty hazardProperty : publicSafetyIntBuildingInstallation.getknownHazards()) {
                walker.visit((FeatureProperty<PublicSafetyHazard>) hazardProperty);
            }
        }

    }

    public void visit(PublicSafetyRoomPropertyElement publicSafetyRoomPropertyElement) {
        this.walker.visit((FeatureProperty)publicSafetyRoomPropertyElement.getValue());
    }

    public void visit(PublicSafetyDoorPropertyElement publicSafetyDoorPropertyElement) {
        this.walker.visit((FeatureProperty)publicSafetyDoorPropertyElement.getValue());
    }

    public void visit(PublicSafetyIntBuildingInstallationPropertyElement publicSafetyIntBuildingInstallationPropertyElement) {
        this.walker.visit((FeatureProperty)publicSafetyIntBuildingInstallationPropertyElement.getValue());
    }
}
