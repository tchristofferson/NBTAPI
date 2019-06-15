package com.tchristofferson.nbtapi.items;

import net.minecraft.server.v1_9_R2.NBTTagByteArray;
import net.minecraft.server.v1_9_R2.NBTTagIntArray;
import net.minecraft.server.v1_9_R2.NBTTagString;

import java.util.ArrayList;
import java.util.List;

class NBTTypeUtil_1_9_R2 {

    static NBTBase getWrapper(net.minecraft.server.v1_9_R2.NBTBase base) {
        if (base instanceof net.minecraft.server.v1_9_R2.NBTBase.NBTNumber) {

            net.minecraft.server.v1_9_R2.NBTBase.NBTNumber baseNumber = (net.minecraft.server.v1_9_R2.NBTBase.NBTNumber) base;

            if (baseNumber instanceof NBTTagByte) {
                return new NBTTagByte_1_9_R2(baseNumber.f());
            } else if (baseNumber instanceof NBTTagDouble) {
                return new NBTTagDouble_1_9_R2(baseNumber.g());
            } else if (baseNumber instanceof NBTTagFloat) {
                return new NBTTagFloat_1_9_R2(baseNumber.h());
            } else if (baseNumber instanceof NBTTagInt) {
                return new NBTTagInt_1_9_R2(baseNumber.d());
            } else if (baseNumber instanceof NBTTagLong) {
                return new NBTTagLong_1_9_R2(baseNumber.c());
            } else if (baseNumber instanceof NBTTagShort) {
                return new NBTTagShort_1_9_R2(baseNumber.e());
            }

        } else if (base instanceof net.minecraft.server.v1_9_R2.NBTTagString) {
            return new NBTTagString_1_9_R2(((NBTTagString) base).a_());
        } else if (base instanceof net.minecraft.server.v1_9_R2.NBTTagByteArray) {
            return new NBTTagByteArray_1_9_R2(((NBTTagByteArray) base).c());
        } else if (base instanceof net.minecraft.server.v1_9_R2.NBTTagIntArray) {
            return new NBTTagIntArray_1_9_R2(((NBTTagIntArray) base).c());
        } else if (base instanceof net.minecraft.server.v1_9_R2.NBTTagList) {
            net.minecraft.server.v1_9_R2.NBTTagList nbtList = (net.minecraft.server.v1_9_R2.NBTTagList) base;
            List<NBTBase> list = new ArrayList<>(nbtList.size());

            for (int i = 0; i < nbtList.size(); i++) {

                NBTBase nbtBase = getWrapper(nbtList.get(i));

                if (nbtBase != null) {
                    list.add(nbtBase);
                }

            }

            return new NBTTagList_1_9_R2(list);
        }

        return null;
    }

}
