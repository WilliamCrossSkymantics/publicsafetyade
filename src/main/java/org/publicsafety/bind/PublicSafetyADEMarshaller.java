
package org.publicsafety.bind;

import java.util.concurrent.locks.ReentrantLock;
import javax.xml.bind.JAXBElement;


import net.opengis.schemas.test.ade.publicsafety._2.*;

import net.opengis.schemas.test.ade.publicsafety._2.DoorHandling;
import net.opengis.schemas.test.ade.publicsafety._2.DoorSwing;
import net.opengis.schemas.test.ade.publicsafety._2.HatchLocation;
import net.opengis.schemas.test.ade.publicsafety._2.PsLegend;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.util.mapper.TypeMapper;
import org.publicsafety.model.*;
import w3._1999.xlink.ActuateType;
import w3._1999.xlink.ShowType;
import w3._1999.xlink.TypeType;

public class PublicSafetyADEMarshaller implements ADEMarshaller {
    private final ReentrantLock lock = new ReentrantLock();
    private final ObjectFactory factory = new ObjectFactory();
    private ADEMarshallerHelper helper;
    private TypeMapper<JAXBElement<?>> elementMapper;
    private TypeMapper<Object> typeMapper;

    public PublicSafetyADEMarshaller() {
    }

    private TypeMapper<JAXBElement<?>> getElementMapper() {
        if (this.elementMapper == null) {
            this.lock.lock();

            try {
                if (this.elementMapper == null) {
                    this.elementMapper = TypeMapper.<JAXBElement<?>>create()
                            .with(PublicSafetyDoorPropertyElement.class, this::createPublicSafetyDoorPropertyElement)
                            .with(PublicSafetyDoorProperty.class, this::createPublicSafetyDoorProperty)
                            .with(PublicSafetyDoor.class, this::createPublicSafetyDoor)
                            .with(Hatch.class, this::createHatch)
                            .with(PublicSafetyRoomPropertyElement.class, this::createPublicSafetyRoomPropertyElement)
                            .with(PublicSafetyRoomProperty.class, this::createPublicSafetyRoomProperty)
                            .with(PublicSafetyRoom.class, this::createPublicSafetyRoom)
                            .with(PublicSafetyIntBuildingInstallationPropertyElement.class, this::createPublicSafetyIntBuildingInstallationPropertyElement)
                            .with(PublicSafetyIntBuildingInstallationProperty.class, this::createPublicSafetyIntBuildingInstallationProperty)
                            .with(PublicSafetyIntBuildingInstallation.class, this::createPublicSafetyIntBuildingInstallation);
                }
            } finally {
                this.lock.unlock();
            }
        }

        return this.elementMapper;
    }

    private JAXBElement<?> createPublicSafetyIntBuildingInstallationPropertyElement(PublicSafetyIntBuildingInstallationPropertyElement src) {
        return this.factory.createPublicSafetyIntBuildingInstallationProperty(this.marshalPublicSafetyIntBuildingInstallationProperty((PublicSafetyIntBuildingInstallationProperty)src.getValue()));
    }

    private JAXBElement<?> createPublicSafetyRoomPropertyElement(PublicSafetyRoomPropertyElement src) {
        return this.factory.createPublicSafetyRoomProperty(this.marshalPublicSafetyRoomProperty((PublicSafetyRoomProperty)src.getValue()));
    }

    private JAXBElement<?> createPublicSafetyDoorPropertyElement(PublicSafetyDoorPropertyElement src) {
        return this.factory.createPublicSafetyDoorProperty(this.marshalPublicSafetyDoorProperty((PublicSafetyDoorProperty)src.getValue()));
    }

    private TypeMapper<Object> getTypeMapper() {
        if (this.typeMapper == null) {
            this.lock.lock();

            try {
                if (this.typeMapper == null) {
                    this.typeMapper = TypeMapper.create().with(PublicSafetyDoor.class, this::marshalPublicSafetyDoor)
                            .with(PublicSafetyDoorProperty.class, this::marshalPublicSafetyDoorProperty)
                            .with(Hatch.class, this::marshalHatch)
                            .with(PublicSafetyIntBuildingInstallation.class, this::marshalPublicSafetyIntBuildingInstallation)
                            .with(PublicSafetyIntBuildingInstallationProperty.class, this::marshalPublicSafetyIntBuildingInstallationProperty)
                            .with(PublicSafetyRoom.class, this::marshalPublicSafetyRoom)
                            .with(PublicSafetyRoomProperty.class, this::marshalPublicSafetyRoomProperty)
                            .with(PublicSafetyAlarm.class, this::marshalPublicSafetyAlarm)
                            .with(PublicSafetyAlarmProperty.class, this::marshalPublicSafetyAlarmProperty)
                            .with(PublicSafetyHazard.class, this::marshalPublicSafetyHazard)
                            .with(PublicSafetyHazardProperty.class, this::marshalPublicSafetyHazardProperty);
                }
            } finally {
                this.lock.unlock();
            }
        }

        return this.typeMapper;
    }

