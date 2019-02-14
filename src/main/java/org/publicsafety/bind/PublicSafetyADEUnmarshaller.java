package org.publicsafety.bind;

import java.util.concurrent.locks.ReentrantLock;
import javax.xml.bind.JAXBElement;

import net.opengis.schemas.test.ade.publicsafety._2.*;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.xlink.XLinkActuate;
import org.citygml4j.model.gml.xlink.XLinkShow;
import org.citygml4j.model.gml.xlink.XLinkType;
import org.citygml4j.util.mapper.CheckedTypeMapper;
import org.citygml4j.xml.io.reader.MissingADESchemaException;
import org.publicsafety.model.*;
import org.publicsafety.model.DoorHandling;
import org.publicsafety.model.DoorSwing;
import org.publicsafety.model.HatchLocation;
import org.publicsafety.model.PsLegend;
import org.publicsafety.model.PsRoom;
import org.publicsafety.model.module.PublicSafetyADEModule;

public class PublicSafetyADEUnmarshaller implements ADEUnmarshaller {
    private final ReentrantLock lock = new ReentrantLock();
    private ADEUnmarshallerHelper helper;
    private CheckedTypeMapper<ADEModelObject> typeMapper;

    public PublicSafetyADEUnmarshaller() {
    }

    private CheckedTypeMapper<ADEModelObject> getTypeMapper() {
        if (this.typeMapper == null) {
            this.lock.lock();

            try {
                if (this.typeMapper == null) {
                    this.typeMapper = CheckedTypeMapper.<ADEModelObject>create().with(PublicSafetyDoorType.class, this::unmarshalPublicSafetyDoor).with(PublicSafetyDoorPropertyType.class, this::unmarshalPublicSafetyDoorProperty).with(HatchType.class, this::unmarshalHatch).with(PublicSafetyIntBuildingInstallationType.class, this::unmarshalPublicSafetyIntBuildingInstallation).with(PublicSafetyIntBuildingInstallationPropertyType.class, this::unmarshalPublicSafetyIntBuildingInstallationProperty).with(PublicSafetyRoomType.class, this::unmarshalPublicSafetyRoom).with(PublicSafetyRoomPropertyType.class, this::unmarshalPublicSafetyRoomProperty).with(PublicSafetyAlarmType.class, this::unmarshalPublicSafetyAlarm).with(PublicSafetyAlarmPropertyType.class, this::unmarshalPublicSafetyAlarmProperty).with(PublicSafetyHazardType.class, this::unmarshalPublicSafetyHazard).with(PublicSafetyHazardPropertyType.class, this::unmarshalPublicSafetyHazardProperty).with(JAXBElement.class, this::unmarshal);
                }
            } finally {
                this.lock.unlock();
            }
        }

        return this.typeMapper;
    }

