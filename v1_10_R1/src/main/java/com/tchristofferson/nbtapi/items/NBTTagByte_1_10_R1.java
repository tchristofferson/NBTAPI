package com.tchristofferson.nbtapi.items;

public class NBTTagByte_1_10_R1 implements NBTTagByte {

    private final net.minecraft.server.v1_10_R1.NBTTagByte handle;

    public NBTTagByte_1_10_R1(byte b) {
        this.handle = new net.minecraft.server.v1_10_R1.NBTTagByte(b);
    }

    public byte get() {
        return handle.g();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagByte_1_10_R1 && handle.equals(((NBTTagByte_1_10_R1) o).getHandle());
    }

}
