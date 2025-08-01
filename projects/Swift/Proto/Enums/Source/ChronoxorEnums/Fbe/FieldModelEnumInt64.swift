//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

import ChronoxorFbe

// Fast Binary Encoding EnumInt64 field model
public class FieldModelEnumInt64: FieldModel {

    public var _buffer: Buffer = Buffer()
    public var _offset: Int = 0

    public var fbeSize: Int = 8

    public required init() {
        _buffer = Buffer()
        _offset = 0
    }

    // Get the value
    public func get(defaults: EnumInt64 = EnumInt64()) -> EnumInt64 {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return defaults
        }

        return EnumInt64(value: readInt64(offset: fbeOffset))
    }

    // Set the value
    public func set(value: EnumInt64) throws {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return
        }

        write(offset: fbeOffset, value: value.raw)
    }
}