    private PublicSafetyHazardProperty unmarshalPublicSafetyHazardProperty(PublicSafetyHazardPropertyType src) throws MissingADESchemaException {
        PublicSafetyHazardProperty dest = new PublicSafetyHazardProperty();
        if (src.isSetPublicSafetyHazard()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getPublicSafetyHazard());
            if (object instanceof PublicSafetyHazard) {
                dest.setPublicSafetyHazard((PublicSafetyHazard)object);
            }
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(XLinkType.fromValue(src.getType().value()));
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
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));
        }

        if (src.isSetAcutate()) {
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));
        }

        return dest;
    }

    private PublicSafetyHazard unmarshalPublicSafetyHazard(PublicSafetyHazardType src) throws MissingADESchemaException {
        PublicSafetyHazard dest = new PublicSafetyHazard(PublicSafetyADEModule.v1_0);
        if (src.isSetHazardDescription()) {
            dest.setHazardDescription(src.getHazardDescription());
        }

        if (src.isSetHazardLocation()) {
            dest.setHazardLocation(src.getHazardLocation());
        }

        return dest;
    }

    private PublicSafetyAlarmProperty unmarshalPublicSafetyAlarmProperty(PublicSafetyAlarmPropertyType src) throws MissingADESchemaException {
        PublicSafetyAlarmProperty dest = new PublicSafetyAlarmProperty();
        if (src.isSetPublicSafetyAlarm()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getPublicSafetyAlarm());
            if (object instanceof PublicSafetyAlarm) {
                dest.setPublicSafetyAlarm((PublicSafetyAlarm)object);
            }
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(XLinkType.fromValue(src.getType().value()));
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
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));
        }

        if (src.isSetAcutate()) {
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));
        }

        return dest;
    }

    private PublicSafetyAlarm unmarshalPublicSafetyAlarm(PublicSafetyAlarmType src) throws MissingADESchemaException {
        PublicSafetyAlarm dest = new PublicSafetyAlarm(PublicSafetyADEModule.v1_0);
        if (src.isSetFireAlarm()) {
            dest.setFireAlarm(src.isFireAlarm());
        }

        return dest;
    }

    private PublicSafetyRoomProperty unmarshalPublicSafetyRoomProperty(PublicSafetyRoomPropertyType src) throws MissingADESchemaException {
        PublicSafetyRoomProperty dest = new PublicSafetyRoomProperty();
        if (src.isSetPublicSafetyRoom()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getPublicSafetyRoom());
            if (object instanceof PublicSafetyRoom) {
                dest.setPublicSafetyRoom((PublicSafetyRoom)object);
            }
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(XLinkType.fromValue(src.getType().value()));
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
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));
        }

        if (src.isSetActuate()) {
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));
        }

        return dest;
    }

    private PublicSafetyRoom unmarshalPublicSafetyRoom(PublicSafetyRoomType src) {
        PublicSafetyRoom dest = new PublicSafetyRoom(PublicSafetyADEModule.v1_0);
        if (src.isSetPublicSafetyRoom()) {
            dest.setRoomType(PsRoom.fromValue(src.getPublicSafetyRoomType().value()));
        }

        return dest;
    }

    private PublicSafetyIntBuildingInstallationProperty unmarshalPublicSafetyIntBuildingInstallationProperty(PublicSafetyIntBuildingInstallationPropertyType src) throws MissingADESchemaException {
        PublicSafetyIntBuildingInstallationProperty dest = new PublicSafetyIntBuildingInstallationProperty();
        if (src.isSetPublicSafetyIntBuildingInstallation()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getPublicSafetyIntBuildingInstallation());
            if (object instanceof PublicSafetyIntBuildingInstallationProperty) {
                dest.setPublicSafetyIntBuildingInstallation((PublicSafetyIntBuildingInstallation)object);
            }
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(XLinkType.fromValue(src.getType().value()));
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
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));
        }

        if (src.isSetActuate()) {
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));
        }

        return dest;
    }

    private PublicSafetyIntBuildingInstallation unmarshalPublicSafetyIntBuildingInstallation(PublicSafetyIntBuildingInstallationType src) throws MissingADESchemaException {
        PublicSafetyIntBuildingInstallation dest = new PublicSafetyIntBuildingInstallation(PublicSafetyADEModule.v1_0);
        if (src.isSetInstalledAlarm()) {
            dest.setPsInstallationLegend(PsLegend.fromValue(src.getPSInstallationLegend().value()));
        }

        if (src.isSetKnownHazards()) {
            for (PublicSafetyHazardPropertyType hazardProperty : src.getKnownHazards())
                dest.getknownHazards().add(unmarshalPublicSafetyHazardProperty(hazardProperty));
        }

        if (src.isSetInstalledAlarm()) {
            for (PublicSafetyAlarmPropertyType alarmProperty : src.getInstalledAlarm())
                dest.getInstalledAlarm().add(unmarshalPublicSafetyAlarmProperty(alarmProperty));
        }

        return dest;
    }

    private Hatch unmarshalHatch(HatchType src) throws MissingADESchemaException {
        Hatch dest = new Hatch(PublicSafetyADEModule.v1_0);
        if (src.isSetHatchLocation()) {
            dest.setHatchLocation(HatchLocation.fromValue(src.getHatchLocation().value()));
        }

        if (src.isSetFireHatch()) {
            dest.setFireHatch(src.isFireHatch());
        }

        if (src.isSetSizeLength()) {
            dest.setSizeLength(src.getSizeLength());
        }

        if (src.isSetSizeWidth()) {
            dest.setSizeWidth(src.getSizeWidth());
        }

        return dest;
    }

    private PublicSafetyDoor unmarshalPublicSafetyDoor(PublicSafetyDoorType src) throws MissingADESchemaException {
        PublicSafetyDoor dest = new PublicSafetyDoor(PublicSafetyADEModule.v1_0);
        if (src.isSetFireDoor()) {
            dest.setFireDoor(src.isFireDoor());
        }

        if (src.isSetDoorSwing()) {
            dest.setDoorSwing(DoorSwing.fromValue(src.getDoorSwing().value()));
        }

        if (src.isSetDoorMaterial()) {
            dest.setDoorMaterial(src.getDoorMaterial());
        }

        if (src.isSetDoorHandling()) {
            dest.setDoorHandling(DoorHandling.fromValue(src.getDoorHandling().value()));
        }

        if (src.isSetLockType()) {
            dest.setLockType(src.getLockType());
        }

        return dest;
    }

    private PublicSafetyDoorProperty unmarshalPublicSafetyDoorProperty(PublicSafetyDoorPropertyType src) throws MissingADESchemaException {
        PublicSafetyDoorProperty dest = new PublicSafetyDoorProperty();
        if (src.isSetPublicSafetyDoor()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getPublicSafetyDoor());
            if (object instanceof PublicSafetyDoor) {
                dest.setPublicSafetyDoor((PublicSafetyDoor)object);
            }
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(XLinkType.fromValue(src.getType().value()));
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
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));
        }

        if (src.isSetActuate()) {
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));
        }

        return dest;
    }

    @Override
    public void setADEUnmarshallerHelper(ADEUnmarshallerHelper helper) {
        this.helper = helper;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ADEModelObject unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
        final Object value = src.getValue();

        switch(src.getName().getLocalPart()) {
            case "PublicSafetyRoomProperty":
                return new PublicSafetyRoomPropertyElement(unmarshalPublicSafetyRoomProperty((PublicSafetyRoomPropertyType) value));
            case "PublicSafetyDoorProperty":
                return new PublicSafetyDoorPropertyElement(unmarshalPublicSafetyDoorProperty((PublicSafetyDoorPropertyType) value));
            case "PublicSafetyIntBuildingInstallationProperty":
                return new PublicSafetyIntBuildingInstallationPropertyElement((PublicSafetyIntBuildingInstallationProperty) value);
        }

        return unmarshal(value);
    }

    @Override
    public ADEModelObject unmarshal(Object src) throws MissingADESchemaException {
        return getTypeMapper().apply(src);
    }
}
