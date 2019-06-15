package com.tchristofferson.nbtapi.items;

public class NBTTagString_1_10_R1 implements NBTTagString {

    private final net.minecraft.server.v1_10_R1.NBTTagString handle;

    public NBTTagString_1_10_R1(String s) {
        this.handle = new net.minecraft.server.v1_10_R1.NBTTagString(s);
    }

    @Override
    public String get() {
        return handle.c_();
    }

    @Override
    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagString_1_10_R1 && handle.equals(((NBTTagString_1_10_R1) o).getHandle());
    }

}
