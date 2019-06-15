package com.tchristofferson.nbtapi.items;

public class NBTTagString_1_9_R2 implements NBTTagString {

    private final net.minecraft.server.v1_9_R2.NBTTagString handle;

    public NBTTagString_1_9_R2(String s) {
        this.handle = new net.minecraft.server.v1_9_R2.NBTTagString(s);
    }

    public String get() {
        return handle.a_();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagString_1_9_R2 && handle.equals(((NBTTagString_1_9_R2) o).getHandle());
    }

}
