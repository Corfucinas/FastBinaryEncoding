//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// EnumInt16 enum key
type EnumInt16Key int16

// Convert EnumInt16 enum key to string
func (k EnumInt16Key) String() string {
    return EnumInt16(k).String()
}

// EnumInt16 enum
type EnumInt16 int16

// EnumInt16 enum values
//noinspection GoSnakeCaseUsage
const (
    EnumInt16_ENUM_VALUE_0 = EnumInt16(0 + 0)
    EnumInt16_ENUM_VALUE_1 = EnumInt16(-32768 + 0)
    EnumInt16_ENUM_VALUE_2 = EnumInt16(-32768 + 1)
    EnumInt16_ENUM_VALUE_3 = EnumInt16(32766 + 0)
    EnumInt16_ENUM_VALUE_4 = EnumInt16(32766 + 1)
    EnumInt16_ENUM_VALUE_5 = EnumInt16(EnumInt16_ENUM_VALUE_3)
)

// Create a new EnumInt16 enum
func NewEnumInt16() *EnumInt16 {
    return new(EnumInt16)
}

// Create a new EnumInt16 enum from the given value
func NewEnumInt16FromValue(value int16) *EnumInt16 {
    result := EnumInt16(value)
    return &result
}

// Get the enum key
func (e EnumInt16) Key() EnumInt16Key {
    return EnumInt16Key(e)
}

// Convert enum to optional
func (e *EnumInt16) Optional() *EnumInt16 {
    return e
}

// Convert enum to string
func (e EnumInt16) String() string {
    if e == EnumInt16_ENUM_VALUE_0 {
        return "ENUM_VALUE_0"
    }
    if e == EnumInt16_ENUM_VALUE_1 {
        return "ENUM_VALUE_1"
    }
    if e == EnumInt16_ENUM_VALUE_2 {
        return "ENUM_VALUE_2"
    }
    if e == EnumInt16_ENUM_VALUE_3 {
        return "ENUM_VALUE_3"
    }
    if e == EnumInt16_ENUM_VALUE_4 {
        return "ENUM_VALUE_4"
    }
    if e == EnumInt16_ENUM_VALUE_5 {
        return "ENUM_VALUE_5"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e EnumInt16) MarshalJSON() ([]byte, error) {
    value := int16(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *EnumInt16) UnmarshalJSON(buffer []byte) error {
    var result int16
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = EnumInt16(result)
    return nil
}
