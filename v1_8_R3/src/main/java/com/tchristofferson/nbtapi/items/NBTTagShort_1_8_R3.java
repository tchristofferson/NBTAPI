package com.tchristofferson.nbtapi.items;

public class NBTTagShort_1_8_R3 implements NBTTagShort {

    private final net.minecraft.server.v1_8_R3.NBTTagShort handle;

    public NBTTagShort_1_8_R3(short s) {
        this.handle = new net.minecraft.server.v1_8_R3.NBTTagShort(s);
    }

    public short get() {
        return handle.e();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagShort_1_8_R3 && handle.equals(((NBTTagShort_1_8_R3) o).getHandle());
    }

}
