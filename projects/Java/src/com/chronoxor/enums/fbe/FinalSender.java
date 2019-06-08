// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.3.0.0

package com.chronoxor.enums.fbe;

// Fast Binary Encoding com.chronoxor.enums final sender
public class FinalSender extends com.chronoxor.fbe.Sender
{
    // Sender models accessors
    public final EnumsFinalModel EnumsModel;

    public FinalSender()
    {
        super(true);
        EnumsModel = new EnumsFinalModel(getBuffer());
    }
    public FinalSender(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, true);
        EnumsModel = new EnumsFinalModel(getBuffer());
    }

    public long send(com.chronoxor.enums.Enums value)
    {
        // Serialize the value into the FBE stream
        long serialized = EnumsModel.serialize(value);
        assert (serialized > 0) : "com.chronoxor.enums.Enums serialization failed!";
        assert EnumsModel.verify() : "com.chronoxor.enums.Enums validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }

    // Send message handler
    @Override
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("com.chronoxor.enums.fbe.Sender.onSend() not implemented!"); }
}
