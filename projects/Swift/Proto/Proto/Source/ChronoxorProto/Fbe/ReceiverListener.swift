//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe

// Fast Binary Encoding Proto receiver listener
public protocol ReceiverListener: ChronoxorFbe.ReceiveLogListener {
    func onReceive(value: ChronoxorProto.OrderMessage)
    func onReceive(value: ChronoxorProto.BalanceMessage)
    func onReceive(value: ChronoxorProto.AccountMessage)
}

public extension ReceiverListener {
    func onReceive(value: ChronoxorProto.OrderMessage) {}
    func onReceive(value: ChronoxorProto.BalanceMessage) {}
    func onReceive(value: ChronoxorProto.AccountMessage) {}
}
