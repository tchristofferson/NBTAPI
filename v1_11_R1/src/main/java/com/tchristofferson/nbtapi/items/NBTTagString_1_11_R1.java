package com.tchristofferson.nbtapi.items;

public class NBTTagString_1_11_R1 implements NBTTagString {

    private final net.minecraft.server.v1_11_R1.NBTTagString handle;

    public NBTTagString_1_11_R1(String s) {
        this.handle = new net.minecraft.server.v1_11_R1.NBTTagString(s);
    }

    public String get() {
        return handle.c_();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagString_1_11_R1 && handle.equals(((NBTTagString_1_11_R1) o).getHandle());
    }

}
