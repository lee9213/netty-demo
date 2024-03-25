// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Person.proto

// Protobuf Java Version: 3.25.1
package com.lee9213.proto;

/**
 * Protobuf type {@code com.lee9213.proto.Person}
 */
public final class Person extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.lee9213.proto.Person)
    PersonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Person.newBuilder() to construct.
  private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Person() {
    personEnum_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Person();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return PersonClassName.internal_static_com_lee9213_protobuf_Person_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PersonClassName.internal_static_com_lee9213_protobuf_Person_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Person.class, Person.Builder.class);
  }

  /**
   * Protobuf enum {@code com.lee9213.proto.Person.PersonEnum}
   */
  public enum PersonEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>StudentPerson = 0;</code>
     */
    StudentPerson(0),
    /**
     * <code>TeacherPerson = 1;</code>
     */
    TeacherPerson(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>StudentPerson = 0;</code>
     */
    public static final int StudentPerson_VALUE = 0;
    /**
     * <code>TeacherPerson = 1;</code>
     */
    public static final int TeacherPerson_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PersonEnum valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PersonEnum forNumber(int value) {
      switch (value) {
        case 0: return StudentPerson;
        case 1: return TeacherPerson;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PersonEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PersonEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PersonEnum>() {
            public PersonEnum findValueByNumber(int number) {
              return PersonEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Person.getDescriptor().getEnumTypes().get(0);
    }

    private static final PersonEnum[] VALUES = values();

    public static PersonEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PersonEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.lee9213.proto.Person.PersonEnum)
  }

  private int bitField0_;
  private int personTypeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object personType_;
  public enum PersonTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STU(2),
    TE(3),
    PERSONTYPE_NOT_SET(0);
    private final int value;
    private PersonTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PersonTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static PersonTypeCase forNumber(int value) {
      switch (value) {
        case 2: return STU;
        case 3: return TE;
        case 0: return PERSONTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public PersonTypeCase
  getPersonTypeCase() {
    return PersonTypeCase.forNumber(
        personTypeCase_);
  }

  public static final int PERSONENUM_FIELD_NUMBER = 1;
  private int personEnum_ = 0;
  /**
   * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
   * @return Whether the personEnum field is set.
   */
  @java.lang.Override public boolean hasPersonEnum() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
   * @return The enum numeric value on the wire for personEnum.
   */
  @java.lang.Override public int getPersonEnumValue() {
    return personEnum_;
  }
  /**
   * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
   * @return The personEnum.
   */
  @java.lang.Override public Person.PersonEnum getPersonEnum() {
    Person.PersonEnum result = Person.PersonEnum.forNumber(personEnum_);
    return result == null ? Person.PersonEnum.UNRECOGNIZED : result;
  }

  public static final int STU_FIELD_NUMBER = 2;
  /**
   * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
   * @return Whether the stu field is set.
   */
  @java.lang.Override
  public boolean hasStu() {
    return personTypeCase_ == 2;
  }
  /**
   * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
   * @return The stu.
   */
  @java.lang.Override
  public StudentPerson getStu() {
    if (personTypeCase_ == 2) {
       return (StudentPerson) personType_;
    }
    return StudentPerson.getDefaultInstance();
  }
  /**
   * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
   */
  @java.lang.Override
  public StudentPersonOrBuilder getStuOrBuilder() {
    if (personTypeCase_ == 2) {
       return (StudentPerson) personType_;
    }
    return StudentPerson.getDefaultInstance();
  }

  public static final int TE_FIELD_NUMBER = 3;
  /**
   * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
   * @return Whether the te field is set.
   */
  @java.lang.Override
  public boolean hasTe() {
    return personTypeCase_ == 3;
  }
  /**
   * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
   * @return The te.
   */
  @java.lang.Override
  public TeacherPerson getTe() {
    if (personTypeCase_ == 3) {
       return (TeacherPerson) personType_;
    }
    return TeacherPerson.getDefaultInstance();
  }
  /**
   * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
   */
  @java.lang.Override
  public TeacherPersonOrBuilder getTeOrBuilder() {
    if (personTypeCase_ == 3) {
       return (TeacherPerson) personType_;
    }
    return TeacherPerson.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, personEnum_);
    }
    if (personTypeCase_ == 2) {
      output.writeMessage(2, (StudentPerson) personType_);
    }
    if (personTypeCase_ == 3) {
      output.writeMessage(3, (TeacherPerson) personType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, personEnum_);
    }
    if (personTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (StudentPerson) personType_);
    }
    if (personTypeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (TeacherPerson) personType_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Person)) {
      return super.equals(obj);
    }
    Person other = (Person) obj;

    if (hasPersonEnum() != other.hasPersonEnum()) return false;
    if (hasPersonEnum()) {
      if (personEnum_ != other.personEnum_) return false;
    }
    if (!getPersonTypeCase().equals(other.getPersonTypeCase())) return false;
    switch (personTypeCase_) {
      case 2:
        if (!getStu()
            .equals(other.getStu())) return false;
        break;
      case 3:
        if (!getTe()
            .equals(other.getTe())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPersonEnum()) {
      hash = (37 * hash) + PERSONENUM_FIELD_NUMBER;
      hash = (53 * hash) + personEnum_;
    }
    switch (personTypeCase_) {
      case 2:
        hash = (37 * hash) + STU_FIELD_NUMBER;
        hash = (53 * hash) + getStu().hashCode();
        break;
      case 3:
        hash = (37 * hash) + TE_FIELD_NUMBER;
        hash = (53 * hash) + getTe().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Person parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Person parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Person parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Person parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Person parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Person parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Person parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Person parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Person parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static Person parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Person parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Person parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Person prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.lee9213.proto.Person}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.lee9213.proto.Person)
          PersonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PersonClassName.internal_static_com_lee9213_protobuf_Person_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PersonClassName.internal_static_com_lee9213_protobuf_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Person.class, Person.Builder.class);
    }

    // Construct using com.lee9213.proto.Person.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      personEnum_ = 0;
      if (stuBuilder_ != null) {
        stuBuilder_.clear();
      }
      if (teBuilder_ != null) {
        teBuilder_.clear();
      }
      personTypeCase_ = 0;
      personType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PersonClassName.internal_static_com_lee9213_protobuf_Person_descriptor;
    }

    @java.lang.Override
    public Person getDefaultInstanceForType() {
      return Person.getDefaultInstance();
    }

    @java.lang.Override
    public Person build() {
      Person result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Person buildPartial() {
      Person result = new Person(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(Person result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.personEnum_ = personEnum_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private void buildPartialOneofs(Person result) {
      result.personTypeCase_ = personTypeCase_;
      result.personType_ = this.personType_;
      if (personTypeCase_ == 2 &&
          stuBuilder_ != null) {
        result.personType_ = stuBuilder_.build();
      }
      if (personTypeCase_ == 3 &&
          teBuilder_ != null) {
        result.personType_ = teBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Person) {
        return mergeFrom((Person)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Person other) {
      if (other == Person.getDefaultInstance()) return this;
      if (other.hasPersonEnum()) {
        setPersonEnum(other.getPersonEnum());
      }
      switch (other.getPersonTypeCase()) {
        case STU: {
          mergeStu(other.getStu());
          break;
        }
        case TE: {
          mergeTe(other.getTe());
          break;
        }
        case PERSONTYPE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              personEnum_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getStuFieldBuilder().getBuilder(),
                  extensionRegistry);
              personTypeCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getTeFieldBuilder().getBuilder(),
                  extensionRegistry);
              personTypeCase_ = 3;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int personTypeCase_ = 0;
    private java.lang.Object personType_;
    public PersonTypeCase
        getPersonTypeCase() {
      return PersonTypeCase.forNumber(
          personTypeCase_);
    }

    public Builder clearPersonType() {
      personTypeCase_ = 0;
      personType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int personEnum_ = 0;
    /**
     * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
     * @return Whether the personEnum field is set.
     */
    @java.lang.Override public boolean hasPersonEnum() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
     * @return The enum numeric value on the wire for personEnum.
     */
    @java.lang.Override public int getPersonEnumValue() {
      return personEnum_;
    }
    /**
     * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
     * @param value The enum numeric value on the wire for personEnum to set.
     * @return This builder for chaining.
     */
    public Builder setPersonEnumValue(int value) {
      personEnum_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
     * @return The personEnum.
     */
    @java.lang.Override
    public Person.PersonEnum getPersonEnum() {
      Person.PersonEnum result = Person.PersonEnum.forNumber(personEnum_);
      return result == null ? Person.PersonEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
     * @param value The personEnum to set.
     * @return This builder for chaining.
     */
    public Builder setPersonEnum(Person.PersonEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      personEnum_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPersonEnum() {
      bitField0_ = (bitField0_ & ~0x00000001);
      personEnum_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            StudentPerson, StudentPerson.Builder, StudentPersonOrBuilder> stuBuilder_;
    /**
     * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
     * @return Whether the stu field is set.
     */
    @java.lang.Override
    public boolean hasStu() {
      return personTypeCase_ == 2;
    }
    /**
     * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
     * @return The stu.
     */
    @java.lang.Override
    public StudentPerson getStu() {
      if (stuBuilder_ == null) {
        if (personTypeCase_ == 2) {
          return (StudentPerson) personType_;
        }
        return StudentPerson.getDefaultInstance();
      } else {
        if (personTypeCase_ == 2) {
          return stuBuilder_.getMessage();
        }
        return StudentPerson.getDefaultInstance();
      }
    }
    /**
     * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
     */
    public Builder setStu(StudentPerson value) {
      if (stuBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        personType_ = value;
        onChanged();
      } else {
        stuBuilder_.setMessage(value);
      }
      personTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
     */
    public Builder setStu(
        StudentPerson.Builder builderForValue) {
      if (stuBuilder_ == null) {
        personType_ = builderForValue.build();
        onChanged();
      } else {
        stuBuilder_.setMessage(builderForValue.build());
      }
      personTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
     */
    public Builder mergeStu(StudentPerson value) {
      if (stuBuilder_ == null) {
        if (personTypeCase_ == 2 &&
            personType_ != StudentPerson.getDefaultInstance()) {
          personType_ = StudentPerson.newBuilder((StudentPerson) personType_)
              .mergeFrom(value).buildPartial();
        } else {
          personType_ = value;
        }
        onChanged();
      } else {
        if (personTypeCase_ == 2) {
          stuBuilder_.mergeFrom(value);
        } else {
          stuBuilder_.setMessage(value);
        }
      }
      personTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
     */
    public Builder clearStu() {
      if (stuBuilder_ == null) {
        if (personTypeCase_ == 2) {
          personTypeCase_ = 0;
          personType_ = null;
          onChanged();
        }
      } else {
        if (personTypeCase_ == 2) {
          personTypeCase_ = 0;
          personType_ = null;
        }
        stuBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
     */
    public StudentPerson.Builder getStuBuilder() {
      return getStuFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
     */
    @java.lang.Override
    public StudentPersonOrBuilder getStuOrBuilder() {
      if ((personTypeCase_ == 2) && (stuBuilder_ != null)) {
        return stuBuilder_.getMessageOrBuilder();
      } else {
        if (personTypeCase_ == 2) {
          return (StudentPerson) personType_;
        }
        return StudentPerson.getDefaultInstance();
      }
    }
    /**
     * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            StudentPerson, StudentPerson.Builder, StudentPersonOrBuilder>
        getStuFieldBuilder() {
      if (stuBuilder_ == null) {
        if (!(personTypeCase_ == 2)) {
          personType_ = StudentPerson.getDefaultInstance();
        }
        stuBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                StudentPerson, StudentPerson.Builder, StudentPersonOrBuilder>(
                (StudentPerson) personType_,
                getParentForChildren(),
                isClean());
        personType_ = null;
      }
      personTypeCase_ = 2;
      onChanged();
      return stuBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            TeacherPerson, TeacherPerson.Builder, TeacherPersonOrBuilder> teBuilder_;
    /**
     * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
     * @return Whether the te field is set.
     */
    @java.lang.Override
    public boolean hasTe() {
      return personTypeCase_ == 3;
    }
    /**
     * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
     * @return The te.
     */
    @java.lang.Override
    public TeacherPerson getTe() {
      if (teBuilder_ == null) {
        if (personTypeCase_ == 3) {
          return (TeacherPerson) personType_;
        }
        return TeacherPerson.getDefaultInstance();
      } else {
        if (personTypeCase_ == 3) {
          return teBuilder_.getMessage();
        }
        return TeacherPerson.getDefaultInstance();
      }
    }
    /**
     * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
     */
    public Builder setTe(TeacherPerson value) {
      if (teBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        personType_ = value;
        onChanged();
      } else {
        teBuilder_.setMessage(value);
      }
      personTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
     */
    public Builder setTe(
        TeacherPerson.Builder builderForValue) {
      if (teBuilder_ == null) {
        personType_ = builderForValue.build();
        onChanged();
      } else {
        teBuilder_.setMessage(builderForValue.build());
      }
      personTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
     */
    public Builder mergeTe(TeacherPerson value) {
      if (teBuilder_ == null) {
        if (personTypeCase_ == 3 &&
            personType_ != TeacherPerson.getDefaultInstance()) {
          personType_ = TeacherPerson.newBuilder((TeacherPerson) personType_)
              .mergeFrom(value).buildPartial();
        } else {
          personType_ = value;
        }
        onChanged();
      } else {
        if (personTypeCase_ == 3) {
          teBuilder_.mergeFrom(value);
        } else {
          teBuilder_.setMessage(value);
        }
      }
      personTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
     */
    public Builder clearTe() {
      if (teBuilder_ == null) {
        if (personTypeCase_ == 3) {
          personTypeCase_ = 0;
          personType_ = null;
          onChanged();
        }
      } else {
        if (personTypeCase_ == 3) {
          personTypeCase_ = 0;
          personType_ = null;
        }
        teBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
     */
    public TeacherPerson.Builder getTeBuilder() {
      return getTeFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
     */
    @java.lang.Override
    public TeacherPersonOrBuilder getTeOrBuilder() {
      if ((personTypeCase_ == 3) && (teBuilder_ != null)) {
        return teBuilder_.getMessageOrBuilder();
      } else {
        if (personTypeCase_ == 3) {
          return (TeacherPerson) personType_;
        }
        return TeacherPerson.getDefaultInstance();
      }
    }
    /**
     * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            TeacherPerson, TeacherPerson.Builder, TeacherPersonOrBuilder>
        getTeFieldBuilder() {
      if (teBuilder_ == null) {
        if (!(personTypeCase_ == 3)) {
          personType_ = TeacherPerson.getDefaultInstance();
        }
        teBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                TeacherPerson, TeacherPerson.Builder, TeacherPersonOrBuilder>(
                (TeacherPerson) personType_,
                getParentForChildren(),
                isClean());
        personType_ = null;
      }
      personTypeCase_ = 3;
      onChanged();
      return teBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.lee9213.proto.Person)
  }

  // @@protoc_insertion_point(class_scope:com.lee9213.proto.Person)
  private static final Person DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Person();
  }

  public static Person getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Person>
      PARSER = new com.google.protobuf.AbstractParser<Person>() {
    @java.lang.Override
    public Person parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Person> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Person> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public Person getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
