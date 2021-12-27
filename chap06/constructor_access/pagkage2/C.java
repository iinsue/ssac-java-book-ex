package constructor_access.pagkage2;

import constructor_access.package1.A;

public class C {
    //This is Java chater06 262p
    // 생성자의 접근 제한

    //Field
    A a1 = new A(true);
    //A a2 = new A(1);    //(x)   default 생성자 접근불가(Compile Error)
    //A a3 = new A("문자열"); //(x)   default 생성자 접근불가 (Compile Error)
}
