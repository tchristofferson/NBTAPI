package com.tchristofferson.nbtapi.items;

public class NBTTagIntArray_1_11_R1 implements NBTTagIntArray {

    private final net.minecraft.server.v1_11_R1.NBTTagIntArray handle;

    public NBTTagIntArray_1_11_R1(int[] i) {
        this.handle = new net.minecraft.server.v1_11_R1.NBTTagIntArray(i);
    }

    public int[] get() {
        return handle.d();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagIntArray_1_11_R1 && handle.equals(((NBTTagIntArray_1_11_R1) o).getHandle());
    }

}
