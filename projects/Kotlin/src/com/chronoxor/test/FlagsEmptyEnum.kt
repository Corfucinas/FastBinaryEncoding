//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test

@Suppress("EnumEntryName", "MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
enum class FlagsEmptyEnum
{
    ;

    var raw: Int = 0
        private set

    constructor(value: Byte) { this.raw = value.toInt() }
    constructor(value: Short) { this.raw = value.toInt() }
    constructor(value: Int) { this.raw = value.toInt() }
    constructor(value: Long) { this.raw = value.toInt() }
    constructor(value: FlagsEmptyEnum) { this.raw = value.raw }

    fun hasFlags(flags: Int): Boolean = ((raw.toInt() and flags.toInt()) != 0) && ((raw.toInt() and flags.toInt()) == flags.toInt())
    fun hasFlags(flags: FlagsEmptyEnum): Boolean = hasFlags(flags.raw)

    val allSet: java.util.EnumSet<FlagsEmptyEnum> get() = java.util.EnumSet.allOf(FlagsEmptyEnum::class.java)
    val noneSet: java.util.EnumSet<FlagsEmptyEnum> get() = java.util.EnumSet.noneOf(FlagsEmptyEnum::class.java)
    val currentSet: java.util.EnumSet<FlagsEmptyEnum> get()
    {
        val result = java.util.EnumSet.noneOf(FlagsEmptyEnum::class.java)
        return result
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        return sb.toString()
    }

    companion object
    {
        private val mapping = java.util.HashMap<Int, FlagsEmptyEnum>()

        init
        {
            for (value in FlagsEmptyEnum.values())
                mapping[value.raw] = value
        }

        fun mapValue(value: Int): FlagsEmptyEnum? { return mapping[value] }
    }
}
