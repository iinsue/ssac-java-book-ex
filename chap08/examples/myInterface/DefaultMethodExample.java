package examples.myInterface;

//This is Java chapter08 381p
//chapter8.7.1 디폴드 메소드의 필요성

//디폴트 메소드 사용
public class DefaultMethodExample {

    public static void main(String[] args) {
        MyInterface mi1 = new MyClassA();
        mi1.method1();
        mi1.method2();

        MyInterface mi2 = new MyClassB();
        mi2.method1();
        mi2.method2();
    }
    
}
