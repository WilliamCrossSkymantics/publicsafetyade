
package org.publicsafety.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.feature.FeatureProperty;

public class PublicSafetyAlarmProperty extends FeatureProperty<PublicSafetyAlarm> implements ADEModelObject {
    public PublicSafetyAlarmProperty() {
    }

    public PublicSafetyAlarmProperty(PublicSafetyAlarm publicSafetyAlarm) {
        super(publicSafetyAlarm);
    }

    public PublicSafetyAlarmProperty(String href) {
        super(href);
    }

    public PublicSafetyAlarm getPublicSafetyAlarm() {
        return (PublicSafetyAlarm)super.getObject();
    }

    public boolean isSetPublicSafetyAlarm() {
        return super.isSetObject();
    }

    public void setPublicSafetyAlarm(PublicSafetyAlarm publicSafetyAlarm) {
        super.setObject(publicSafetyAlarm);
    }

    public void unsetPublicSafetyAlarm() {
        super.unsetObject();
    }

    public Class<PublicSafetyAlarm> getAssociableClass() {
        return PublicSafetyAlarm.class;
    }

    public Object copy(CopyBuilder copyBuilder) {
        return this.copyTo(new PublicSafetyAlarmProperty(), copyBuilder);
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSafetyAlarmProperty copy = target == null ? new PublicSafetyAlarmProperty() : (PublicSafetyAlarmProperty)target;
        return super.copyTo(copy, copyBuilder);
    }
}
