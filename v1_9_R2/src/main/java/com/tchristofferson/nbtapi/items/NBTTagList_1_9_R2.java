package com.tchristofferson.nbtapi.items;

import java.util.List;

public class NBTTagList_1_9_R2 implements NBTTagList {

    private final net.minecraft.server.v1_9_R2.NBTTagList handle;

    public NBTTagList_1_9_R2(List<NBTBase> list) {
        this.handle = new net.minecraft.server.v1_9_R2.NBTTagList();

        for (NBTBase nbtBase : list) {
            handle.add((net.minecraft.server.v1_9_R2.NBTBase) nbtBase.getHandle());
        }
    }

    public void add(NBTBase nbtBase) {
        handle.add((net.minecraft.server.v1_9_R2.NBTBase) nbtBase.getHandle());
    }

    public NBTBase remove(int index) {
        return NBTTypeUtil_1_9_R2.getWrapper(handle.remove(index));
    }

    public NBTBase get(int index) {
        return NBTTypeUtil_1_9_R2.getWrapper(handle.get(index));
    }

    public boolean contains(NBTBase nbtBase) {
        for (int i = 0; i < handle.size(); i++) {
            if (handle.get(i).equals(nbtBase.getHandle())) return true;
        }

        return false;
    }

    public boolean isEmpty() {
        return handle.isEmpty();
    }

    public int getSize() {
        return handle.size();
    }

    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagList_1_9_R2 && handle.equals(((NBTTagList_1_9_R2) o).getHandle());
    }

}
