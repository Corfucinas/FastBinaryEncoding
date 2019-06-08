// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums

@Suppress("EnumEntryName", "MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
enum class EnumUInt32Enum
{
    ENUM_VALUE_0(0u + 0u)
    , ENUM_VALUE_1(0u + 0u)
    , ENUM_VALUE_2(0u + 1u)
    , ENUM_VALUE_3(0xFFFFFFFEu + 0u)
    , ENUM_VALUE_4(0xFFFFFFFEu + 1u)
    , ENUM_VALUE_5(ENUM_VALUE_3.raw)
    ;

    var raw: UInt = 0u
        private set

    constructor(value: UByte) { this.raw = value.toUInt() }
    constructor(value: UShort) { this.raw = value.toUInt() }
    constructor(value: UInt) { this.raw = value.toUInt() }
    constructor(value: ULong) { this.raw = value.toUInt() }
    constructor(value: EnumUInt32Enum) { this.raw = value.raw }

    override fun toString(): String
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0"
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1"
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2"
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3"
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4"
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5"
        return "<unknown>"
    }

    companion object
    {
        private val mapping = java.util.HashMap<UInt, EnumUInt32Enum>()

        init
        {
            for (value in EnumUInt32Enum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: UInt): EnumUInt32Enum? { return mapping[value] }
    }
}
