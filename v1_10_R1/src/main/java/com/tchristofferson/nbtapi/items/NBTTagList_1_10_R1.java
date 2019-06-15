package com.tchristofferson.nbtapi.items;

import java.util.List;

public class NBTTagList_1_10_R1 implements NBTTagList {

    private final net.minecraft.server.v1_10_R1.NBTTagList handle;

    public NBTTagList_1_10_R1(List<NBTBase> list) {
        this.handle = new net.minecraft.server.v1_10_R1.NBTTagList();

        for (NBTBase nbtBase : list) {
            handle.add((net.minecraft.server.v1_10_R1.NBTBase) nbtBase.getHandle());
        }
    }

    @Override
    public void add(NBTBase nbtBase) {
        handle.add((net.minecraft.server.v1_10_R1.NBTBase) nbtBase.getHandle());
    }

    @Override
    public NBTBase remove(int index) {
        return NBTTypeUtil_1_10_R1.getWrapper(handle.remove(index));
    }

    @Override
    public NBTBase get(int index) {
        return NBTTypeUtil_1_10_R1.getWrapper(handle.get(index));
    }

    @Override
    public boolean contains(NBTBase nbtBase) {
        for (int i = 0; i < handle.size(); i++) {
            if (handle.get(i).equals(nbtBase.getHandle())) return true;
        }

        return false;
    }

    @Override
    public boolean isEmpty() {
        return handle.isEmpty();
    }

    @Override
    public int getSize() {
        return handle.size();
    }

    @Override
    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagList_1_10_R1 && handle.equals(((NBTTagList_1_10_R1) o).getHandle());
    }

}
