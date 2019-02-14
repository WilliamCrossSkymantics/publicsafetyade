

package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.util.bbox.BoundingBoxOptions;
import org.citygml4j.util.bbox.SimpleBoundingBoxCalculator;
import org.citygml4j.util.lod.LodRepresentationBuilder;
import org.publicsafety.model.module.PublicSafetyADEModule;

public class PublicSafetyRoom extends AbstractCityObject implements ADEModelObject {
    private PsRoom roomType;

    public PublicSafetyRoom() {
    }

    public PublicSafetyRoom(PublicSafetyADEModule module) {
        super(module);
    }

    public boolean isSetRoomType() {
        return this.roomType != null;
    }

    public void setRoomType(PsRoom roomType) {
        this.roomType = roomType;
    }

    public PsRoom getRoomType() {
        return this.roomType;
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
        return this.copyTo(new PublicSafetyRoom(), copyBuilder);
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSafetyRoom copy = target == null ? new PublicSafetyRoom() : (PublicSafetyRoom)target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    public LodRepresentation getLodRepresentation() {
        return LodRepresentationBuilder.buildRepresentation(this);
    }
}
