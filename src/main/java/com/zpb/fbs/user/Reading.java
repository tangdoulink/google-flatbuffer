// automatically generated by the FlatBuffers compiler, do not modify

package com.zpb.fbs.user;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * 读书
 */
@SuppressWarnings("unused")
public final class Reading extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static Reading getRootAsReading(ByteBuffer _bb) { return getRootAsReading(_bb, new Reading()); }
  public static Reading getRootAsReading(ByteBuffer _bb, Reading obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Reading __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String reading() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer readingAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer readingInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createReading(FlatBufferBuilder builder,
      int readingOffset) {
    builder.startTable(1);
    Reading.addReading(builder, readingOffset);
    return Reading.endReading(builder);
  }

  public static void startReading(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addReading(FlatBufferBuilder builder, int readingOffset) { builder.addOffset(0, readingOffset, 0); }
  public static int endReading(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Reading get(int j) { return get(new Reading(), j); }
    public Reading get(Reading obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

