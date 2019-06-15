package com.tchristofferson.nbtapi.items;

public class NBTTagFloat_1_10_R1 implements NBTTagFloat {

    private final net.minecraft.server.v1_10_R1.NBTTagFloat handle;

    public NBTTagFloat_1_10_R1(float f) {
        this.handle = new net.minecraft.server.v1_10_R1.NBTTagFloat(f);
    }

    @Override
    public float get() {
        return handle.i();
    }

    @Override
    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagFloat_1_10_R1 && handle.equals(((NBTTagFloat_1_10_R1) o).getHandle());
    }

}
