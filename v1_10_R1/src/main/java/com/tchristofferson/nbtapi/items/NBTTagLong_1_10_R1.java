package com.tchristofferson.nbtapi.items;

public class NBTTagLong_1_10_R1 implements NBTTagLong {

    private final net.minecraft.server.v1_10_R1.NBTTagLong handle;

    public NBTTagLong_1_10_R1(long l) {
        this.handle = new net.minecraft.server.v1_10_R1.NBTTagLong(l);
    }

    @Override
    public long get() {
        return handle.d();
    }

    @Override
    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagLong_1_10_R1 && handle.equals(((NBTTagLong_1_10_R1) o).getHandle());
    }

}
