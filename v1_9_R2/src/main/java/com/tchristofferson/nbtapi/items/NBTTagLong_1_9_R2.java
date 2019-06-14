package com.tchristofferson.nbtapi.items;

public class NBTTagLong_1_9_R2 implements NBTTagLong {

    private final net.minecraft.server.v1_9_R2.NBTTagLong handle;

    public NBTTagLong_1_9_R2(long l) {
        this.handle = new net.minecraft.server.v1_9_R2.NBTTagLong(l);
    }

    public long get() {
        return handle.c();
    }

    public Object getHandle() {
        return handle;
    }

}
