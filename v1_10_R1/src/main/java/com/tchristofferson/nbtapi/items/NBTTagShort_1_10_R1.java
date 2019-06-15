package com.tchristofferson.nbtapi.items;

public class NBTTagShort_1_10_R1 implements NBTTagShort {

    private final net.minecraft.server.v1_10_R1.NBTTagShort handle;

    public NBTTagShort_1_10_R1(short s) {
        this.handle = new net.minecraft.server.v1_10_R1.NBTTagShort(s);
    }

    @Override
    public short get() {
        return handle.f();
    }

    @Override
    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagShort_1_10_R1 && handle.equals(((NBTTagShort_1_10_R1) o).getHandle());
    }

}
