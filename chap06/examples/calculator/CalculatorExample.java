package examples.calculator;

// This is Java chpater6 218p
// chater6.8.1 메소드 선언

// 메소드 호출
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int plusResult = myCalc.plus(5,6);
        System.out.println("plus result = " + plusResult);

        byte x = 10;
        byte y = 4;
        double divideResult = myCalc.divide(x, y);
        System.out.println("divide result = " + divideResult);

        myCalc.powerOff();
    }
}
