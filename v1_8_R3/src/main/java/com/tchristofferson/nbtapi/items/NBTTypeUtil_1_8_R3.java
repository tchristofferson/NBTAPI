package com.tchristofferson.nbtapi.items;

import net.minecraft.server.v1_8_R3.NBTTagByte;
import net.minecraft.server.v1_8_R3.NBTTagByteArray;
import net.minecraft.server.v1_8_R3.NBTTagDouble;
import net.minecraft.server.v1_8_R3.NBTTagFloat;
import net.minecraft.server.v1_8_R3.NBTTagInt;
import net.minecraft.server.v1_8_R3.NBTTagIntArray;
import net.minecraft.server.v1_8_R3.NBTTagLong;
import net.minecraft.server.v1_8_R3.NBTTagShort;
import net.minecraft.server.v1_8_R3.NBTTagString;

import java.util.ArrayList;
import java.util.List;

class NBTTypeUtil_1_8_R3 {

    static NBTBase getWrapper(net.minecraft.server.v1_8_R3.NBTBase base) {

        if (base instanceof net.minecraft.server.v1_8_R3.NBTBase.NBTNumber) {

            net.minecraft.server.v1_8_R3.NBTBase.NBTNumber baseNumber = (net.minecraft.server.v1_8_R3.NBTBase.NBTNumber) base;

            if (baseNumber instanceof NBTTagByte) {
                return new NBTTagByte_1_8_R3(baseNumber.f());
            } else if (baseNumber instanceof NBTTagDouble) {
                return new NBTTagDouble_1_8_R3(baseNumber.g());
            } else if (baseNumber instanceof NBTTagFloat) {
                return new NBTTagFloat_1_8_R3(baseNumber.h());
            } else if (baseNumber instanceof NBTTagInt) {
                return new NBTTagInt_1_8_R3(baseNumber.d());
            } else if (baseNumber instanceof NBTTagLong) {
                return new NBTTagLong_1_8_R3(baseNumber.c());
            } else if (baseNumber instanceof NBTTagShort) {
                return new NBTTagShort_1_8_R3(baseNumber.e());
            }

        } else if (base instanceof net.minecraft.server.v1_8_R3.NBTTagString) {
            return new NBTTagString_1_8_R3(((NBTTagString) base).a_());
        } else if (base instanceof net.minecraft.server.v1_8_R3.NBTTagByteArray) {
            return new NBTTagByteArray_1_8_R3(((NBTTagByteArray) base).c());
        } else if (base instanceof net.minecraft.server.v1_8_R3.NBTTagIntArray) {
            return new NBTTagIntArray_1_8_R3(((NBTTagIntArray) base).c());
        } else if (base instanceof net.minecraft.server.v1_8_R3.NBTTagList) {
            net.minecraft.server.v1_8_R3.NBTTagList nbtList = (net.minecraft.server.v1_8_R3.NBTTagList) base;
            List<NBTBase> list = new ArrayList<>(nbtList.size());

            for (int i = 0; i < nbtList.size(); i++) {
                NBTBase nbtBase = getWrapper(nbtList.g(i));

                if (nbtBase != null) {
                    list.add(nbtBase);
                }
            }

            return new NBTTagList_1_8_R3(list);
        }

        return null;
    }

}
