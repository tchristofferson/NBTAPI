package com.tchristofferson.nbtapi.items;

public class NBTTagInt_1_9_R2 implements NBTTagInt {

    private final net.minecraft.server.v1_9_R2.NBTTagInt handle;

    public NBTTagInt_1_9_R2(int i) {
        this.handle = new net.minecraft.server.v1_9_R2.NBTTagInt(i);
    }

    public int get() {
        return handle.d();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagInt_1_9_R2 && handle.equals(((NBTTagInt_1_9_R2) o).getHandle());
    }

}
