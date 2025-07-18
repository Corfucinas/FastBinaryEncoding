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

// EnumUInt64 enum key
type EnumUInt64Key uint64

// Convert EnumUInt64 enum key to string
func (k EnumUInt64Key) String() string {
    return EnumUInt64(k).String()
}

// EnumUInt64 enum
type EnumUInt64 uint64

// EnumUInt64 enum values
//noinspection GoSnakeCaseUsage
const (
    EnumUInt64_ENUM_VALUE_0 = EnumUInt64(0 + 0)
    EnumUInt64_ENUM_VALUE_1 = EnumUInt64(0 + 0)
    EnumUInt64_ENUM_VALUE_2 = EnumUInt64(0 + 1)
    EnumUInt64_ENUM_VALUE_3 = EnumUInt64(0xFFFFFFFFFFFFFFFE + 0)
    EnumUInt64_ENUM_VALUE_4 = EnumUInt64(0xFFFFFFFFFFFFFFFE + 1)
    EnumUInt64_ENUM_VALUE_5 = EnumUInt64(EnumUInt64_ENUM_VALUE_3)
)

// Create a new EnumUInt64 enum
func NewEnumUInt64() *EnumUInt64 {
    return new(EnumUInt64)
}

// Create a new EnumUInt64 enum from the given value
func NewEnumUInt64FromValue(value uint64) *EnumUInt64 {
    result := EnumUInt64(value)
    return &result
}

// Get the enum key
func (e EnumUInt64) Key() EnumUInt64Key {
    return EnumUInt64Key(e)
}

// Convert enum to optional
func (e *EnumUInt64) Optional() *EnumUInt64 {
    return e
}

// Convert enum to string
func (e EnumUInt64) String() string {
    if e == EnumUInt64_ENUM_VALUE_0 {
        return "ENUM_VALUE_0"
    }
    if e == EnumUInt64_ENUM_VALUE_1 {
        return "ENUM_VALUE_1"
    }
    if e == EnumUInt64_ENUM_VALUE_2 {
        return "ENUM_VALUE_2"
    }
    if e == EnumUInt64_ENUM_VALUE_3 {
        return "ENUM_VALUE_3"
    }
    if e == EnumUInt64_ENUM_VALUE_4 {
        return "ENUM_VALUE_4"
    }
    if e == EnumUInt64_ENUM_VALUE_5 {
        return "ENUM_VALUE_5"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e EnumUInt64) MarshalJSON() ([]byte, error) {
    value := uint64(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *EnumUInt64) UnmarshalJSON(buffer []byte) error {
    var result uint64
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = EnumUInt64(result)
    return nil
}
