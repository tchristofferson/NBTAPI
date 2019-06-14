package com.tchristofferson.nbtapi.items;

import java.util.List;

//When parameter int type is asked of refer to NBTTypes class
public interface NBTTagCompound extends NBTBase {

    void setByte(String tag, byte b);
    void setShort(String tag, short s);
    void setInt(String tag, int i);
    void setLong(String tag, long l);
    void setFloat(String tag, float f);
    void setDouble(String tag, double d);
    void setString(String tag, String s);
    void setByteArray(String tag, byte[] b);
    void setIntArray(String tag, int[] i);
    void setBoolean(String tag, boolean b);
    void setList(String tag, List<NBTBase> l);

    byte getByte(String tag);
    short getShort(String tag);
    int getInt(String tag);
    long getLong(String tag);
    float getFloat(String tag);
    double getDouble(String tag);
    String getString(String tag);
    byte[] getByteArray(String tag);
    int[] getIntArray(String tag);
    boolean getBoolean(String tag);
    List<NBTBase> getList(String tag);

    boolean hasKey(String tag);
    boolean hasKeyOfType(String tag, int i);
    void remove(String tag);
    boolean isEmpty();

}