    private JAXBElement<?> createPublicSafetyIntBuildingInstallation(PublicSafetyIntBuildingInstallation src) {
        return this.factory.createPublicSafetyIntBuildingInstallation(this.marshalPublicSafetyIntBuildingInstallation(src));
    }

    private JAXBElement<?> createPublicSafetyIntBuildingInstallationProperty(PublicSafetyIntBuildingInstallationProperty src) {
        return this.factory.createPublicSafetyIntBuildingInstallationProperty(this.marshalPublicSafetyIntBuildingInstallationProperty(src));
    }

    private JAXBElement<?> createPublicSafetyRoomProperty(PublicSafetyRoomProperty src) {
        return this.factory.createPublicSafetyRoomProperty(this.marshalPublicSafetyRoomProperty(src));
    }

    private JAXBElement<?> createPublicSafetyRoom(PublicSafetyRoom src) {
        return this.factory.createPublicSafetyRoom(this.marshalPublicSafetyRoom(src));
    }

    private JAXBElement<?> createHatch(Hatch src) {
        return this.factory.createHatch(this.marshalHatch(src));
    }

    private JAXBElement<?> createPublicSafetyDoor(PublicSafetyDoor src) {
        return this.factory.createPublicSafetyDoor(this.marshalPublicSafetyDoor(src));
    }

    private JAXBElement<?> createPublicSafetyDoorProperty(PublicSafetyDoorProperty src) {
        return this.factory.createPublicSafetyDoorProperty(this.marshalPublicSafetyDoorProperty(src));
    }

