
//This is Java chapter08 381p
//chapter8.7.1 디폴드 메소드의 필요성

// 기존 인터페이스
public interface MyInterface {
    public void method1();

    //수정 인터페이스
    public default void method2() {
        System.out.println("MyInterface-method2() 실행");
    }
}
