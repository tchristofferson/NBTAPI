package com.tchristofferson.nbtapi.items;

public class NBTTagShort_1_9_R2 implements NBTTagShort {

    private final net.minecraft.server.v1_9_R2.NBTTagShort handle;

    public NBTTagShort_1_9_R2(short s) {
        this.handle = new net.minecraft.server.v1_9_R2.NBTTagShort(s);
    }

    public short get() {
        return handle.e();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagShort_1_9_R2 && handle.equals(((NBTTagShort_1_9_R2) o).getHandle());
    }

}
