package com.tchristofferson.nbtapi.items;

public class NBTTagFloat_1_8_R3 implements NBTTagFloat {

    private final net.minecraft.server.v1_8_R3.NBTTagFloat handle;

    public NBTTagFloat_1_8_R3(float f) {
        this.handle = new net.minecraft.server.v1_8_R3.NBTTagFloat(f);
    }

    public float get() {
        return handle.h();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagFloat_1_8_R3 && handle.equals(o);
    }

}
