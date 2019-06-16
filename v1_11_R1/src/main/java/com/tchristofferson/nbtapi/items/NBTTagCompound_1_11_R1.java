package com.tchristofferson.nbtapi.items;

import net.minecraft.server.v1_11_R1.NBTTagList;
import org.bukkit.craftbukkit.v1_11_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class NBTTagCompound_1_11_R1 implements NBTTagCompound {

    private final net.minecraft.server.v1_11_R1.NBTTagCompound handle;

    public NBTTagCompound_1_11_R1(ItemStack itemStack) {
        this.handle = CraftItemStack.asNMSCopy(itemStack).getTag();
    }

    @Override
    public void setByte(String tag, byte b) {
        handle.setByte(tag, b);
    }

    @Override
    public void setShort(String tag, short s) {
        handle.setShort(tag, s);
    }

    @Override
    public void setInt(String tag, int i) {
        handle.setInt(tag, i);
    }

    @Override
    public void setLong(String tag, long l) {
        handle.setLong(tag, l);
    }

    @Override
    public void setFloat(String tag, float f) {
        handle.setFloat(tag, f);
    }

    @Override
    public void setDouble(String tag, double d) {
        handle.setDouble(tag, d);
    }

    @Override
    public void setString(String tag, String s) {
        handle.setString(tag, s);
    }

    @Override
    public void setByteArray(String tag, byte[] b) {
        handle.setByteArray(tag, b);
    }

    @Override
    public void setIntArray(String tag, int[] i) {
        handle.setIntArray(tag, i);
    }

    @Override
    public void setBoolean(String tag, boolean b) {
        handle.setBoolean(tag, b);
    }

    @Override
    public void setList(String tag, List<NBTBase> l) {
        NBTTagList nbtTagList = new NBTTagList();

        for (NBTBase nbtBase : l) {
            nbtTagList.add((net.minecraft.server.v1_11_R1.NBTBase) nbtBase.getHandle());
        }

        handle.set(tag, nbtTagList);
    }

    @Override
    public byte getByte(String tag) {
        return handle.getByte(tag);
    }

    @Override
    public short getShort(String tag) {
        return handle.getShort(tag);
    }

    @Override
    public int getInt(String tag) {
        return handle.getInt(tag);
    }

    @Override
    public long getLong(String tag) {
        return handle.getLong(tag);
    }

    @Override
    public float getFloat(String tag) {
        return handle.getFloat(tag);
    }

    @Override
    public double getDouble(String tag) {
        return handle.getDouble(tag);
    }

    @Override
    public String getString(String tag) {
        return handle.getString(tag);
    }

    @Override
    public byte[] getByteArray(String tag) {
        return handle.getByteArray(tag);
    }

    @Override
    public int[] getIntArray(String tag) {
        return handle.getIntArray(tag);
    }

    @Override
    public boolean getBoolean(String tag) {
        return handle.getBoolean(tag);
    }

    @Override
    public List<NBTBase> getList(String tag) {
        net.minecraft.server.v1_11_R1.NBTBase nbtBase = handle.get(tag);

        if (nbtBase == null || nbtBase.getTypeId() != 9) return null;

        NBTTagList nbtTagList = (NBTTagList) nbtBase;
        List<NBTBase> list = new ArrayList<>(nbtTagList.size());

        for (int i = 0; i < nbtTagList.size(); i++) {
            net.minecraft.server.v1_11_R1.NBTBase base = nbtTagList.get(i);
            list.add(NBTTypeUtil_1_11_R1.getWrapper(base));
        }

        return list;
    }

    @Override
    public boolean hasKey(String tag) {
        return handle.hasKey(tag);
    }

    @Override
    public boolean hasKeyOfType(String tag, int i) {
        return handle.hasKeyOfType(tag, i);
    }

    @Override
    public void remove(String tag) {
        handle.remove(tag);
    }

    @Override
    public boolean isEmpty() {
        return handle.isEmpty();
    }

    @Override
    public Object getHandle() {
        return handle;
    }

    public boolean equals(Object o) {
        return o instanceof NBTTagCompound_1_11_R1 && handle.equals(((NBTTagCompound_1_11_R1) o).getHandle());
    }

}
