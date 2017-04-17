/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ztravel.paygate.thrift.model;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 交易查询结果
 */
public class RefundQueryResponse implements org.apache.thrift.TBase<RefundQueryResponse, RefundQueryResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RefundQueryResponse");

  private static final org.apache.thrift.protocol.TField REFUND_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("refundNum", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RET_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("retCode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RET_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("retMsg", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXTRA_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("extraInfos", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RefundQueryResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RefundQueryResponseTupleSchemeFactory());
  }

  /**
   * 退单号
   */
  public String refundNum; // required
  /**
   * 返回码, 0000 代表处理成功
   */
  public String retCode; // required
  /**
   * 返回信息，是对返回码的详细描述
   */
  public String retMsg; // optional
  /**
   * 额外的返回信息
   */
  public Map<String,String> extraInfos; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 退单号
     */
    REFUND_NUM((short)1, "refundNum"),
    /**
     * 返回码, 0000 代表处理成功
     */
    RET_CODE((short)2, "retCode"),
    /**
     * 返回信息，是对返回码的详细描述
     */
    RET_MSG((short)3, "retMsg"),
    /**
     * 额外的返回信息
     */
    EXTRA_INFOS((short)4, "extraInfos");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REFUND_NUM
          return REFUND_NUM;
        case 2: // RET_CODE
          return RET_CODE;
        case 3: // RET_MSG
          return RET_MSG;
        case 4: // EXTRA_INFOS
          return EXTRA_INFOS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.RET_MSG,_Fields.EXTRA_INFOS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REFUND_NUM, new org.apache.thrift.meta_data.FieldMetaData("refundNum", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RET_CODE, new org.apache.thrift.meta_data.FieldMetaData("retCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RET_MSG, new org.apache.thrift.meta_data.FieldMetaData("retMsg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTRA_INFOS, new org.apache.thrift.meta_data.FieldMetaData("extraInfos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RefundQueryResponse.class, metaDataMap);
  }

  public RefundQueryResponse() {
  }

  public RefundQueryResponse(
    String refundNum,
    String retCode)
  {
    this();
    this.refundNum = refundNum;
    this.retCode = retCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RefundQueryResponse(RefundQueryResponse other) {
    if (other.isSetRefundNum()) {
      this.refundNum = other.refundNum;
    }
    if (other.isSetRetCode()) {
      this.retCode = other.retCode;
    }
    if (other.isSetRetMsg()) {
      this.retMsg = other.retMsg;
    }
    if (other.isSetExtraInfos()) {
      Map<String,String> __this__extraInfos = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.extraInfos.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__extraInfos_copy_key = other_element_key;

        String __this__extraInfos_copy_value = other_element_value;

        __this__extraInfos.put(__this__extraInfos_copy_key, __this__extraInfos_copy_value);
      }
      this.extraInfos = __this__extraInfos;
    }
  }

  public RefundQueryResponse deepCopy() {
    return new RefundQueryResponse(this);
  }

  @Override
  public void clear() {
    this.refundNum = null;
    this.retCode = null;
    this.retMsg = null;
    this.extraInfos = null;
  }

  /**
   * 退单号
   */
  public String getRefundNum() {
    return this.refundNum;
  }

  /**
   * 退单号
   */
  public RefundQueryResponse setRefundNum(String refundNum) {
    this.refundNum = refundNum;
    return this;
  }

  public void unsetRefundNum() {
    this.refundNum = null;
  }

  /** Returns true if field refundNum is set (has been assigned a value) and false otherwise */
  public boolean isSetRefundNum() {
    return this.refundNum != null;
  }

  public void setRefundNumIsSet(boolean value) {
    if (!value) {
      this.refundNum = null;
    }
  }

  /**
   * 返回码, 0000 代表处理成功
   */
  public String getRetCode() {
    return this.retCode;
  }

  /**
   * 返回码, 0000 代表处理成功
   */
  public RefundQueryResponse setRetCode(String retCode) {
    this.retCode = retCode;
    return this;
  }

  public void unsetRetCode() {
    this.retCode = null;
  }

  /** Returns true if field retCode is set (has been assigned a value) and false otherwise */
  public boolean isSetRetCode() {
    return this.retCode != null;
  }

  public void setRetCodeIsSet(boolean value) {
    if (!value) {
      this.retCode = null;
    }
  }

  /**
   * 返回信息，是对返回码的详细描述
   */
  public String getRetMsg() {
    return this.retMsg;
  }

  /**
   * 返回信息，是对返回码的详细描述
   */
  public RefundQueryResponse setRetMsg(String retMsg) {
    this.retMsg = retMsg;
    return this;
  }

  public void unsetRetMsg() {
    this.retMsg = null;
  }

  /** Returns true if field retMsg is set (has been assigned a value) and false otherwise */
  public boolean isSetRetMsg() {
    return this.retMsg != null;
  }

  public void setRetMsgIsSet(boolean value) {
    if (!value) {
      this.retMsg = null;
    }
  }

  public int getExtraInfosSize() {
    return (this.extraInfos == null) ? 0 : this.extraInfos.size();
  }

  public void putToExtraInfos(String key, String val) {
    if (this.extraInfos == null) {
      this.extraInfos = new HashMap<String,String>();
    }
    this.extraInfos.put(key, val);
  }

  /**
   * 额外的返回信息
   */
  public Map<String,String> getExtraInfos() {
    return this.extraInfos;
  }

  /**
   * 额外的返回信息
   */
  public RefundQueryResponse setExtraInfos(Map<String,String> extraInfos) {
    this.extraInfos = extraInfos;
    return this;
  }

  public void unsetExtraInfos() {
    this.extraInfos = null;
  }

  /** Returns true if field extraInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetExtraInfos() {
    return this.extraInfos != null;
  }

  public void setExtraInfosIsSet(boolean value) {
    if (!value) {
      this.extraInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REFUND_NUM:
      if (value == null) {
        unsetRefundNum();
      } else {
        setRefundNum((String)value);
      }
      break;

    case RET_CODE:
      if (value == null) {
        unsetRetCode();
      } else {
        setRetCode((String)value);
      }
      break;

    case RET_MSG:
      if (value == null) {
        unsetRetMsg();
      } else {
        setRetMsg((String)value);
      }
      break;

    case EXTRA_INFOS:
      if (value == null) {
        unsetExtraInfos();
      } else {
        setExtraInfos((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REFUND_NUM:
      return getRefundNum();

    case RET_CODE:
      return getRetCode();

    case RET_MSG:
      return getRetMsg();

    case EXTRA_INFOS:
      return getExtraInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REFUND_NUM:
      return isSetRefundNum();
    case RET_CODE:
      return isSetRetCode();
    case RET_MSG:
      return isSetRetMsg();
    case EXTRA_INFOS:
      return isSetExtraInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RefundQueryResponse)
      return this.equals((RefundQueryResponse)that);
    return false;
  }

  public boolean equals(RefundQueryResponse that) {
    if (that == null)
      return false;

    boolean this_present_refundNum = true && this.isSetRefundNum();
    boolean that_present_refundNum = true && that.isSetRefundNum();
    if (this_present_refundNum || that_present_refundNum) {
      if (!(this_present_refundNum && that_present_refundNum))
        return false;
      if (!this.refundNum.equals(that.refundNum))
        return false;
    }

    boolean this_present_retCode = true && this.isSetRetCode();
    boolean that_present_retCode = true && that.isSetRetCode();
    if (this_present_retCode || that_present_retCode) {
      if (!(this_present_retCode && that_present_retCode))
        return false;
      if (!this.retCode.equals(that.retCode))
        return false;
    }

    boolean this_present_retMsg = true && this.isSetRetMsg();
    boolean that_present_retMsg = true && that.isSetRetMsg();
    if (this_present_retMsg || that_present_retMsg) {
      if (!(this_present_retMsg && that_present_retMsg))
        return false;
      if (!this.retMsg.equals(that.retMsg))
        return false;
    }

    boolean this_present_extraInfos = true && this.isSetExtraInfos();
    boolean that_present_extraInfos = true && that.isSetExtraInfos();
    if (this_present_extraInfos || that_present_extraInfos) {
      if (!(this_present_extraInfos && that_present_extraInfos))
        return false;
      if (!this.extraInfos.equals(that.extraInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RefundQueryResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RefundQueryResponse typedOther = (RefundQueryResponse)other;

    lastComparison = Boolean.valueOf(isSetRefundNum()).compareTo(typedOther.isSetRefundNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRefundNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.refundNum, typedOther.refundNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRetCode()).compareTo(typedOther.isSetRetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retCode, typedOther.retCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRetMsg()).compareTo(typedOther.isSetRetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retMsg, typedOther.retMsg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtraInfos()).compareTo(typedOther.isSetExtraInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtraInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extraInfos, typedOther.extraInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RefundQueryResponse(");
    boolean first = true;

    sb.append("refundNum:");
    if (this.refundNum == null) {
      sb.append("null");
    } else {
      sb.append(this.refundNum);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("retCode:");
    if (this.retCode == null) {
      sb.append("null");
    } else {
      sb.append(this.retCode);
    }
    first = false;
    if (isSetRetMsg()) {
      if (!first) sb.append(", ");
      sb.append("retMsg:");
      if (this.retMsg == null) {
        sb.append("null");
      } else {
        sb.append(this.retMsg);
      }
      first = false;
    }
    if (isSetExtraInfos()) {
      if (!first) sb.append(", ");
      sb.append("extraInfos:");
      if (this.extraInfos == null) {
        sb.append("null");
      } else {
        sb.append(this.extraInfos);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (refundNum == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'refundNum' was not present! Struct: " + toString());
    }
    if (retCode == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'retCode' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RefundQueryResponseStandardSchemeFactory implements SchemeFactory {
    public RefundQueryResponseStandardScheme getScheme() {
      return new RefundQueryResponseStandardScheme();
    }
  }

  private static class RefundQueryResponseStandardScheme extends StandardScheme<RefundQueryResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RefundQueryResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REFUND_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.refundNum = iprot.readString();
              struct.setRefundNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RET_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.retCode = iprot.readString();
              struct.setRetCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RET_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.retMsg = iprot.readString();
              struct.setRetMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXTRA_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map68 = iprot.readMapBegin();
                struct.extraInfos = new HashMap<String,String>(2*_map68.size);
                for (int _i69 = 0; _i69 < _map68.size; ++_i69)
                {
                  String _key70; // required
                  String _val71; // required
                  _key70 = iprot.readString();
                  _val71 = iprot.readString();
                  struct.extraInfos.put(_key70, _val71);
                }
                iprot.readMapEnd();
              }
              struct.setExtraInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RefundQueryResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.refundNum != null) {
        oprot.writeFieldBegin(REFUND_NUM_FIELD_DESC);
        oprot.writeString(struct.refundNum);
        oprot.writeFieldEnd();
      }
      if (struct.retCode != null) {
        oprot.writeFieldBegin(RET_CODE_FIELD_DESC);
        oprot.writeString(struct.retCode);
        oprot.writeFieldEnd();
      }
      if (struct.retMsg != null) {
        if (struct.isSetRetMsg()) {
          oprot.writeFieldBegin(RET_MSG_FIELD_DESC);
          oprot.writeString(struct.retMsg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.extraInfos != null) {
        if (struct.isSetExtraInfos()) {
          oprot.writeFieldBegin(EXTRA_INFOS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extraInfos.size()));
            for (Map.Entry<String, String> _iter72 : struct.extraInfos.entrySet())
            {
              oprot.writeString(_iter72.getKey());
              oprot.writeString(_iter72.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RefundQueryResponseTupleSchemeFactory implements SchemeFactory {
    public RefundQueryResponseTupleScheme getScheme() {
      return new RefundQueryResponseTupleScheme();
    }
  }

  private static class RefundQueryResponseTupleScheme extends TupleScheme<RefundQueryResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RefundQueryResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.refundNum);
      oprot.writeString(struct.retCode);
      BitSet optionals = new BitSet();
      if (struct.isSetRetMsg()) {
        optionals.set(0);
      }
      if (struct.isSetExtraInfos()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRetMsg()) {
        oprot.writeString(struct.retMsg);
      }
      if (struct.isSetExtraInfos()) {
        {
          oprot.writeI32(struct.extraInfos.size());
          for (Map.Entry<String, String> _iter73 : struct.extraInfos.entrySet())
          {
            oprot.writeString(_iter73.getKey());
            oprot.writeString(_iter73.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RefundQueryResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.refundNum = iprot.readString();
      struct.setRefundNumIsSet(true);
      struct.retCode = iprot.readString();
      struct.setRetCodeIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.retMsg = iprot.readString();
        struct.setRetMsgIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map74 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extraInfos = new HashMap<String,String>(2*_map74.size);
          for (int _i75 = 0; _i75 < _map74.size; ++_i75)
          {
            String _key76; // required
            String _val77; // required
            _key76 = iprot.readString();
            _val77 = iprot.readString();
            struct.extraInfos.put(_key76, _val77);
          }
        }
        struct.setExtraInfosIsSet(true);
      }
    }
  }

}

