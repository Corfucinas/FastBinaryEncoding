//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe

// Fast Binary Encoding Order model
public class OrderModel: Model {
    public let model: FieldModelOrder

    public override init(buffer: Buffer = Buffer()) {
        model = FieldModelOrder(buffer: buffer, offset: 4)
        super.init(buffer: buffer)
    }

    // Model size
    public func fbeSize() -> Int { model.fbeSize + model.fbeExtra }
    // Model type
    public var fbeType: Int = fbeTypeConst
    static let fbeTypeConst: Int = FieldModelOrder.fbeTypeConst

    // Check if the struct value is valid
    public func verify() -> Bool {
        if buffer.offset + model.fbeOffset - 4 > buffer.size {
            return false
        }

        let fbeFullSize = Int(readUInt32(offset: model.fbeOffset - 4))
        if fbeFullSize < model.fbeSize {
            return false
        }

        return model.verify()
    }

    // Create a new model (begin phase)
    public func createBegin() throws -> Int {
        return try buffer.allocate(size: 4 + model.fbeSize)
    }

    // Create a new model (end phase)
    public func createEnd(fbeBegin: Int) -> Int {
        let fbeEnd = buffer.size
        let fbeFullSize = fbeEnd - fbeBegin
        write(offset: model.fbeOffset - 4, value: UInt32(fbeFullSize))
        return fbeFullSize
    }

    // Serialize the struct value
    public func serialize(value: Order) throws -> Int {
        let fbeBegin = try createBegin()
        try model.set(value: value)
        return createEnd(fbeBegin: fbeBegin)
    }

    // Deserialize the struct value
    public func deserialize() -> Order { var value = Order(); _ = deserialize(value: &value); return value }
    public func deserialize(value: inout Order) -> Int {
        if buffer.offset + model.fbeOffset - 4 > buffer.size {
            value = Order()
            return 0
        }

        let fbeFullSize = Int(readUInt32(offset: model.fbeOffset - 4))
        if fbeFullSize < model.fbeSize {
            assertionFailure("Model is broken!")
            value = Order()
            return 0
        }

        value = model.get(fbeValue: &value)
        return fbeFullSize
    }

    // Move to the next struct value
    public func next(prev: Int) {
        model.fbeShift(size: prev)
    }
}
