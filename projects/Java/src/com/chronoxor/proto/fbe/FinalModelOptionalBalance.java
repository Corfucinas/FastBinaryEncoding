// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

package com.chronoxor.proto.fbe;

// Fast Binary Encoding optional Balance final model
public final class FinalModelOptionalBalance extends com.chronoxor.fbe.FinalModel
{
    public FinalModelOptionalBalance(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        value = new FinalModelBalance(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(com.chronoxor.proto.Balance optional) { return 1 + ((optional != null) ? value.fbeAllocationSize(optional) : 0); }

    // Checks if the object contains a value
    public boolean hasValue()
    {
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
            return false;

        byte fbeHasValue = readInt8(fbeOffset());
        return (fbeHasValue != 0);
    }

    // Base final model value
    public final FinalModelBalance value;

    // Check if the optional value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
            return Long.MAX_VALUE;

        byte fbeHasValue = readInt8(fbeOffset());
        if (fbeHasValue == 0)
            return 1;

        _buffer.shift(fbeOffset() + 1);
        long fbeResult = value.verify();
        _buffer.unshift(fbeOffset() + 1);
        return 1 + fbeResult;
    }

    // Get the optional value
    public com.chronoxor.proto.Balance get(com.chronoxor.fbe.Size size)
    {
        assert ((_buffer.getOffset() + fbeOffset() + 1) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
        {
            size.value = 0;
            return null;
        }

        if (!hasValue())
        {
            size.value = 1;
            return null;
        }

        _buffer.shift(fbeOffset() + 1);
        com.chronoxor.proto.Balance optional = value.get(size);
        _buffer.unshift(fbeOffset() + 1);
        size.value += 1;
        return optional;
    }

    // Set the optional value
    public long set(com.chronoxor.proto.Balance optional)
    {
        assert ((_buffer.getOffset() + fbeOffset() + 1) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
            return 0;

        byte fbeHasValue = (byte)((optional != null) ? 1 : 0);
        write(fbeOffset(), fbeHasValue);
        if (fbeHasValue == 0)
            return 1;

        _buffer.shift(fbeOffset() + 1);
        long size = value.set(optional);
        _buffer.unshift(fbeOffset() + 1);
        return 1 + size;
    }
}
