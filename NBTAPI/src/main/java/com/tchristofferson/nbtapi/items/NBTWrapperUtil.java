package com.tchristofferson.nbtapi.items;

import com.tchristofferson.nbtapi.items.wrappercreatorimpl.WrapperCreator_1_10_R1;
import com.tchristofferson.nbtapi.items.wrappercreatorimpl.WrapperCreator_1_11_R1;
import com.tchristofferson.nbtapi.items.wrappercreatorimpl.WrapperCreator_1_8_R3;
import com.tchristofferson.nbtapi.items.wrappercreatorimpl.WrapperCreator_1_9_R2;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class NBTWrapperUtil {

    private static final WrapperCreator wrapperCreator;

    static {
        String v = Bukkit.getServer().getClass().getName();
        String version = v.substring(v.lastIndexOf('.') + 1);

        //TODO
        if (version.equals("v_1_8_R3")) {
            wrapperCreator = new WrapperCreator_1_8_R3();
        } else if (version.equals("v_1_9_R2")) {
            wrapperCreator = new WrapperCreator_1_9_R2();
        } else if (version.equals("v_1_10_R1")) {
            wrapperCreator = new WrapperCreator_1_10_R1();
        } else if (version.equals("v_1_11_R1")) {
            wrapperCreator = new WrapperCreator_1_11_R1();
        } else if (version.equals("v_1_12_R1")) {
            wrapperCreator = new WrapperCreator_1_8_R3();
        } else if (version.equals("v_1_13_R2")) {
            wrapperCreator = new WrapperCreator_1_8_R3();
        } else if (version.equals("v_1_14_R1")) {
            wrapperCreator = new WrapperCreator_1_8_R3();
        } else {
            wrapperCreator = new WrapperCreator_1_8_R3();
        }

    }

    public static NBTTagByte getByteWrapper(byte b) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getByteTag(b);
    }

    public static NBTTagByteArray getByteArrayWrapper(byte[] b) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getByteArrayTag(b);
    }

    public static NBTTagCompound getTagCompound(ItemStack itemStack) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getCompoundTag(itemStack);
    }

    public static NBTTagDouble getDoubleWrapper(double d) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getDoubleTag(d);
    }

    public static NBTTagFloat getFloatWrapper(float f) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getFloatTag(f);
    }

    public static NBTTagInt getIntWrapper(int i) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getIntTag(i);
    }

    public static NBTTagIntArray getIntArrayWrapper(int[] i) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getIntArrayTag(i);
    }

    public static NBTTagList getListWrapper(List<NBTBase> list) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getListTag(list);
    }

    public static NBTTagLong getLongWrapper(long l) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getLongTag(l);
    }

    public static NBTTagShort getShortWrapper(short s) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getShortTag(s);
    }

    public static NBTTagString getStringWrapper(String s) {
        if (wrapperCreator == null) return null;
        return wrapperCreator.getStringTag(s);
    }

}
