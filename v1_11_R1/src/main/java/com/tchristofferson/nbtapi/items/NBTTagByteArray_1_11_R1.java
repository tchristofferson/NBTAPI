package com.tchristofferson.nbtapi.items;

public class NBTTagByteArray_1_11_R1 implements NBTTagByteArray {

    private final net.minecraft.server.v1_11_R1.NBTTagByteArray handle;

    public NBTTagByteArray_1_11_R1(byte[] b) {
        this.handle = new net.minecraft.server.v1_11_R1.NBTTagByteArray(b);
    }

    public byte[] get() {
        return handle.c();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagByteArray_1_11_R1 && handle.equals(((NBTTagByteArray_1_11_R1) o).getHandle());
    }

}
