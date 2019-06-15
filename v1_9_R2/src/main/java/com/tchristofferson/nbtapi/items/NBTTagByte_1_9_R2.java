package com.tchristofferson.nbtapi.items;

public class NBTTagByte_1_9_R2 implements NBTTagByte {

    private final net.minecraft.server.v1_9_R2.NBTTagByte handle;

    public NBTTagByte_1_9_R2(byte b) {
        this.handle = new net.minecraft.server.v1_9_R2.NBTTagByte(b);
    }

    public byte get() {
        return handle.f();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagByte_1_9_R2 && handle.equals(((NBTTagByte_1_9_R2) o).getHandle());
    }

}
