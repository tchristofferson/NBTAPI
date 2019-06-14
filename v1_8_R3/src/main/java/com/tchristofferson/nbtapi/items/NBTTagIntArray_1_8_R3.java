package com.tchristofferson.nbtapi.items;

public class NBTTagIntArray_1_8_R3 implements NBTTagIntArray {

    private final net.minecraft.server.v1_8_R3.NBTTagIntArray handle;

    public NBTTagIntArray_1_8_R3(int[] i) {
        this.handle = new net.minecraft.server.v1_8_R3.NBTTagIntArray(i);
    }

    public int[] get() {
        return handle.c();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagIntArray_1_8_R3 && handle.equals(o);
    }

}
