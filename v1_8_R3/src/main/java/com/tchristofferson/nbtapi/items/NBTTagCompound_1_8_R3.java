package com.tchristofferson.nbtapi.items;

import net.minecraft.server.v1_8_R3.NBTTagList;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class NBTTagCompound_1_8_R3 implements NBTTagCompound {

    private net.minecraft.server.v1_8_R3.NBTTagCompound handle;

    public NBTTagCompound_1_8_R3(ItemStack itemStack) {
        this.handle = CraftItemStack.asNMSCopy(itemStack).getTag();
    }

    public net.minecraft.server.v1_8_R3.NBTTagCompound getHandle() {
        return handle;
    }

    public void setByte(String tag, byte b) {
        handle.setByte(tag, b);
    }

    public void setShort(String tag, short s) {
        handle.setShort(tag, s);
    }

    public void setInt(String tag, int i) {
        handle.setInt(tag, i);
    }

    public void setLong(String tag, long l) {
        handle.setLong(tag, l);
    }

    public void setFloat(String tag, float f) {
        handle.setFloat(tag, f);
    }

    public void setDouble(String tag, double d) {
        handle.setDouble(tag, d);
    }

    public void setString(String tag, String s) {
        handle.setString(tag, s);
    }

    public void setByteArray(String tag, byte[] b) {
        handle.setByteArray(tag, b);
    }

    public void setIntArray(String tag, int[] i) {
        handle.setIntArray(tag, i);
    }

    public void setBoolean(String tag, boolean b) {
        handle.setBoolean(tag, b);
    }

    public void setList(String tag, List<NBTBase> l) {
        NBTTagList nbtTagList = new NBTTagList();

        for (NBTBase nbtBase : l) {
            nbtTagList.add((net.minecraft.server.v1_8_R3.NBTBase) nbtBase.getHandle());
        }

        handle.set(tag, nbtTagList);
    }

    public byte getByte(String tag) {
        return handle.getByte(tag);
    }

    public short getShort(String tag) {
        return handle.getShort(tag);
    }

    public int getInt(String tag) {
        return handle.getInt(tag);
    }

    public long getLong(String tag) {
        return handle.getLong(tag);
    }

    public float getFloat(String tag) {
        return handle.getFloat(tag);
    }

    public double getDouble(String tag) {
        return handle.getDouble(tag);
    }

    public String getString(String tag) {
        return handle.getString(tag);
    }

    public byte[] getByteArray(String tag) {
        return handle.getByteArray(tag);
    }

    public int[] getIntArray(String tag) {
        return handle.getIntArray(tag);
    }

    public boolean getBoolean(String tag) {
        return handle.getBoolean(tag);
    }

    public List<NBTBase> getList(String tag) {
        net.minecraft.server.v1_8_R3.NBTBase nbtBase = handle.get(tag);

        if (nbtBase == null || nbtBase.getTypeId() != 9) return null;

        NBTTagList nbtTagList = (NBTTagList) nbtBase;
        List<NBTBase> list = new ArrayList<>(nbtTagList.size());

        for (int i = 0; i < nbtTagList.size(); i++) {
            net.minecraft.server.v1_8_R3.NBTBase base = nbtTagList.g(i);
            list.add(NBTTypeUtil_1_8_R3.getWrapper(base));
        }

        return list;
    }

    public boolean hasKey(String tag) {
        return handle.hasKey(tag);
    }

    public boolean hasKeyOfType(String tag, int i) {
        return handle.hasKeyOfType(tag, i);
    }

    public void remove(String tag) {
        handle.remove(tag);
    }

    public boolean isEmpty() {
        return handle.isEmpty();
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagCompound_1_8_R3 && handle.equals(o);
    }

}
