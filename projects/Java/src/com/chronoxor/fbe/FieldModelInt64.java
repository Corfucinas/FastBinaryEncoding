//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

// Fast Binary Encoding long field model
public final class FieldModelInt64 extends FieldModel
{
    public FieldModelInt64(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 8; }

    // Get the value
    public long get() { return get(0l); }
    public long get(long defaults)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        return readInt64(fbeOffset());
    }

    // Set the value
    public void set(long value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        write(fbeOffset(), value);
    }
}
