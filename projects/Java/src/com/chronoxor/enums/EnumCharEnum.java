//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

package com.chronoxor.enums;

public enum EnumCharEnum
{
    ENUM_VALUE_0((char)0 + 0)
    , ENUM_VALUE_1((char)'1' + 0)
    , ENUM_VALUE_2((char)'1' + 1)
    , ENUM_VALUE_3((char)'3' + 0)
    , ENUM_VALUE_4((char)'3' + 1)
    , ENUM_VALUE_5(ENUM_VALUE_3.getRaw())
    ;

    private byte value;

    EnumCharEnum(byte value) { this.value = value; }
    EnumCharEnum(int value) { this.value = (byte)value; }
    EnumCharEnum(EnumCharEnum value) { this.value = value.value; }

    public byte getRaw() { return value; }

    public static EnumCharEnum mapValue(byte value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0";
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1";
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2";
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3";
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4";
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5";
        return "<unknown>";
    }

    private static final java.util.Map<Byte, EnumCharEnum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : EnumCharEnum.values())
            mapping.put(value.value, value);
    }
}
