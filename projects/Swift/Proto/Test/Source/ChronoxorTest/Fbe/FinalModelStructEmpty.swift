//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding StructEmpty final model
public class FinalModelStructEmpty: FinalModel {
    public var _buffer: Buffer
    public var _offset: Int


    // Field type
    public var fbeType: Int = fbeTypeConst

    public static let fbeTypeConst: Int = 143

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

    }

    // Get the allocation size
    public func fbeAllocationSize(value fbeValue: StructEmpty) -> Int {
        return 0
    }

    // Check if the struct value is valid
    public func verify() -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeResult = verifyFields()
        _buffer.unshift(offset: fbeOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    public func verifyFields() -> Int {
        return 0
    }

    // Get the struct value
    public func get(size: inout Size) -> StructEmpty {
        var fbeValue = StructEmpty()
        return get(size: &size, fbeValue: &fbeValue)
    }

    // Get the struct value
    public func get(size: inout Size, fbeValue: inout StructEmpty) -> StructEmpty {
        _buffer.shift(offset: fbeOffset)
        size.value = getFields(fbeValue: &fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout StructEmpty) -> Int {
        return 0
    }

    // Set the struct value
    public func set(value fbeValue: StructEmpty) throws -> Int {
        _buffer.shift(offset: fbeOffset)
        let fbeSize = try setFields(fbeValue: fbeValue)
        _buffer.unshift(offset: fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    public func setFields(fbeValue: StructEmpty) throws -> Int {
        return 0
    }
}
