

package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.building.AbstractOpening;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.util.bbox.BoundingBoxOptions;
import org.citygml4j.util.bbox.SimpleBoundingBoxCalculator;
import org.citygml4j.util.lod.LodRepresentationBuilder;

public class Hatch extends AbstractOpening implements ADEModelObject {
    private Boolean fireHatch;
    private HatchLocation hatchLocation;
    private Integer sizeLength;
    private Integer sizeWidth;

    public Hatch() {
    }

    public Hatch(ADEModule module) {
        super(module);
    }

    public void setHatchLocation(HatchLocation hatchLocation) {
        this.hatchLocation = hatchLocation;
    }

    public boolean isSetHatchLocation() {
        return this.hatchLocation != null;
    }

    public HatchLocation getHatchLocation() {
        return this.hatchLocation;
    }

    public Integer getSizeLength() {
        return this.sizeLength;
    }

    public void setSizeLength(Integer sizeLength) {
        this.sizeLength = sizeLength;
    }

    public boolean isSetSizeLength() {
        return this.sizeLength != null;
    }

    public Integer getSizeWidth() {
        return this.sizeWidth;
    }

    public void setSizeWidth(Integer sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public boolean isSetSizeWidth() {
        return this.sizeWidth != null;
    }

    public Boolean getFireHatch() {
        return this.fireHatch;
    }

    public void setFireHatch(Boolean fireHatch) {
        this.fireHatch = fireHatch;
    }

    public boolean isSetFireHatch() {
        return this.fireHatch != null;
    }

    public BoundingShape calcBoundedBy(BoundingBoxOptions options) {
        return SimpleBoundingBoxCalculator.calcBoundedBy(this, options);
    }

    public LodRepresentation getLodRepresentation() {
        return LodRepresentationBuilder.buildRepresentation(this);
    }

    public Object copy(CopyBuilder copyBuilder) {
        return this.copyTo(new Hatch(), copyBuilder);
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Hatch copy = target == null ? new Hatch() : (Hatch)target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
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
}
