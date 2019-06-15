package com.tchristofferson.nbtapi.items;

public class NBTTagIntArray_1_10_R1 implements NBTTagIntArray {

    private final net.minecraft.server.v1_10_R1.NBTTagIntArray handle;

    public NBTTagIntArray_1_10_R1(int[] i) {
        this.handle = new net.minecraft.server.v1_10_R1.NBTTagIntArray(i);
    }

    @Override
    public int[] get() {
        return handle.d();
    }

    @Override
    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagIntArray_1_10_R1 && handle.equals(((NBTTagIntArray_1_10_R1) o).getHandle());
    }

}
