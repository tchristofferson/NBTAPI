package com.tchristofferson.nbtapi.items;

public class NBTTagByte_1_8_R3 implements NBTTagByte {

    private final net.minecraft.server.v1_8_R3.NBTTagByte handle;

    public NBTTagByte_1_8_R3(byte b) {
        this.handle = new net.minecraft.server.v1_8_R3.NBTTagByte(b);
    }

    public Object getHandle() {
        return handle;
    }

    public byte get() {
        return handle.f();
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagByte_1_8_R3 && handle.equals(o);
    }

}
