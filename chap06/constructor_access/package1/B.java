package constructor_access.package1;

public class B {
    //This is Java chapter06 261p
    //생성자의 접근제한
    
    // Field
    A a1 = new A(true); //(o)
    A a2 = new A(1);    //(o)
    //A a3 = new A("문자열"); //private 생성자 접근 불가 (Compile Error)
}
