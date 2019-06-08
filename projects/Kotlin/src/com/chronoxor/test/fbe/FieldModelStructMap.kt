// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding StructMap field model
@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods", "ReplaceGetOrSet")
class FieldModelStructMap(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FieldModel(buffer, offset)
{
    val f1: FieldModelMapInt32Byte = FieldModelMapInt32Byte(buffer, 4 + 4)
    val f2: FieldModelMapInt32OptionalByte = FieldModelMapInt32OptionalByte(buffer, f1.fbeOffset + f1.fbeSize)
    val f3: FieldModelMapInt32Bytes = FieldModelMapInt32Bytes(buffer, f2.fbeOffset + f2.fbeSize)
    val f4: FieldModelMapInt32OptionalBytes = FieldModelMapInt32OptionalBytes(buffer, f3.fbeOffset + f3.fbeSize)
    val f5: FieldModelMapInt32EnumSimple = FieldModelMapInt32EnumSimple(buffer, f4.fbeOffset + f4.fbeSize)
    val f6: FieldModelMapInt32OptionalEnumSimple = FieldModelMapInt32OptionalEnumSimple(buffer, f5.fbeOffset + f5.fbeSize)
    val f7: FieldModelMapInt32FlagsSimple = FieldModelMapInt32FlagsSimple(buffer, f6.fbeOffset + f6.fbeSize)
    val f8: FieldModelMapInt32OptionalFlagsSimple = FieldModelMapInt32OptionalFlagsSimple(buffer, f7.fbeOffset + f7.fbeSize)
    val f9: FieldModelMapInt32StructSimple = FieldModelMapInt32StructSimple(buffer, f8.fbeOffset + f8.fbeSize)
    val f10: FieldModelMapInt32OptionalStructSimple = FieldModelMapInt32OptionalStructSimple(buffer, f9.fbeOffset + f9.fbeSize)

    // Field size
    override val fbeSize: Long = 4

    // Field body size
    val fbeBody: Long = (4 + 4
        + f1.fbeSize
        + f2.fbeSize
        + f3.fbeSize
        + f4.fbeSize
        + f5.fbeSize
        + f6.fbeSize
        + f7.fbeSize
        + f8.fbeSize
        + f9.fbeSize
        + f10.fbeSize
        )

    // Field extra size
    override val fbeExtra: Long get()
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4) > _buffer.size))
            return 0

        _buffer.shift(fbeStructOffset)

        val fbeResult = (fbeBody
            + f1.fbeExtra
            + f2.fbeExtra
            + f3.fbeExtra
            + f4.fbeExtra
            + f5.fbeExtra
            + f6.fbeExtra
            + f7.fbeExtra
            + f8.fbeExtra
            + f9.fbeExtra
            + f10.fbeExtra
            )

        _buffer.unshift(fbeStructOffset)

        return fbeResult
    }

    // Field type
    var fbeType: Long = fbeTypeConst

    companion object
    {
        const val fbeTypeConst: Long = 140
    }

    // Check if the struct value is valid
    fun verify(fbeVerifyType: Boolean = true): Boolean
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return true

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size))
            return false

        val fbeStructSize = readUInt32(fbeStructOffset).toLong()
        if (fbeStructSize < (4 + 4))
            return false

        val fbeStructType = readUInt32(fbeStructOffset + 4).toLong()
        if (fbeVerifyType && (fbeStructType != fbeType))
            return false

        _buffer.shift(fbeStructOffset)
        val fbeResult = verifyFields(fbeStructSize)
        _buffer.unshift(fbeStructOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    @Suppress("UNUSED_PARAMETER")
    fun verifyFields(fbeStructSize: Long): Boolean
    {
        var fbeCurrentSize = 4L + 4L

        if ((fbeCurrentSize + f1.fbeSize) > fbeStructSize)
            return true
        if (!f1.verify())
            return false
        fbeCurrentSize += f1.fbeSize

        if ((fbeCurrentSize + f2.fbeSize) > fbeStructSize)
            return true
        if (!f2.verify())
            return false
        fbeCurrentSize += f2.fbeSize

        if ((fbeCurrentSize + f3.fbeSize) > fbeStructSize)
            return true
        if (!f3.verify())
            return false
        fbeCurrentSize += f3.fbeSize

        if ((fbeCurrentSize + f4.fbeSize) > fbeStructSize)
            return true
        if (!f4.verify())
            return false
        fbeCurrentSize += f4.fbeSize

        if ((fbeCurrentSize + f5.fbeSize) > fbeStructSize)
            return true
        if (!f5.verify())
            return false
        fbeCurrentSize += f5.fbeSize

        if ((fbeCurrentSize + f6.fbeSize) > fbeStructSize)
            return true
        if (!f6.verify())
            return false
        fbeCurrentSize += f6.fbeSize

        if ((fbeCurrentSize + f7.fbeSize) > fbeStructSize)
            return true
        if (!f7.verify())
            return false
        fbeCurrentSize += f7.fbeSize

        if ((fbeCurrentSize + f8.fbeSize) > fbeStructSize)
            return true
        if (!f8.verify())
            return false
        fbeCurrentSize += f8.fbeSize

        if ((fbeCurrentSize + f9.fbeSize) > fbeStructSize)
            return true
        if (!f9.verify())
            return false
        fbeCurrentSize += f9.fbeSize

        if ((fbeCurrentSize + f10.fbeSize) > fbeStructSize)
            return true
        if (!f10.verify())
            return false
        fbeCurrentSize += f10.fbeSize

        return true
    }

    // Get the struct value (begin phase)
    fun getBegin(): Long
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        assert((fbeStructOffset > 0) && ((_buffer.offset + fbeStructOffset + 4 + 4) <= _buffer.size)) { "Model is broken!" }
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size))
            return 0

        val fbeStructSize = readUInt32(fbeStructOffset).toLong()
        assert(fbeStructSize >= (4 + 4)) { "Model is broken!" }
        if (fbeStructSize < (4 + 4))
            return 0

        _buffer.shift(fbeStructOffset)
        return fbeStructOffset
    }

    // Get the struct value (end phase)
    fun getEnd(fbeBegin: Long)
    {
        _buffer.unshift(fbeBegin)
    }

    // Get the struct value
    fun get(fbeValue: com.chronoxor.test.StructMap = com.chronoxor.test.StructMap()): com.chronoxor.test.StructMap
    {
        val fbeBegin = getBegin()
        if (fbeBegin == 0L)
            return fbeValue

        val fbeStructSize = readUInt32(0).toLong()
        getFields(fbeValue, fbeStructSize)
        getEnd(fbeBegin)
        return fbeValue
    }

    // Get the struct fields values
    @Suppress("UNUSED_PARAMETER")
    fun getFields(fbeValue: com.chronoxor.test.StructMap, fbeStructSize: Long)
    {
        var fbeCurrentSize = 4L + 4L

        if ((fbeCurrentSize + f1.fbeSize) <= fbeStructSize)
            f1.get(fbeValue.f1)
        else
            fbeValue.f1.clear()
        fbeCurrentSize += f1.fbeSize

        if ((fbeCurrentSize + f2.fbeSize) <= fbeStructSize)
            f2.get(fbeValue.f2)
        else
            fbeValue.f2.clear()
        fbeCurrentSize += f2.fbeSize

        if ((fbeCurrentSize + f3.fbeSize) <= fbeStructSize)
            f3.get(fbeValue.f3)
        else
            fbeValue.f3.clear()
        fbeCurrentSize += f3.fbeSize

        if ((fbeCurrentSize + f4.fbeSize) <= fbeStructSize)
            f4.get(fbeValue.f4)
        else
            fbeValue.f4.clear()
        fbeCurrentSize += f4.fbeSize

        if ((fbeCurrentSize + f5.fbeSize) <= fbeStructSize)
            f5.get(fbeValue.f5)
        else
            fbeValue.f5.clear()
        fbeCurrentSize += f5.fbeSize

        if ((fbeCurrentSize + f6.fbeSize) <= fbeStructSize)
            f6.get(fbeValue.f6)
        else
            fbeValue.f6.clear()
        fbeCurrentSize += f6.fbeSize

        if ((fbeCurrentSize + f7.fbeSize) <= fbeStructSize)
            f7.get(fbeValue.f7)
        else
            fbeValue.f7.clear()
        fbeCurrentSize += f7.fbeSize

        if ((fbeCurrentSize + f8.fbeSize) <= fbeStructSize)
            f8.get(fbeValue.f8)
        else
            fbeValue.f8.clear()
        fbeCurrentSize += f8.fbeSize

        if ((fbeCurrentSize + f9.fbeSize) <= fbeStructSize)
            f9.get(fbeValue.f9)
        else
            fbeValue.f9.clear()
        fbeCurrentSize += f9.fbeSize

        if ((fbeCurrentSize + f10.fbeSize) <= fbeStructSize)
            f10.get(fbeValue.f10)
        else
            fbeValue.f10.clear()
        fbeCurrentSize += f10.fbeSize
    }

    // Set the struct value (begin phase)
    fun setBegin(): Long
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructSize = fbeBody
        val fbeStructOffset = _buffer.allocate(fbeStructSize) - _buffer.offset
        assert((fbeStructOffset > 0) && ((_buffer.offset + fbeStructOffset + fbeStructSize) <= _buffer.size)) { "Model is broken!" }
        if ((fbeStructOffset <= 0) || ((_buffer.offset + fbeStructOffset + fbeStructSize) > _buffer.size))
            return 0

        write(fbeOffset, fbeStructOffset.toUInt())
        write(fbeStructOffset, fbeStructSize.toUInt())
        write(fbeStructOffset + 4, fbeType.toUInt())

        _buffer.shift(fbeStructOffset)
        return fbeStructOffset
    }

    // Set the struct value (end phase)
    fun setEnd(fbeBegin: Long)
    {
        _buffer.unshift(fbeBegin)
    }

    // Set the struct value
    fun set(fbeValue: com.chronoxor.test.StructMap)
    {
        val fbeBegin = setBegin()
        if (fbeBegin == 0L)
            return

        setFields(fbeValue)
        setEnd(fbeBegin)
    }

    // Set the struct fields values
    @Suppress("UNUSED_PARAMETER")
    fun setFields(fbeValue: com.chronoxor.test.StructMap)
    {
        f1.set(fbeValue.f1)
        f2.set(fbeValue.f2)
        f3.set(fbeValue.f3)
        f4.set(fbeValue.f4)
        f5.set(fbeValue.f5)
        f6.set(fbeValue.f6)
        f7.set(fbeValue.f7)
        f8.set(fbeValue.f8)
        f9.set(fbeValue.f9)
        f10.set(fbeValue.f10)
    }
}
