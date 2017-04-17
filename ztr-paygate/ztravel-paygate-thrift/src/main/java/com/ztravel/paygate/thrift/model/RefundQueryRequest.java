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
 * 交易查询请求
 */
public class RefundQueryRequest implements org.apache.thrift.TBase<RefundQueryRequest, RefundQueryRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RefundQueryRequest");

  private static final org.apache.thrift.protocol.TField PARTNER_FIELD_DESC = new org.apache.thrift.protocol.TField("partner", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REFUND_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("refundNum", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RefundQueryRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RefundQueryRequestTupleSchemeFactory());
  }

  /**
   * partner
   */
  public String partner; // optional
  /**
   * 支付订单号
   */
  public String refundNum; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * partner
     */
    PARTNER((short)1, "partner"),
    /**
     * 支付订单号
     */
    REFUND_NUM((short)2, "refundNum");

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
        case 1: // PARTNER
          return PARTNER;
        case 2: // REFUND_NUM
          return REFUND_NUM;
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
  private _Fields optionals[] = {_Fields.PARTNER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTNER, new org.apache.thrift.meta_data.FieldMetaData("partner", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REFUND_NUM, new org.apache.thrift.meta_data.FieldMetaData("refundNum", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RefundQueryRequest.class, metaDataMap);
  }

  public RefundQueryRequest() {
  }

  public RefundQueryRequest(
    String refundNum)
  {
    this();
    this.refundNum = refundNum;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RefundQueryRequest(RefundQueryRequest other) {
    if (other.isSetPartner()) {
      this.partner = other.partner;
    }
    if (other.isSetRefundNum()) {
      this.refundNum = other.refundNum;
    }
  }

  public RefundQueryRequest deepCopy() {
    return new RefundQueryRequest(this);
  }

  @Override
  public void clear() {
    this.partner = null;
    this.refundNum = null;
  }

  /**
   * partner
   */
  public String getPartner() {
    return this.partner;
  }

  /**
   * partner
   */
  public RefundQueryRequest setPartner(String partner) {
    this.partner = partner;
    return this;
  }

  public void unsetPartner() {
    this.partner = null;
  }

  /** Returns true if field partner is set (has been assigned a value) and false otherwise */
  public boolean isSetPartner() {
    return this.partner != null;
  }

  public void setPartnerIsSet(boolean value) {
    if (!value) {
      this.partner = null;
    }
  }

  /**
   * 支付订单号
   */
  public String getRefundNum() {
    return this.refundNum;
  }

  /**
   * 支付订单号
   */
  public RefundQueryRequest setRefundNum(String refundNum) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTNER:
      if (value == null) {
        unsetPartner();
      } else {
        setPartner((String)value);
      }
      break;

    case REFUND_NUM:
      if (value == null) {
        unsetRefundNum();
      } else {
        setRefundNum((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTNER:
      return getPartner();

    case REFUND_NUM:
      return getRefundNum();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTNER:
      return isSetPartner();
    case REFUND_NUM:
      return isSetRefundNum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RefundQueryRequest)
      return this.equals((RefundQueryRequest)that);
    return false;
  }

  public boolean equals(RefundQueryRequest that) {
    if (that == null)
      return false;

    boolean this_present_partner = true && this.isSetPartner();
    boolean that_present_partner = true && that.isSetPartner();
    if (this_present_partner || that_present_partner) {
      if (!(this_present_partner && that_present_partner))
        return false;
      if (!this.partner.equals(that.partner))
        return false;
    }

    boolean this_present_refundNum = true && this.isSetRefundNum();
    boolean that_present_refundNum = true && that.isSetRefundNum();
    if (this_present_refundNum || that_present_refundNum) {
      if (!(this_present_refundNum && that_present_refundNum))
        return false;
      if (!this.refundNum.equals(that.refundNum))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RefundQueryRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RefundQueryRequest typedOther = (RefundQueryRequest)other;

    lastComparison = Boolean.valueOf(isSetPartner()).compareTo(typedOther.isSetPartner());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartner()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partner, typedOther.partner);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    StringBuilder sb = new StringBuilder("RefundQueryRequest(");
    boolean first = true;

    if (isSetPartner()) {
      sb.append("partner:");
      if (this.partner == null) {
        sb.append("null");
      } else {
        sb.append(this.partner);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("refundNum:");
    if (this.refundNum == null) {
      sb.append("null");
    } else {
      sb.append(this.refundNum);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (refundNum == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'refundNum' was not present! Struct: " + toString());
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

  private static class RefundQueryRequestStandardSchemeFactory implements SchemeFactory {
    public RefundQueryRequestStandardScheme getScheme() {
      return new RefundQueryRequestStandardScheme();
    }
  }

  private static class RefundQueryRequestStandardScheme extends StandardScheme<RefundQueryRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RefundQueryRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTNER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partner = iprot.readString();
              struct.setPartnerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REFUND_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.refundNum = iprot.readString();
              struct.setRefundNumIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RefundQueryRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partner != null) {
        if (struct.isSetPartner()) {
          oprot.writeFieldBegin(PARTNER_FIELD_DESC);
          oprot.writeString(struct.partner);
          oprot.writeFieldEnd();
        }
      }
      if (struct.refundNum != null) {
        oprot.writeFieldBegin(REFUND_NUM_FIELD_DESC);
        oprot.writeString(struct.refundNum);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RefundQueryRequestTupleSchemeFactory implements SchemeFactory {
    public RefundQueryRequestTupleScheme getScheme() {
      return new RefundQueryRequestTupleScheme();
    }
  }

  private static class RefundQueryRequestTupleScheme extends TupleScheme<RefundQueryRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RefundQueryRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.refundNum);
      BitSet optionals = new BitSet();
      if (struct.isSetPartner()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPartner()) {
        oprot.writeString(struct.partner);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RefundQueryRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.refundNum = iprot.readString();
      struct.setRefundNumIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.partner = iprot.readString();
        struct.setPartnerIsSet(true);
      }
    }
  }

}

