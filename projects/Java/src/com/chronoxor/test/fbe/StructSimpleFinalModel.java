// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

package com.chronoxor.test.fbe;

// Fast Binary Encoding StructSimple final model
public final class StructSimpleFinalModel extends com.chronoxor.fbe.Model
{
    private final FinalModelStructSimple _model;

    public StructSimpleFinalModel() { _model = new FinalModelStructSimple(getBuffer(), 8); }
    public StructSimpleFinalModel(com.chronoxor.fbe.Buffer buffer) { super(buffer); _model = new FinalModelStructSimple(getBuffer(), 8); }

    // Get the model type
    public static final long fbeTypeConst = FinalModelStructSimple.fbeTypeConst;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    public boolean verify()
    {
        if ((getBuffer().getOffset() + _model.fbeOffset()) > getBuffer().getSize())
            return false;

        int fbeStructSize = readInt32(_model.fbeOffset() - 8);
        int fbeStructType = readInt32(_model.fbeOffset() - 4);
        if ((fbeStructSize <= 0) || (fbeStructType != fbeType()))
            return false;

        return ((8 + _model.verify()) == fbeStructSize);
    }

    // Serialize the struct value
    public long serialize(com.chronoxor.test.StructSimple value)
    {
        long fbeInitialSize = getBuffer().getSize();

        int fbeStructType = (int)fbeType();
        int fbeStructSize = (int)(8 + _model.fbeAllocationSize(value));
        int fbeStructOffset = (int)(getBuffer().allocate(fbeStructSize) - getBuffer().getOffset());
        assert ((getBuffer().getOffset() + fbeStructOffset + fbeStructSize) <= getBuffer().getSize()) : "Model is broken!";
        if ((getBuffer().getOffset() + fbeStructOffset + fbeStructSize) > getBuffer().getSize())
            return 0;

        fbeStructSize = (int)(8 + _model.set(value));
        getBuffer().resize(fbeInitialSize + fbeStructSize);

        write(_model.fbeOffset() - 8, fbeStructSize);
        write(_model.fbeOffset() - 4, fbeStructType);

        return fbeStructSize;
    }

    // Deserialize the struct value
    public com.chronoxor.test.StructSimple deserialize() { var value = new com.chronoxor.test.StructSimple(); deserialize(value); return value; }
    public long deserialize(com.chronoxor.test.StructSimple value)
    {
        assert ((getBuffer().getOffset() + _model.fbeOffset()) <= getBuffer().getSize()) : "Model is broken!";
        if ((getBuffer().getOffset() + _model.fbeOffset()) > getBuffer().getSize())
            return 0;

        long fbeStructSize = readInt32(_model.fbeOffset() - 8);
        long fbeStructType = readInt32(_model.fbeOffset() - 4);
        assert ((fbeStructSize > 0) && (fbeStructType == fbeType())) : "Model is broken!";
        if ((fbeStructSize <= 0) || (fbeStructType != fbeType()))
            return 8;

        var fbeSize = new com.chronoxor.fbe.Size();
        value = _model.get(fbeSize, value);
        return 8 + fbeSize.value;
    }

    // Move to the next struct value
    public void next(long prev)
    {
        _model.fbeShift(prev);
    }
}
