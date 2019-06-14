package com.tchristofferson.nbtapi.items;

public interface NBTTagList extends NBTBase {

    void add(NBTBase nbtBase);
    NBTBase remove(int index);
    boolean contains(NBTBase nbtBase);
    boolean isEmpty();
    int getSize();

}
