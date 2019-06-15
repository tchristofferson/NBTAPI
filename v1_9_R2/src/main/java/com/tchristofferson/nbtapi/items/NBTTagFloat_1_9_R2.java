package com.tchristofferson.nbtapi.items;

public class NBTTagFloat_1_9_R2 implements NBTTagFloat {

    private final net.minecraft.server.v1_9_R2.NBTTagFloat handle;

    public NBTTagFloat_1_9_R2(float f) {
        this.handle = new net.minecraft.server.v1_9_R2.NBTTagFloat(f);
    }

    public float get() {
        return handle.h();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagFloat_1_9_R2 && handle.equals(((NBTTagFloat_1_9_R2) o).getHandle());
    }

}
