package com.tchristofferson.nbtapi.items;

public class NBTTagShort_1_11_R1 implements NBTTagShort {

    private final net.minecraft.server.v1_11_R1.NBTTagShort handle;

    public NBTTagShort_1_11_R1(short s) {
        this.handle = new net.minecraft.server.v1_11_R1.NBTTagShort(s);
    }

    public short get() {
        return handle.f();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagShort_1_11_R1 && handle.equals(((NBTTagShort_1_11_R1) o).getHandle());
    }

}
