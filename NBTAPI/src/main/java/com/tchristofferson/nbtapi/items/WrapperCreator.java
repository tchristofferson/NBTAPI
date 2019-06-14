package com.tchristofferson.nbtapi.items;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface WrapperCreator {

    NBTTagByte getByteTag(byte b);
    NBTTagByteArray getByteArrayTag(byte[] b);
    NBTTagCompound getCompoundTag(ItemStack itemStack);
    NBTTagDouble getDoubleTag(double d);
    NBTTagFloat getFloatTag(float f);
    NBTTagInt getIntTag(int i);
    NBTTagIntArray getIntArrayTag(int[] i);
    NBTTagList getListTag(List<NBTBase> list);
    NBTTagLong getLongTag(long l);
    NBTTagShort getShortTag(short s);
    NBTTagString getStringTag(String s);

}
