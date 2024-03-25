package com.lee9213.thrift;

import org.apache.thrift.TException;

/**
 * @author lee9213@163.com
 * @date 2024/3/20 15:09
 */
public class StudentServiceImpl implements StudentService.Iface {

    @Override
    public StudentPerson getByName(String name) throws StudentException, TException {
        StudentPerson person = new StudentPerson();
        person.setName(name);
        person.setAddress("南京");
        return person;
    }

    @Override
    public void saveStudent(StudentPerson student) throws StudentException, TException {
        System.out.println(student.toString());
    }
}
