//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
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

// Fast Binary Encoding StructSimple set field model
type FieldModelSetStructSimple struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int

    // Set item field model
    model *FieldModelStructSimple
}

// Create a new StructSimple set field model
func NewFieldModelSetStructSimple(buffer *fbe.Buffer, offset int) *FieldModelSetStructSimple {
    fbeResult := FieldModelSetStructSimple{buffer: buffer, offset: offset}
    fbeResult.model = NewFieldModelStructSimple(buffer, offset)
    return &fbeResult
}

// Get the field size
func (fm *FieldModelSetStructSimple) FBESize() int { return 4 }

// Get the field extra size
func (fm *FieldModelSetStructSimple) FBEExtra() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeSetOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeSetOffset == 0) || ((fm.buffer.Offset() + fbeSetOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset))

    fbeResult := 0
    fm.model.SetFBEOffset(fbeSetOffset + 4)
    for i := fbeSetSize; i > 0; i-- {
        fbeResult += fm.model.FBESize() + fm.model.FBEExtra()
        fm.model.FBEShift(fm.model.FBESize())
    }
    return fbeResult
}

// Get the field offset
func (fm *FieldModelSetStructSimple) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelSetStructSimple) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelSetStructSimple) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelSetStructSimple) FBEUnshift(size int) { fm.offset -= size }

// Get the set offset
func (fm *FieldModelSetStructSimple) Offset() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeSetOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fbeSetOffset
}

// Get the set size
func (fm *FieldModelSetStructSimple) Size() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeSetOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeSetOffset == 0) || ((fm.buffer.Offset() + fbeSetOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset))
    return fbeSetSize
}

// Set index operator
func (fm *FieldModelSetStructSimple) GetItem(index int) (*FieldModelStructSimple, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return nil, errors.New("model is broken")
    }

    fbeSetOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeSetOffset == 0) || ((fm.buffer.Offset() + fbeSetOffset + 4) > fm.buffer.Size()) {
        return nil, errors.New("model is broken")
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset))
    if index >= fbeSetSize {
        return nil, errors.New("index is out of bounds")
    }

    fm.model.SetFBEOffset(fbeSetOffset + 4)
    fm.model.FBEShift(index * fm.model.FBESize())
    return fm.model, nil
}

// Resize the set and get its first model
func (fm *FieldModelSetStructSimple) Resize(size int) (*FieldModelStructSimple, error) {
    fbeSetSize := size * fm.model.FBESize()
    fbeSetOffset := fm.buffer.Allocate(4 + fbeSetSize) - fm.buffer.Offset()
    if (fbeSetOffset == 0) || ((fm.buffer.Offset() + fbeSetOffset + 4) > fm.buffer.Size()) {
        return nil, errors.New("model is broken")
    }

    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(fbeSetOffset))
    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset, uint32(size))
    fbe.WriteCount(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset + 4, 0, fbeSetSize)

    fm.model.SetFBEOffset(fbeSetOffset + 4)
    return fm.model, nil
}

// Check if the set value is valid
func (fm *FieldModelSetStructSimple) Verify() bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return true
    }

    fbeSetOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if fbeSetOffset == 0 {
        return true
    }

    if (fm.buffer.Offset() + fbeSetOffset + 4) > fm.buffer.Size() {
        return false
    }

    fbeSetSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeSetOffset))

    fm.model.SetFBEOffset(fbeSetOffset + 4)
    for i := fbeSetSize; i > 0; i-- {
        if !fm.model.Verify() {
            return false
        }
        fm.model.FBEShift(fm.model.FBESize())
    }

    return true
}

// Get the set value
func (fm *FieldModelSetStructSimple) Get() (map[StructSimpleKey]StructSimple, error) {
    values := make(map[StructSimpleKey]StructSimple)

    fbeSetSize := fm.Size()
    if fbeSetSize == 0 {
        return values, nil
    }

    fbeModel, err := fm.GetItem(0)
    if err != nil {
        return values, err
    }

    for i := fbeSetSize; i > 0; i-- {
        value, err := fbeModel.Get()
        if err != nil {
            return values, err
        }
        values[value.Key()] = *value
        fbeModel.FBEShift(fbeModel.FBESize())
    }

    return values, nil
}

// Set the set value
func (fm *FieldModelSetStructSimple) Set(values map[StructSimpleKey]StructSimple) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    fbeModel, err := fm.Resize(len(values))
    if err != nil {
        return err
    }

    for _, value := range values {
        err := fbeModel.Set(&value)
        if err != nil {
            return err
        }
        fbeModel.FBEShift(fbeModel.FBESize())
    }

    return nil
}
