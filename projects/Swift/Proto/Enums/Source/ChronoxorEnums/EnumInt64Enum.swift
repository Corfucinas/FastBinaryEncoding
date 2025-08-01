//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

import Foundation

public enum EnumInt64Enum {
    typealias RawValue = Int64
    case ENUM_VALUE_0
    case ENUM_VALUE_1
    case ENUM_VALUE_2
    case ENUM_VALUE_3
    case ENUM_VALUE_4
    case ENUM_VALUE_5

    var rawValue: RawValue {
        switch self {
        case .ENUM_VALUE_0: return 0 + 0
        case .ENUM_VALUE_1: return -9223372036854775807 + 0
        case .ENUM_VALUE_2: return -9223372036854775807 + 1
        case .ENUM_VALUE_3: return 9223372036854775806 + 0
        case .ENUM_VALUE_4: return 9223372036854775806 + 1
        case .ENUM_VALUE_5: return Self.ENUM_VALUE_3.rawValue
        }
    }

    init(value: Int8) { self = EnumInt64Enum(rawValue: NSNumber(value: value).int64Value) }
    init(value: Int16) { self = EnumInt64Enum(rawValue: NSNumber(value: value).int64Value) }
    init(value: Int32) { self = EnumInt64Enum(rawValue: NSNumber(value: value).int64Value) }
    init(value: Int64) { self = EnumInt64Enum(rawValue: NSNumber(value: value).int64Value) }
    init(value: EnumInt64Enum) { self = EnumInt64Enum(rawValue: value.rawValue) }
    init(rawValue: Int64) { self = Self.mapValue(value: rawValue)! }

    var description: String {
        switch self {
        case .ENUM_VALUE_0: return "ENUM_VALUE_0"
        case .ENUM_VALUE_1: return "ENUM_VALUE_1"
        case .ENUM_VALUE_2: return "ENUM_VALUE_2"
        case .ENUM_VALUE_3: return "ENUM_VALUE_3"
        case .ENUM_VALUE_4: return "ENUM_VALUE_4"
        case .ENUM_VALUE_5: return "ENUM_VALUE_5"
        }
    }

    static let rawValuesMap: [RawValue: EnumInt64Enum] = {
        var value = [RawValue: EnumInt64Enum]()
        value[EnumInt64Enum.ENUM_VALUE_0.rawValue] = .ENUM_VALUE_0
        value[EnumInt64Enum.ENUM_VALUE_1.rawValue] = .ENUM_VALUE_1
        value[EnumInt64Enum.ENUM_VALUE_2.rawValue] = .ENUM_VALUE_2
        value[EnumInt64Enum.ENUM_VALUE_3.rawValue] = .ENUM_VALUE_3
        value[EnumInt64Enum.ENUM_VALUE_4.rawValue] = .ENUM_VALUE_4
        value[EnumInt64Enum.ENUM_VALUE_5.rawValue] = .ENUM_VALUE_5
        return value
    }()

    static func mapValue(value: Int64) -> EnumInt64Enum? {
        return rawValuesMap[value]
    }
}
