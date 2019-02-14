package org.publicsafety.model;

public enum HatchLocation {
    CEILING("Ceiling"),
    FLOOR("Floor");

    private final String value;

    private HatchLocation(String v) {
        this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static HatchLocation fromValue(String v) {

        for(HatchLocation c : HatchLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }

        return null;
    }
}