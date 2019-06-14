package com.tchristofferson.nbtapi.items;

public class NBTTagLong_1_8_R3 implements NBTTagLong {

    private final net.minecraft.server.v1_8_R3.NBTTagLong handle;

    public NBTTagLong_1_8_R3(long l) {
        this.handle = new net.minecraft.server.v1_8_R3.NBTTagLong(l);
    }

    public long get() {
        return handle.c();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagLong_1_8_R3 && handle.equals(o);
    }

}
