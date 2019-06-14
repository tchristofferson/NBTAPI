package com.tchristofferson.nbtapi.items.wrappercreatorimpl;

import com.tchristofferson.nbtapi.items.*;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class WrapperCreator_1_9_R2 implements WrapperCreator {

    public NBTTagByte getByteTag(byte b) {
        return new NBTTagByte_1_9_R2(b);
    }

    public NBTTagByteArray getByteArrayTag(byte[] b) {
        return new NBTTagByteArray_1_9_R2(b);
    }

    public NBTTagCompound getCompoundTag(ItemStack itemStack) {
        return new NBTTagCompound_1_9_R2(itemStack);
    }

    public NBTTagDouble getDoubleTag(double d) {
        return new NBTTagDouble_1_9_R2(d);
    }

    public NBTTagFloat getFloatTag(float f) {
        return new NBTTagFloat_1_9_R2(f);
    }

    public NBTTagInt getIntTag(int i) {
        return new NBTTagInt_1_9_R2(i);
    }

    public NBTTagIntArray getIntArrayTag(int[] i) {
        return new NBTTagIntArray_1_9_R2(i);
    }

    public NBTTagList getListTag(List<NBTBase> list) {
        return new NBTTagList_1_9_R2(list);
    }

    public NBTTagLong getLongTag(long l) {
        return new NBTTagLong_1_9_R2(l);
    }

    public NBTTagShort getShortTag(short s) {
        return new NBTTagShort_1_9_R2(s);
    }

    public NBTTagString getStringTag(String s) {
        return new NBTTagString_1_9_R2(s);
    }

}
