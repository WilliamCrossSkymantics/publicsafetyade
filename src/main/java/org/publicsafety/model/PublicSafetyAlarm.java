
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

public class PublicSafetyAlarm extends AbstractFeature implements ADEModelObject {
    private Boolean fireAlarm;

    public PublicSafetyAlarm() {
    }

    public PublicSafetyAlarm(ADEModule module) {
        super(module);
    }

    public Boolean getFireAlarm() {
        return this.fireAlarm;
    }

    public boolean isSetFireAlarm() {
        return this.fireAlarm != null;
    }

    public void setFireAlarm(Boolean fireAlarm) {
        this.fireAlarm = fireAlarm;
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
        return this.copyTo(new PublicSafetyAlarm(), copyBuilder);
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSafetyAlarm copy = target == null ? new PublicSafetyAlarm() : (PublicSafetyAlarm)target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }
}
