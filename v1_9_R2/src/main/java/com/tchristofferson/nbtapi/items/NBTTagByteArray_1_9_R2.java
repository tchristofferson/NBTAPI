package com.tchristofferson.nbtapi.items;

public class NBTTagByteArray_1_9_R2 implements NBTTagByteArray {

    private final net.minecraft.server.v1_9_R2.NBTTagByteArray handle;

    public NBTTagByteArray_1_9_R2(byte[] b) {
        this.handle = new net.minecraft.server.v1_9_R2.NBTTagByteArray(b);
    }

    public byte[] get() {
        return handle.c();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagByteArray_1_9_R2 && handle.equals(((NBTTagByteArray_1_9_R2) o).getHandle());
    }

}
