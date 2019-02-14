package org.publicsafety.model;

public enum PsLegend {
    FIRE_SUPPRESION("Fire Suppresion"),
    PREPLAN("Preplan"),
    ALARM_DETECTORS("AlarmDetectors"),
    FEATURE_SHUTOFF("FeatureShutoff"),
    VERTICAL_ACCESS_FEATURE("VerticalAccessFeature"),
    KEY_KNOX_BOX("KeyKnoxBox");

    private final String value;


    PsLegend(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PsLegend fromValue(String v) {
        for (PsLegend c : PsLegend.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        return null;
    }
}
