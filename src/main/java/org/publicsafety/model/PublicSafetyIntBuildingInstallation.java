
package org.publicsafety.model;

import java.util.List;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.util.bbox.BoundingBoxOptions;
import org.citygml4j.util.bbox.SimpleBoundingBoxCalculator;
import org.citygml4j.util.lod.LodRepresentationBuilder;

public class PublicSafetyIntBuildingInstallation extends AbstractCityObject implements ADEModelObject {
    private PsLegend psInstallationLegend;
    private List<PublicSafetyAlarmProperty> installedAlarm;
    private List<PublicSafetyHazardProperty> knownHazards;

    public PublicSafetyIntBuildingInstallation() {
    }

    public PublicSafetyIntBuildingInstallation(ADEModule module) {
        super(module);
    }

    public BoundingShape calcBoundedBy(BoundingBoxOptions options) {
        return SimpleBoundingBoxCalculator.calcBoundedBy(this, options);
    }

    public void accept(FeatureVisitor visitor) {
        visitor.visit(this);
    }

    public <T> T accept(FeatureFunctor<T> visitor) {
        return visitor.apply(this);
    }

    public void accept(GMLVisitor visitor) {
        visitor.visit(this);
    }

    public <T> T accept(GMLFunctor<T> visitor) {
        return visitor.apply(this);
    }

    public Object copy(CopyBuilder copyBuilder) {
        return this.copyTo(new PublicSafetyIntBuildingInstallation(), copyBuilder);
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSafetyIntBuildingInstallation copy = target == null ? new PublicSafetyIntBuildingInstallation() : (PublicSafetyIntBuildingInstallation)target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    public LodRepresentation getLodRepresentation() {
        return LodRepresentationBuilder.buildRepresentation(this);
    }

    public PsLegend getPsLegend() {
        return this.psInstallationLegend;
    }

    public void setPsInstallationLegend(PsLegend psLegend) {
        this.psInstallationLegend = psLegend;
    }

    public boolean isSetPsLegend() {
        return this.psInstallationLegend != null;
    }

    public void setInstalledAlarm(List<PublicSafetyAlarmProperty> installedAlarm) {
        this.installedAlarm = installedAlarm;
    }

    public boolean isSetInstalledAlarm() {
        return this.installedAlarm != null && !this.installedAlarm.isEmpty();
    }

    public void addInstalledAlarm(PublicSafetyAlarmProperty installedAlarm) {
        if (this.installedAlarm == null) {
            this.installedAlarm = new ChildList(this);
        }

    }

    public List<PublicSafetyAlarmProperty> getInstalledAlarm() {
        if (this.installedAlarm == null) {
            this.installedAlarm = new ChildList(this);
        }

        return this.installedAlarm;
    }

    public void setKnownHazards(List<PublicSafetyHazardProperty> knownHazards) {
        this.knownHazards = knownHazards;
    }

    public boolean isSetknownHazards() {
        return this.knownHazards != null && !this.knownHazards.isEmpty();
    }

    public void addknownHazards(PublicSafetyHazardProperty knownHazards) {
        if (this.knownHazards == null) {
            this.knownHazards = new ChildList(this);
        }

    }

    public List<PublicSafetyHazardProperty> getknownHazards() {
        if (this.knownHazards == null) {
            this.knownHazards = new ChildList(this);
        }

        return this.knownHazards;
    }
}