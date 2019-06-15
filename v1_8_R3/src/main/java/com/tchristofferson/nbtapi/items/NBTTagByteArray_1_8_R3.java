package com.tchristofferson.nbtapi.items;

public class NBTTagByteArray_1_8_R3 implements NBTTagByteArray {

    private final net.minecraft.server.v1_8_R3.NBTTagByteArray handle;

    public NBTTagByteArray_1_8_R3(byte[] b) {
        this.handle = new net.minecraft.server.v1_8_R3.NBTTagByteArray(b);
    }

    public Object getHandle() {
        return handle;
    }

    public byte[] get() {
        return handle.c();
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagByteArray_1_8_R3 && handle.equals(((NBTTagByteArray_1_8_R3) o).getHandle());
    }

}
