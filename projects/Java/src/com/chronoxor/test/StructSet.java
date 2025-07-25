//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.15.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test;

public class StructSet implements Comparable<Object>
{
    public java.util.HashSet<Byte> f1 = new java.util.HashSet<Byte>();
    public java.util.HashSet<EnumSimple> f2 = new java.util.HashSet<EnumSimple>();
    public java.util.HashSet<FlagsSimple> f3 = new java.util.HashSet<FlagsSimple>();
    public java.util.HashSet<StructSimple> f4 = new java.util.HashSet<StructSimple>();

    public static final long fbeTypeConst = 132;
    public long fbeType() { return fbeTypeConst; }

    public StructSet() {}

    public StructSet(java.util.HashSet<Byte> f1, java.util.HashSet<EnumSimple> f2, java.util.HashSet<FlagsSimple> f3, java.util.HashSet<StructSimple> f4)
    {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
    }

    public StructSet(StructSet other)
    {
        this.f1 = other.f1;
        this.f2 = other.f2;
        this.f3 = other.f3;
        this.f4 = other.f4;
    }

    public StructSet clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new com.chronoxor.test.fbe.StructSetModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new com.chronoxor.test.fbe.StructSetModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!StructSet.class.isAssignableFrom(other.getClass()))
            return -1;

        final StructSet obj = (StructSet)other;

        int result = 0;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!StructSet.class.isAssignableFrom(other.getClass()))
            return false;

        final StructSet obj = (StructSet)other;

        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("StructSet(");
        if (f1 != null)
        {
            boolean first = true;
            sb.append("f1=[").append(f1.size()).append("]{");
            for (var item : f1)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("}");
        }
        else
            sb.append("f1=[0]{}");
        if (f2 != null)
        {
            boolean first = true;
            sb.append(",f2=[").append(f2.size()).append("]{");
            for (var item : f2)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("}");
        }
        else
            sb.append(",f2=[0]{}");
        if (f3 != null)
        {
            boolean first = true;
            sb.append(",f3=[").append(f3.size()).append("]{");
            for (var item : f3)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("}");
        }
        else
            sb.append(",f3=[0]{}");
        if (f4 != null)
        {
            boolean first = true;
            sb.append(",f4=[").append(f4.size()).append("]{");
            for (var item : f4)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("}");
        }
        else
            sb.append(",f4=[0]{}");
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return com.chronoxor.test.fbe.Json.getEngine().toJson(this); }
    public static StructSet fromJson(String json) { return com.chronoxor.test.fbe.Json.getEngine().fromJson(json, StructSet.class); }
}
