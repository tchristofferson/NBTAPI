package com.tchristofferson.nbtapi.items;

public class NBTTagInt_1_11_R1 implements NBTTagInt {

    private final net.minecraft.server.v1_11_R1.NBTTagInt handle;

    public NBTTagInt_1_11_R1(int i) {
        this.handle = new net.minecraft.server.v1_11_R1.NBTTagInt(i);
    }

    public int get() {
        return handle.e();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagInt_1_11_R1 && handle.equals(((NBTTagInt_1_11_R1) o).getHandle());
    }

}