    private PublicSafetyHazardPropertyType marshalPublicSafetyHazardProperty(PublicSafetyHazardProperty src) {
        PublicSafetyHazardPropertyType dest = this.factory.createPublicSafetyHazardPropertyType();
        if (src.isSetPublicSafetyHazard()) {
            dest.setPublicSafetyHazard(this.marshalPublicSafetyHazard(src.getPublicSafetyHazard()));
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(TypeType.fromValue(src.getType().getValue()));
        }

        if (src.isSetHref()) {
            dest.setHref(src.getHref());
        }

        if (src.isSetRole()) {
            dest.setRole(src.getRole());
        }

        if (src.isSetArcrole()) {
            dest.setArcrole(src.getArcrole());
        }

        if (src.isSetTitle()) {
            dest.setTitle(src.getTitle());
        }

        if (src.isSetShow()) {
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));
        }

        if (src.isSetActuate()) {
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));
        }

        return dest;
    }

    private PublicSafetyHazardType marshalPublicSafetyHazard(PublicSafetyHazard src) {
        PublicSafetyHazardType dest = this.factory.createPublicSafetyHazardType();
        if (src.isSetHazardDescription()) {
            dest.setHazardDescription(src.getHazardDescription());
        }

        if (src.isSetHazardLocation()) {
            dest.setHazardLocation(src.getHazardLocation());
        }

        return dest;
    }

    private PublicSafetyAlarmPropertyType marshalPublicSafetyAlarmProperty(PublicSafetyAlarmProperty src) {
        PublicSafetyAlarmPropertyType dest = this.factory.createPublicSafetyAlarmPropertyType();
        if (src.isSetPublicSafetyAlarm()) {
            dest.setPublicSafetyAlarm(this.marshalPublicSafetyAlarm(src.getPublicSafetyAlarm()));
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(TypeType.fromValue(src.getType().getValue()));
        }

        if (src.isSetHref()) {
            dest.setHref(src.getHref());
        }

        if (src.isSetRole()) {
            dest.setRole(src.getRole());
        }

        if (src.isSetArcrole()) {
            dest.setArcrole(src.getArcrole());
        }

        if (src.isSetTitle()) {
            dest.setTitle(src.getTitle());
        }

        if (src.isSetShow()) {
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));
        }

        if (src.isSetActuate()) {
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));
        }

        return dest;
    }

    private PublicSafetyAlarmType marshalPublicSafetyAlarm(PublicSafetyAlarm src) {
        PublicSafetyAlarmType dest = this.factory.createPublicSafetyAlarmType();
        if (src.isSetFireAlarm()) {
            dest.setFireAlarm(src.getFireAlarm());
        }

        return dest;
    }

    private PublicSafetyRoomType marshalPublicSafetyRoom(PublicSafetyRoom src) {
        PublicSafetyRoomType dest = this.factory.createPublicSafetyRoomType();
        if (src.isSetRoomType()) {
            dest.setPublicSafetyRoomType(PsRoomType.fromValue(src.getRoomType().value()));
        }

        return dest;
    }

    private PublicSafetyRoomPropertyType marshalPublicSafetyRoomProperty(PublicSafetyRoomProperty src) {
        PublicSafetyRoomPropertyType dest = this.factory.createPublicSafetyRoomPropertyType();
        if (src.isSetPublicSafetyRoom()) {
            dest.setPublicSafetyRoom(this.marshalPublicSafetyRoom(src.getPublicSafetyRoom()));
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(TypeType.fromValue(src.getType().getValue()));
        }

        if (src.isSetHref()) {
            dest.setHref(src.getHref());
        }

        if (src.isSetRole()) {
            dest.setRole(src.getRole());
        }

        if (src.isSetArcrole()) {
            dest.setArcrole(src.getArcrole());
        }

        if (src.isSetTitle()) {
            dest.setTitle(src.getTitle());
        }

        if (src.isSetShow()) {
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));
        }

        if (src.isSetActuate()) {
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));
        }

        return dest;
    }

    private PublicSafetyIntBuildingInstallationPropertyType marshalPublicSafetyIntBuildingInstallationProperty(PublicSafetyIntBuildingInstallationProperty src) {
        PublicSafetyIntBuildingInstallationPropertyType dest = this.factory.createPublicSafetyIntBuildingInstallationPropertyType();
        if (src.isSetPublicSafetyIntBuildingInstallation()) {
            dest.setPublicSafetyIntBuildingInstallation(this.marshalPublicSafetyIntBuildingInstallation(src.getPublicSafetyIntBuildingInstallation()));
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(TypeType.fromValue(src.getType().getValue()));
        }

        if (src.isSetHref()) {
            dest.setHref(src.getHref());
        }

        if (src.isSetRole()) {
            dest.setRole(src.getRole());
        }

        if (src.isSetArcrole()) {
            dest.setArcrole(src.getArcrole());
        }

        if (src.isSetTitle()) {
            dest.setTitle(src.getTitle());
        }

        if (src.isSetShow()) {
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));
        }

        if (src.isSetActuate()) {
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));
        }

        return dest;
    }

    private PublicSafetyIntBuildingInstallationType marshalPublicSafetyIntBuildingInstallation(PublicSafetyIntBuildingInstallation src) {
        PublicSafetyIntBuildingInstallationType dest = this.factory.createPublicSafetyIntBuildingInstallationType();
        if (src.isSetPsLegend()) {
            dest.setPSInstallationLegend(PsLegend.fromValue(src.getPsLegend().value()));
        }


        if (src.isSetInstalledAlarm()) {
            for (PublicSafetyAlarmProperty alarm : src.getInstalledAlarm())
                dest.getInstalledAlarm().add(marshalPublicSafetyAlarmProperty(alarm));
        }

        if (src.isSetknownHazards()) {
            for (PublicSafetyHazardProperty hazard : src.getknownHazards())
                dest.getKnownHazards().add(marshalPublicSafetyHazardProperty(hazard));
        }

        return dest;
    }

    private HatchType marshalHatch(Hatch src) {
        HatchType dest = this.factory.createHatchType();
        if (src.isSetHatchLocation()) {
            dest.setHatchLocation(HatchLocation.fromValue(src.getHatchLocation().value()));
        }

        if (src.isSetSizeLength()) {
            dest.setSizeLength(src.getSizeLength());
        }

        if (src.isSetSizeWidth()) {
            dest.setSizeWidth(src.getSizeWidth());
        }

        return dest;
    }

    private PublicSafetyDoorPropertyType marshalPublicSafetyDoorProperty(PublicSafetyDoorProperty src) {
        PublicSafetyDoorPropertyType dest = this.factory.createPublicSafetyDoorPropertyType();
        if (src.isSetPublicSafetyDoor()) {
            dest.setPublicSafetyDoor(this.marshalPublicSafetyDoor(src.getPublicSafetyDoor()));
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(TypeType.fromValue(src.getType().getValue()));
        }

        if (src.isSetHref()) {
            dest.setHref(src.getHref());
        }

        if (src.isSetRole()) {
            dest.setRole(src.getRole());
        }

        if (src.isSetArcrole()) {
            dest.setArcrole(src.getArcrole());
        }

        if (src.isSetTitle()) {
            dest.setTitle(src.getTitle());
        }

        if (src.isSetShow()) {
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));
        }

        if (src.isSetActuate()) {
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));
        }

        return dest;
    }

    private PublicSafetyDoorType marshalPublicSafetyDoor(PublicSafetyDoor src) {
        PublicSafetyDoorType dest = this.factory.createPublicSafetyDoorType();
        if (src.isSetDoorHandling()) {
            dest.setDoorHandling(DoorHandling.valueOf(src.getDoorHandling().value()));
        }

        if (src.isSetDoorMaterial()) {
            dest.setDoorMaterial(src.getDoorMaterial());
        }

        if (src.isSetDoorSwing()) {
            dest.setDoorSwing(DoorSwing.valueOf(src.getDoorSwing().value()));
        }

        if (src.isSetDoorMaterial()) {
            dest.setDoorMaterial(src.getDoorMaterial());
        }

        if (src.isSetFireDoor()) {
            dest.setFireDoor(src.getFireDoor());
        }

        if (src.isSetLockType()) {
            dest.setLockType(src.getLockType());
        }

        return dest;
    }

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        return getElementMapper().apply(src);
    }

    @Override
    public Object marshal(ADEModelObject src) {
        return getTypeMapper().apply(src);
    }
}
