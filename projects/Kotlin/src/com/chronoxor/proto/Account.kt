// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class Account : Comparable<Any?>
{
    var id: Int = 0
    var name: String = ""
    var state: State = State.fromSet(java.util.EnumSet.of(State.initialized.value, State.bad.value))
    var wallet: Balance = Balance()
    var asset: Balance? = null
    var orders: java.util.ArrayList<Order> = java.util.ArrayList()

    constructor()

    constructor(id: Int, name: String, state: State, wallet: Balance, asset: Balance?, orders: java.util.ArrayList<Order>)
    {
        this.id = id
        this.name = name
        this.state = state
        this.wallet = wallet
        this.asset = asset
        this.orders = orders
    }

    @Suppress("UNUSED_PARAMETER")
    constructor(other: Account)
    {
        this.id = other.id
        this.name = other.name
        this.state = other.state
        this.wallet = other.wallet
        this.asset = other.asset
        this.orders = other.orders
    }

    open fun clone(): Account
    {
        // Serialize the struct to the FBE stream
        val writer = com.chronoxor.proto.fbe.AccountModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = com.chronoxor.proto.fbe.AccountModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!Account::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Account? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        result = id.compareTo(obj.id)
        if (result != 0)
            return result
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!Account::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Account? ?: return false

        if (id != obj.id)
            return false
        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        hash = hash * 31 + id.hashCode()
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("Account(")
        sb.append("id="); sb.append(id)
        sb.append(",name="); sb.append("\"").append(name).append("\"")
        sb.append(",state="); sb.append(state)
        sb.append(",wallet="); sb.append(wallet)
        sb.append(",asset="); if (asset != null) sb.append(asset!!); else sb.append("null")
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",orders=[").append(orders.size).append("][")
            for (item in orders)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append("]")
        }
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = com.chronoxor.proto.fbe.Json.engine.toJson(this)
    companion object
    {
        fun fromJson(json: String): Account = com.chronoxor.proto.fbe.Json.engine.fromJson(json, Account::class.java)
    }
}
