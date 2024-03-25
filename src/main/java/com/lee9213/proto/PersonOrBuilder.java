// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Person.proto

// Protobuf Java Version: 3.25.1
package com.lee9213.proto;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.lee9213.proto.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
   * @return Whether the personEnum field is set.
   */
  boolean hasPersonEnum();
  /**
   * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
   * @return The enum numeric value on the wire for personEnum.
   */
  int getPersonEnumValue();
  /**
   * <code>optional .com.lee9213.proto.Person.PersonEnum personEnum = 1;</code>
   * @return The personEnum.
   */
  Person.PersonEnum getPersonEnum();

  /**
   * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
   * @return Whether the stu field is set.
   */
  boolean hasStu();
  /**
   * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
   * @return The stu.
   */
  StudentPerson getStu();
  /**
   * <code>.com.lee9213.proto.StudentPerson stu = 2;</code>
   */
  StudentPersonOrBuilder getStuOrBuilder();

  /**
   * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
   * @return Whether the te field is set.
   */
  boolean hasTe();
  /**
   * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
   * @return The te.
   */
  TeacherPerson getTe();
  /**
   * <code>.com.lee9213.proto.TeacherPerson te = 3;</code>
   */
  TeacherPersonOrBuilder getTeOrBuilder();

  Person.PersonTypeCase getPersonTypeCase();
}