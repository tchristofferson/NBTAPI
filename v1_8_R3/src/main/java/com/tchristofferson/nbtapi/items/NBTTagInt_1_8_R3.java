package com.tchristofferson.nbtapi.items;

public class NBTTagInt_1_8_R3 implements NBTTagInt {

    private final net.minecraft.server.v1_8_R3.NBTTagInt handle;

    public NBTTagInt_1_8_R3(int i) {
        this.handle = new net.minecraft.server.v1_8_R3.NBTTagInt(i);
    }

    public int get() {
        return handle.d();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagInt_1_8_R3 && handle.equals(o);
    }

}
