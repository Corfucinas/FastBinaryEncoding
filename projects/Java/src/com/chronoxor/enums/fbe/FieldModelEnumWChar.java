//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

package com.chronoxor.enums.fbe;

// Fast Binary Encoding EnumWChar field model
public final class FieldModelEnumWChar extends com.chronoxor.fbe.FieldModel
{
    public FieldModelEnumWChar(com.chronoxor.fbe.Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }

    // Get the value
    public com.chronoxor.enums.EnumWChar get() { return get(new com.chronoxor.enums.EnumWChar()); }
    public com.chronoxor.enums.EnumWChar get(com.chronoxor.enums.EnumWChar defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return new com.chronoxor.enums.EnumWChar(readInt32(fbeOffset()));
    }

    // Set the value
    public void set(com.chronoxor.enums.EnumWChar value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), value.getRaw());
    }
}
