public class Calculator {
    
    // 7.4 메소드 재정의 (Method Override)
    // This is Java chapter07 296p

    // 부모클래스
    double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159 * r *r;
    }
}
