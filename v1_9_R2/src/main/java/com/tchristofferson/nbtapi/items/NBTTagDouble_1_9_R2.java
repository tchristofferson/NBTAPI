package com.tchristofferson.nbtapi.items;

public class NBTTagDouble_1_9_R2 implements NBTTagDouble {

    private final net.minecraft.server.v1_9_R2.NBTTagDouble handle;

    public NBTTagDouble_1_9_R2(double d) {
        this.handle = new net.minecraft.server.v1_9_R2.NBTTagDouble(d);
    }

    public double get() {
        return handle.g();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagDouble_1_9_R2 && handle.equals(((NBTTagDouble_1_9_R2) o).getHandle());
    }

}
