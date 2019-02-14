package org.publicsafety.model;

public enum DoorSwing {
    INWARD("Inward"),
    OUTWARD("Outward");

    private final String value;

    private DoorSwing(String v) {
        this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static DoorSwing fromValue(String v) {

        for(DoorSwing c: DoorSwing.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }

        return null;
    }
}