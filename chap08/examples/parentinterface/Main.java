package examples.parentinterface;

public class Main {
    public static void main(String[] args){
        // 인터페이스 구현 클래스
        ChildInterface1 ci1 = new ChildInterface1() {
            @Override
            public void method1(){System.out.println("ci1 Override method1()");}
            @Override
            public void method3(){System.out.println("ci1 Override method3()");}
        };

        
        // 구현 클래스의 메서드 실행
        ci1.method1();
        ci1.method2();  // ParentInterface의 method2() 호출
        ci1.method3();
    }
    
}
