package com.tchristofferson.nbtapi.items.wrappercreatorimpl;

import com.tchristofferson.nbtapi.items.*;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class WrapperCreator_1_10_R1 implements WrapperCreator {

    public NBTTagByte getByteTag(byte b) {
        return new NBTTagByte_1_10_R1(b);
    }

    public NBTTagByteArray getByteArrayTag(byte[] b) {
        return new NBTTagByteArray_1_10_R1(b);
    }

    public NBTTagCompound getCompoundTag(ItemStack itemStack) {
        return new NBTTagCompound_1_10_R1(itemStack);
    }

    public NBTTagDouble getDoubleTag(double d) {
        return new NBTTagDouble_1_10_R1(d);
    }

    public NBTTagFloat getFloatTag(float f) {
        return new NBTTagFloat_1_10_R1(f);
    }

    public NBTTagInt getIntTag(int i) {
        return new NBTTagInt_1_10_R1(i);
    }

    public NBTTagIntArray getIntArrayTag(int[] i) {
        return new NBTTagIntArray_1_10_R1(i);
    }

    public NBTTagList getListTag(List<NBTBase> list) {
        return new NBTTagList_1_10_R1(list);
    }

    public NBTTagLong getLongTag(long l) {
        return new NBTTagLong_1_10_R1(l);
    }

    public NBTTagShort getShortTag(short s) {
        return new NBTTagShort_1_10_R1(s);
    }

    public NBTTagString getStringTag(String s) {
        return new NBTTagString_1_10_R1(s);
    }

}
