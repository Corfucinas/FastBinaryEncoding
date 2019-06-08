// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.3.0.0

package com.chronoxor.enums.fbe;

// Fast Binary Encoding EnumUInt64 field model
public final class FieldModelEnumUInt64 extends com.chronoxor.fbe.FieldModel
{
    public FieldModelEnumUInt64(com.chronoxor.fbe.Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 8; }

    // Get the value
    public com.chronoxor.enums.EnumUInt64 get() { return get(new com.chronoxor.enums.EnumUInt64()); }
    public com.chronoxor.enums.EnumUInt64 get(com.chronoxor.enums.EnumUInt64 defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return new com.chronoxor.enums.EnumUInt64(readInt64(fbeOffset()));
    }

    // Set the value
    public void set(com.chronoxor.enums.EnumUInt64 value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), value.getRaw());
    }
}
