
package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.util.bbox.BoundingBoxOptions;
import org.citygml4j.util.bbox.SimpleBoundingBoxCalculator;

public class PublicSafetyHazard extends AbstractFeature implements ADEModelObject {
    private String hazardLocation;
    private String hazardDescription;

    public PublicSafetyHazard() {
    }

    public PublicSafetyHazard(ADEModule module) {
        super(module);
    }

    public String getHazardLocation() {
        return this.hazardLocation;
    }

    public boolean isSetHazardLocation() {
        return this.hazardLocation != null;
    }

    public void setHazardLocation(String hazardLocation) {
        this.hazardLocation = hazardLocation;
    }

    public String getHazardDescription() {
        return this.hazardDescription;
    }

    public boolean isSetHazardDescription() {
        return this.hazardDescription != null;
    }

    public void setHazardDescription(String HazardDescription) {
        this.hazardDescription = this.hazardDescription;
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
        return this.copyTo(new PublicSafetyHazard(), copyBuilder);
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSafetyHazard copy = target == null ? new PublicSafetyHazard() : (PublicSafetyHazard)target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }
}
