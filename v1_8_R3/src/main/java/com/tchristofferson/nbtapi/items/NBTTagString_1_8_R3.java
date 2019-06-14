package com.tchristofferson.nbtapi.items;

public class NBTTagString_1_8_R3 implements NBTTagString {

    private final net.minecraft.server.v1_8_R3.NBTTagString handle;

    public NBTTagString_1_8_R3(String s) {
        this.handle = new net.minecraft.server.v1_8_R3.NBTTagString(s);
    }

    public String get() {
        return handle.a_();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagString_1_8_R3 && handle.equals(o);
    }

}
