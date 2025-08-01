//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Fast Binary Encoding EnumInt16 final model
type FinalModelEnumInt16 struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int
}

// Create a new EnumInt16 final model
func NewFinalModelEnumInt16(buffer *fbe.Buffer, offset int) *FinalModelEnumInt16 {
    return &FinalModelEnumInt16{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelEnumInt16) FBEAllocationSize(value *EnumInt16) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelEnumInt16) FBESize() int { return 2 }

// Get the final offset
func (fm *FinalModelEnumInt16) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelEnumInt16) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelEnumInt16) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelEnumInt16) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelEnumInt16) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelEnumInt16) Get() (*EnumInt16, int, error) {
    var value EnumInt16
    size, err := fm.GetValueDefault(&value, EnumInt16(0))
    return &value, size, err
}

// Get the value with provided default value
func (fm *FinalModelEnumInt16) GetDefault(defaults EnumInt16) (*EnumInt16, int, error) {
    var value EnumInt16
    size, err := fm.GetValueDefault(&value, defaults)
    return &value, size, err
}

// Get the value by the given pointer
func (fm *FinalModelEnumInt16) GetValue(value *EnumInt16) (int, error) {
    return fm.GetValueDefault(value, EnumInt16(0))
}

// Get the value by the given pointer with provided default value
func (fm *FinalModelEnumInt16) GetValueDefault(value *EnumInt16, defaults EnumInt16) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return 0, errors.New("model is broken")
    }

    *value = EnumInt16(fbe.ReadInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fm.FBESize(), nil
}

// Set the value by the given pointer
func (fm *FinalModelEnumInt16) Set(value *EnumInt16) (int, error) {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FinalModelEnumInt16) SetValue(value EnumInt16) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteInt16(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), int16(value))
    return fm.FBESize(), nil
}
