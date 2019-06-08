// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.3.0.0

package com.chronoxor.enums.fbe;

// Fast Binary Encoding EnumUInt8 field model
public final class FieldModelEnumUInt8 extends com.chronoxor.fbe.FieldModel
{
    public FieldModelEnumUInt8(com.chronoxor.fbe.Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 1; }

    // Get the value
    public com.chronoxor.enums.EnumUInt8 get() { return get(new com.chronoxor.enums.EnumUInt8()); }
    public com.chronoxor.enums.EnumUInt8 get(com.chronoxor.enums.EnumUInt8 defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return new com.chronoxor.enums.EnumUInt8(readInt8(fbeOffset()));
    }

    // Set the value
    public void set(com.chronoxor.enums.EnumUInt8 value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), value.getRaw());
    }
}
