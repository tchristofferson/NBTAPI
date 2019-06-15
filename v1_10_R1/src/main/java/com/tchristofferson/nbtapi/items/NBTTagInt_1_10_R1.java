package com.tchristofferson.nbtapi.items;

public class NBTTagInt_1_10_R1 implements NBTTagInt {

    private final net.minecraft.server.v1_10_R1.NBTTagInt handle;

    public NBTTagInt_1_10_R1(int i) {
        this.handle = new net.minecraft.server.v1_10_R1.NBTTagInt(i);
    }

    @Override
    public int get() {
        return handle.e();
    }

    @Override
    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagInt_1_10_R1 && handle.equals(((NBTTagInt_1_10_R1) o).getHandle());
    }

}
