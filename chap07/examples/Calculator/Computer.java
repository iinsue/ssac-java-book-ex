package examples.calculator;
public class Computer extends Calculator {

    //7.4 메소드 재정의(Method Override)
    //This is Java chapter07 297p
    
    //자식 클래스
    @Override   // 메소드 재정의
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle 실행");
        return Math.PI *r *r;
    }
}
