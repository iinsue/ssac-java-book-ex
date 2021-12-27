public class PersonExample {
    //This is Java chap06 246p
    //final Field Test

    Person p1 = new Person("123456-1234567", "계백");

    void personExample () {
        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        // p1.nation = "usa";
        // p1.ssn = "654321-7654321";   //frinal 필드는 값 수정 불가
        p1.name = "을지문덕";
    }
    
}
