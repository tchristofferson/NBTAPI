package com.tchristofferson.nbtapi.items;

public class NBTTagIntArray_1_9_R2 implements NBTTagIntArray {

    private final net.minecraft.server.v1_9_R2.NBTTagIntArray handle;

    public NBTTagIntArray_1_9_R2(int[] i) {
        this.handle = new net.minecraft.server.v1_9_R2.NBTTagIntArray(i);
    }

    public int[] get() {
        return handle.c();
    }

    public Object getHandle() {
        return handle;
    }

}
