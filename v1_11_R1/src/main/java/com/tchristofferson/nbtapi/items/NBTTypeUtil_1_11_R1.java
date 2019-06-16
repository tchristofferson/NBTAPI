package com.tchristofferson.nbtapi.items;

import net.minecraft.server.v1_11_R1.NBTTagByteArray;
import net.minecraft.server.v1_11_R1.NBTTagIntArray;
import net.minecraft.server.v1_11_R1.NBTTagString;

import java.util.ArrayList;
import java.util.List;

class NBTTypeUtil_1_11_R1 {

    static NBTBase getWrapper(net.minecraft.server.v1_11_R1.NBTBase base) {
        if (base instanceof NBTTagByte) {
            return new NBTTagByte_1_11_R1(((net.minecraft.server.v1_11_R1.NBTTagByte) base).g());
        } else if (base instanceof NBTTagDouble) {
            return new NBTTagDouble_1_11_R1(((net.minecraft.server.v1_11_R1.NBTTagDouble) base).asDouble());
        } else if (base instanceof NBTTagFloat) {
            return new NBTTagFloat_1_11_R1(((net.minecraft.server.v1_11_R1.NBTTagFloat) base).i());
        } else if (base instanceof NBTTagInt) {
            return new NBTTagInt_1_11_R1(((net.minecraft.server.v1_11_R1.NBTTagInt) base).e());
        } else if (base instanceof NBTTagLong) {
            return new NBTTagLong_1_11_R1(((net.minecraft.server.v1_11_R1.NBTTagLong) base).d());
        } else if (base instanceof NBTTagShort) {
            return new NBTTagShort_1_11_R1(((net.minecraft.server.v1_11_R1.NBTTagShort) base).f());
        } else if (base instanceof net.minecraft.server.v1_11_R1.NBTTagString) {
            return new NBTTagString_1_11_R1(((NBTTagString) base).c_());
        } else if (base instanceof net.minecraft.server.v1_11_R1.NBTTagByteArray) {
            return new NBTTagByteArray_1_11_R1(((NBTTagByteArray) base).c());
        } else if (base instanceof net.minecraft.server.v1_11_R1.NBTTagIntArray) {
            return new NBTTagIntArray_1_11_R1(((NBTTagIntArray) base).d());
        } else if (base instanceof net.minecraft.server.v1_11_R1.NBTTagList) {
            net.minecraft.server.v1_11_R1.NBTTagList nbtList = (net.minecraft.server.v1_11_R1.NBTTagList) base;
            List<NBTBase> list = new ArrayList<>(nbtList.size());

            for (int i = 0; i < nbtList.size(); i++) {
                NBTBase nbtBase = getWrapper(nbtList.get(i));

                if (nbtBase != null) {
                    list.add(nbtBase);
                }
            }

            return new NBTTagList_1_11_R1(list);
        }

        return null;
    }

}
