//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding test receiver
type Receiver struct {
    *fbe.Receiver
    protoReceiver *proto.Receiver

}

// Create a new test receiver with an empty buffer
func NewReceiver() *Receiver {
    return NewReceiverWithBuffer(fbe.NewEmptyBuffer())
}

// Create a new test receiver with the given buffer
func NewReceiverWithBuffer(buffer *fbe.Buffer) *Receiver {
    receiver := &Receiver{
        fbe.NewReceiver(buffer, false),
        proto.NewReceiverWithBuffer(buffer),
    }
    receiver.SetupHandlerOnReceive(receiver)
    return receiver
}

// Imported receivers

// Get the proto receiver
func (r *Receiver) ProtoReceiver() *proto.Receiver { return r.protoReceiver }
// Set the proto receiver
func (r *Receiver) SetProtoReceiver(receiver *proto.Receiver) { r.protoReceiver = receiver }

// Setup handlers
func (r *Receiver) SetupHandlers(handlers interface{}) {
    r.Receiver.SetupHandlers(handlers)
    r.protoReceiver.SetupHandlers(handlers)
}


// Receive message handler
func (r *Receiver) OnReceive(fbeType int, buffer []byte) (bool, error) {
    switch fbeType {
    default:
        _ = fbeType
        break
    }

    if r.protoReceiver != nil {
        if ok, err := r.protoReceiver.OnReceive(fbeType, buffer); ok {
            return ok, err
        }
    }

    return false, nil
}
