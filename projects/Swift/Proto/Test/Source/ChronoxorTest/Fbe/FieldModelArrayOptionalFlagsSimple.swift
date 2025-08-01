//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding OptionalFlagsSimple array field model
class FieldModelArrayOptionalFlagsSimple: FieldModel {
    private let _model: FieldModelOptionalFlagsSimple

    var _buffer: Buffer
    var _offset: Int
    var size: Int

    // Field size
    var fbeSize: Int {
        return size * _model.fbeSize
    }

    // Field extra size
    var fbeExtra: Int = 0

    // Get the vector offset
    var offset: Int = 0

    required init() {
        let buffer = Buffer()
        let offset = 0

        _buffer = buffer
        _offset = offset
        self.size = 0

        _model = FieldModelOptionalFlagsSimple(buffer: buffer, offset: offset)
    }

    required init(buffer: Buffer, offset: Int, size: Int) {
        _buffer = buffer
        _offset = offset
        self.size =  size

        _model = FieldModelOptionalFlagsSimple(buffer: buffer, offset: offset)
    }

    // Vector index operator
    public func getItem(index: Int) -> FieldModelOptionalFlagsSimple {
        assert(_buffer.offset + fbeOffset + fbeSize <= _buffer.size, "Model is broken!")
        assert(index < size, "Model is broken!")

        _model.fbeOffset = fbeOffset
        _model.fbeShift(size: index * _model.fbeSize)
        return _model
    }

    public func verify() -> Bool {
       if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return false
        }

        _model.fbeOffset = fbeOffset
        var i = size
        while i > 0 {
            if !_model.verify() { return false }
            _model.fbeShift(size: _model.fbeSize)
            i -= 1
        }

        return true
    }

    public func get() -> Array<ChronoxorTest.FlagsSimple?> {
        var values = Array<ChronoxorTest.FlagsSimple?>()
        let fbeModel = getItem(index: 0)
        for _ in 0..<size {
            values.append(fbeModel.get())
            fbeModel.fbeShift(size: fbeModel.fbeSize)
        }

        return values
    }

    public func get(values: inout Array<ChronoxorTest.FlagsSimple?>) {
        values.removeAll()

        let fbeVectorSize = size
        if fbeVectorSize == 0 {
            return
        }

        values.reserveCapacity(fbeVectorSize)

        let fbeModel = getItem(index: 0)
        var i = size
        while i > 0 {
            let value = fbeModel.get()
            values.append(value)
            fbeModel.fbeShift(size: fbeModel.fbeSize)
            i -= 1
        }
    }

    public func set(value values: Array<ChronoxorTest.FlagsSimple?>) throws {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            assertionFailure("Model is broken!")
            return
        }

        let fbeModel = getItem(index: 0)
        for value in values {
            try fbeModel.set(value: value)
            fbeModel.fbeShift(size: fbeModel.fbeSize)
        }
    }
}
