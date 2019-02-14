package org.publicsafety.model;

public enum PsRoom {
    MEDICAL("Medical"),
    SECURITY("Security");

    private final String value;

    PsRoom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PsRoom fromValue(String v) {
        for (PsRoom c: PsRoom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
      return null;
    }

}
