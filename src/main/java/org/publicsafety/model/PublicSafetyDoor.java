
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
import org.citygml4j.util.bbox.BoundingBoxOptions;
import org.citygml4j.util.bbox.SimpleBoundingBoxCalculator;
import org.citygml4j.util.lod.LodRepresentationBuilder;
import org.publicsafety.model.module.PublicSafetyADEModule;

public class PublicSafetyDoor extends AbstractOpening implements ADEModelObject {
    private DoorHandling doorHandling;
    private String doorMaterial;
    private DoorSwing doorSwing;
    private Boolean fireDoor;
    private String lockType;

    public PublicSafetyDoor() {
    }

    public PublicSafetyDoor(PublicSafetyADEModule module) {
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
        return this.copyTo(new PublicSafetyDoor(), copyBuilder);
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSafetyDoor copy = target == null ? new PublicSafetyDoor() : (PublicSafetyDoor)target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    public LodRepresentation getLodRepresentation() {
        return LodRepresentationBuilder.buildRepresentation(this);
    }

    public DoorHandling getDoorHandling() {
        return this.doorHandling;
    }

    public void setDoorHandling(DoorHandling doorHandling) {
        this.doorHandling = doorHandling;
    }

    public boolean isSetDoorHandling() {
        return this.doorHandling.value() != null;
    }

    public String getDoorMaterial() {
        return this.doorMaterial;
    }

    public void setDoorMaterial(String doorMaterial) {
        this.doorMaterial = doorMaterial;
    }

    public boolean isSetDoorMaterial() {
        return this.doorMaterial != null;
    }

    public DoorSwing getDoorSwing() {
        return this.doorSwing;
    }

    public void setDoorSwing(DoorSwing doorSwing) {
        this.doorSwing = doorSwing;
    }

    public boolean isSetDoorSwing() {
        return this.doorSwing.value() != null;
    }

    public Boolean getFireDoor() {
        return this.fireDoor;
    }

    public boolean isSetFireDoor() {
        return this.fireDoor != null;
    }

    public void setFireDoor(Boolean fireDoor) {
        this.fireDoor = fireDoor;
    }

    public String getLockType() {
        return this.lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public boolean isSetLockType() {
        return this.lockType != null;
    }
}
