namespace java com.lee9213.thrift

typedef i16 short
typedef i32 int
typedef i64 long
typedef bool boolean
typedef string String

struct StudentPerson {
    1: String name,
    2: int age,
    3: String address
}

exception StudentException {
    1: String message,
    2: String code
}

service StudentService {
    StudentPerson  getByName(1: required String name) throws (1: StudentException ex),
    void saveStudent(1: required StudentPerson student)  throws (1: StudentException ex)
}