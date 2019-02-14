
package org.publicsafety.model;

public enum DoorHandling {
    LEFT("Left"),
    RIGHT("Right");

    private final String value;

    private DoorHandling(String v) {
        this.value = v;
    }

    public String value() {
        return this.value;
    }


    public static DoorHandling fromValue(String v) {
        for (DoorHandling c: DoorHandling.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }

        return null;
    }
}
