//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

package com.chronoxor.proto.fbe;

// Fast Binary Encoding State field model
public final class FieldModelState extends com.chronoxor.fbe.FieldModel
{
    public FieldModelState(com.chronoxor.fbe.Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 1; }

    // Get the value
    public com.chronoxor.proto.State get() { return get(new com.chronoxor.proto.State()); }
    public com.chronoxor.proto.State get(com.chronoxor.proto.State defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return new com.chronoxor.proto.State(readByte(fbeOffset()));
    }

    // Set the value
    public void set(com.chronoxor.proto.State value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), value.getRaw());
    }
}
