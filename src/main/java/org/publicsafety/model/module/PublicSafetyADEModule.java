
package org.publicsafety.model.module;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.xml.namespace.QName;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;
import org.publicsafety.PublicSafetyADEContext;
import org.publicsafety.model.PublicSafetyDoor;
import org.publicsafety.model.PublicSafetyIntBuildingInstallation;
import org.publicsafety.model.PublicSafetyRoom;

public class PublicSafetyADEModule extends ADEModule {
    public static final PublicSafetyADEModule v1_0 = new PublicSafetyADEModule();
    private HashMap<String, Class<? extends AbstractFeature>> features = new HashMap();
    private HashSet<String> featureProperties;

    private PublicSafetyADEModule() {
        super("http://www.citygml.org/ade/publicsafety/2.0", "ps", "C:\\Users\\Mike\\Documents\\OGCStuff\\OGCProject\\publicsafetyade\\src\\main\\resources\\ADE-PublicSafety-ver03_1_1.xsd", CityGMLVersion.v2_0_0);
        this.features.put("PublicSafetyRoom", PublicSafetyRoom.class);
        this.features.put("PublicSafetyDoor", PublicSafetyDoor.class);
        this.features.put("PublicSafetyIntBuildingInstallation", PublicSafetyIntBuildingInstallation.class);
        this.featureProperties = new HashSet();
        this.featureProperties.add("PublicSafetyRoomProperty");
        this.featureProperties.add("PublicSafetyDoorProperty");
        this.featureProperties.add("PublicSafetyIntBuildingInstallationProperty");
    }

    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("org.publicsafety.jaxb");
    }



    @Override
    public URL getSchemaResource() {
        return PublicSafetyADEContext.class.getResource("/org/citygml/ade/noise/schema/xml/CityGML-NoiseADE.xsd");
    }
    @Override
    public boolean hasFeatureProperty(String name) {
        return this.featureProperties.contains(name);
    }
    @Override
    public boolean hasFeature(String name) {
        return this.features.containsKey(name);
    }
    @Override
    public Class<? extends AbstractFeature> getFeatureClass(String name) {
        return this.features.get(name);
    }
    @Override
    public QName getFeatureName(Class<? extends AbstractFeature> featureClass) {
        for (Entry<String, Class<? extends AbstractFeature>> entry : features.entrySet()) {
            if (entry.getValue() == featureClass)
                return new QName(getNamespaceURI(), entry.getKey());
        }

        return null;
    }
    @Override
    public Map<String, Class<? extends AbstractFeature>> getFeatures() {
        return new HashMap(this.features);
    }
    @Override
    public boolean isTopLevelFeature(String name) {
        return false;
    }
}
