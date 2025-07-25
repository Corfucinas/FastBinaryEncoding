//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums.fbe

// Fast Binary Encoding com.chronoxor.enums receiver
@Suppress("MemberVisibilityCanBePrivate", "PrivatePropertyName", "UNUSED_PARAMETER")
open class Receiver : com.chronoxor.fbe.Receiver, IReceiverListener
{
    // Receiver values accessors

    // Receiver models accessors

    constructor() : super(false)
    {
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, false)
    {
    }

    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: IReceiverListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {

        return false
    }
}
