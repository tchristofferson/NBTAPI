package com.tchristofferson.nbtapi.items;

public class NBTTagDouble_1_10_R1 implements NBTTagDouble {

    private final net.minecraft.server.v1_10_R1.NBTTagDouble handle;

    public NBTTagDouble_1_10_R1(double d) {
        this.handle = new net.minecraft.server.v1_10_R1.NBTTagDouble(d);
    }

    @Override
    public double get() {
        return handle.h();
    }

    @Override
    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagDouble_1_10_R1 && handle.equals(((NBTTagDouble_1_10_R1) o).getHandle());
    }

}
