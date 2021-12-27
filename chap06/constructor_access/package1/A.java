package constructor_access.package1;

public class A {
    //This is Java chapter06 261p
    // 생성자의 접근 제한

    // Field
    A a1 = new A(true); // (o)
    A a2 = new A(1);    // (o)
    A a3 = new A("문자열"); // (o)

    //생성자(Constructor)
    public A(boolean b) {}  //public 접근 제한
    A(int b) {}             //default 접근 제한
    private A(String s) {}  //private 접근 제한
    
}
