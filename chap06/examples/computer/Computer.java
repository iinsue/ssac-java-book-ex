package examples.computer;

//This is Java chaper06 220p
//chapter6.8.1 메소드 선언

//매개변수의 수를 모를경우
public class Computer {
    int sum1(int[] values){
        int sum = 0;
        for(int i=0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values) {
        int sum = 0;
        for(int i=0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
}
