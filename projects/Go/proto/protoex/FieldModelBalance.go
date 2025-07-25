//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

package protoex

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding Balance field model
type FieldModelBalance struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int

    *proto.FieldModelBalance
    Locked *fbe.FieldModelDouble
}

// Create a new Balance field model
func NewFieldModelBalance(buffer *fbe.Buffer, offset int) *FieldModelBalance {
    fbeResult := FieldModelBalance{buffer: buffer, offset: offset}
    fbeResult.FieldModelBalance = proto.NewFieldModelBalance(buffer, 4 + 4)
    fbeResult.Locked = fbe.NewFieldModelDouble(buffer, fbeResult.FieldModelBalance.FBEOffset() + fbeResult.FieldModelBalance.FBEBody() - 4 - 4)
    return &fbeResult
}

// Get the field size
func (fm *FieldModelBalance) FBESize() int { return 4 }

// Get the field body size
func (fm *FieldModelBalance) FBEBody() int {
    fbeResult := 4 + 4 +
        fm.FieldModelBalance.FBEBody() - 4 - 4 +
        fm.Locked.FBESize() +
        0
    return fbeResult
}

// Get the field extra size
func (fm *FieldModelBalance) FBEExtra() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fm.buffer.Shift(fbeStructOffset)

    fbeResult := fm.FBEBody() +
        fm.FieldModelBalance.FBEExtra() + 
        fm.Locked.FBEExtra() +
        0

    fm.buffer.Unshift(fbeStructOffset)

    return fbeResult
}

// Get the field type
func (fm *FieldModelBalance) FBEType() int { return fm.FieldModelBalance.FBEType() }

// Get the field offset
func (fm *FieldModelBalance) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelBalance) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelBalance) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelBalance) FBEUnshift(size int) { fm.offset -= size }

// Check if the struct value is valid
func (fm *FieldModelBalance) Verify() bool { return fm.VerifyType(true) }

// Check if the struct value and its type are valid
func (fm *FieldModelBalance) VerifyType(fbeVerifyType bool) bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return true
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4 + 4) > fm.buffer.Size()) {
        return false
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset))
    if fbeStructSize < (4 + 4) {
        return false
    }

    fbeStructType := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset + 4))
    if fbeVerifyType && (fbeStructType != fm.FBEType()) {
        return false
    }

    fm.buffer.Shift(fbeStructOffset)
    fbeResult := fm.VerifyFields(fbeStructSize)
    fm.buffer.Unshift(fbeStructOffset)
    return fbeResult
}

// // Check if the struct value fields are valid
func (fm *FieldModelBalance) VerifyFields(fbeStructSize int) bool {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.FieldModelBalance.FBEBody() - 4 - 4) > fbeStructSize {
        return true
    }
    if !fm.FieldModelBalance.VerifyFields(fbeStructSize) {
        return false
    }
    fbeCurrentSize += fm.FieldModelBalance.FBEBody() - 4 - 4

    if (fbeCurrentSize + fm.Locked.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.Locked.Verify() {
        return false
    }
    fbeCurrentSize += fm.Locked.FBESize()

    return true
}

// Get the struct value (begin phase)
func (fm *FieldModelBalance) GetBegin() (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, nil
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4 + 4) > fm.buffer.Size()) {
        return 0, errors.New("model is broken")
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset))
    if fbeStructSize < (4 + 4) {
        return 0, errors.New("model is broken")
    }

    fm.buffer.Shift(fbeStructOffset)
    return fbeStructOffset, nil
}

// Get the struct value (end phase)
func (fm *FieldModelBalance) GetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Get the struct value
func (fm *FieldModelBalance) Get() (*Balance, error) {
    fbeResult := NewBalance()
    return fbeResult, fm.GetValue(fbeResult)
}

// Get the struct value by the given pointer
func (fm *FieldModelBalance) GetValue(fbeValue *Balance) error {
    fbeBegin, err := fm.GetBegin()
    if fbeBegin == 0 {
        return err
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset()))
    fm.GetFields(fbeValue, fbeStructSize)
    fm.GetEnd(fbeBegin)
    return nil
}

// Get the struct fields values
func (fm *FieldModelBalance) GetFields(fbeValue *Balance, fbeStructSize int) {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.FieldModelBalance.FBEBody() - 4 - 4) <= fbeStructSize {
        fm.FieldModelBalance.GetFields(fbeValue.Balance, fbeStructSize)
    }
    fbeCurrentSize += fm.FieldModelBalance.FBEBody() - 4 - 4

    if (fbeCurrentSize + fm.Locked.FBESize()) <= fbeStructSize {
        fbeValue.Locked, _ = fm.Locked.GetDefault(float64(0.0))
    } else {
        fbeValue.Locked = float64(0.0)
    }
    fbeCurrentSize += fm.Locked.FBESize()
}

// Set the struct value (begin phase)
func (fm *FieldModelBalance) SetBegin() (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbeStructSize := fm.FBEBody()
    fbeStructOffset := fm.buffer.Allocate(fbeStructSize) - fm.buffer.Offset()
    if (fbeStructOffset <= 0) || ((fm.buffer.Offset() + fbeStructOffset + fbeStructSize) > fm.buffer.Size()) {
        return 0, errors.New("model is broken")
    }

    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(fbeStructOffset))
    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset, uint32(fbeStructSize))
    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset + 4, uint32(fm.FBEType()))

    fm.buffer.Shift(fbeStructOffset)
    return fbeStructOffset, nil
}

// Set the struct value (end phase)
func (fm *FieldModelBalance) SetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Set the struct value
func (fm *FieldModelBalance) Set(fbeValue *Balance) error {
    fbeBegin, err := fm.SetBegin()
    if fbeBegin == 0 {
        return err
    }

    err = fm.SetFields(fbeValue)
    fm.SetEnd(fbeBegin)
    return err
}

// Set the struct fields values
func (fm *FieldModelBalance) SetFields(fbeValue *Balance) error {
    var err error = nil

    if err = fm.FieldModelBalance.SetFields(fbeValue.Balance); err != nil {
        return err
    }
    if err = fm.Locked.Set(fbeValue.Locked); err != nil {
        return err
    }
    return err
}
