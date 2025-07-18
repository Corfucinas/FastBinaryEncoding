//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto

@Suppress("EnumEntryName", "MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
enum class OrderSideEnum
{
    buy(0 + 0)
    , sell(0 + 1)
    ;

    var raw: Byte = 0
        private set

    constructor(value: Byte) { this.raw = value.toByte() }
    constructor(value: Short) { this.raw = value.toByte() }
    constructor(value: Int) { this.raw = value.toByte() }
    constructor(value: Long) { this.raw = value.toByte() }
    constructor(value: OrderSideEnum) { this.raw = value.raw }

    override fun toString(): String
    {
        if (this == buy) return "buy"
        if (this == sell) return "sell"
        return "<unknown>"
    }

    companion object
    {
        private val mapping = java.util.HashMap<Byte, OrderSideEnum>()

        init
        {
            for (value in OrderSideEnum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: Byte): OrderSideEnum? { return mapping[value] }
    }
}
