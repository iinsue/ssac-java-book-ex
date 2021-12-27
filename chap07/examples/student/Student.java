package examples.student;

//7.3 부모 생성자 호출
//This is Java 294p

//자식 클래스
public class Student extends People {
    int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name,ssn);
        this.studentNo = studentNo;
    }
}
