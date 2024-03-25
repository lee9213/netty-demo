package com.lee9213.proto;

import io.grpc.stub.StreamObserver;

/**
 * @author lee9213@163.com
 * @date 2024/3/21 09:44
 */
public class PersonServiceGrpcImpl extends PersonServiceGrpc.PersonServiceImplBase {

    @Override
    public void getStudent(TeacherPerson request, StreamObserver<StudentPerson> responseObserver) {
        super.getStudent(request, responseObserver);

        StudentPerson studentPerson = StudentPerson.newBuilder().build();
        responseObserver.onNext(studentPerson);
        responseObserver.onCompleted();
    }
}
