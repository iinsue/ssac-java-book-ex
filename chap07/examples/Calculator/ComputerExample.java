package examples.calculator;


public class ComputerExample {

    //7.4 메소드 재정의(Method Override)
    //This is Java chapter07 297p

    // 메소드 오버라이딩 테스트
    public static void main(String[] args){
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원면적: " + calculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println("원면적: " +computer.areaCircle(r));
    }
}
