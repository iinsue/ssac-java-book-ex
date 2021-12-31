package examples.car4;

//This is Java chpater6 223p
//Chater6.8.2 return 문

//return 문
public class Car {
    //Field
    int gas;

    //Constructor

    //Method

    //리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    //리턴값이 boolean인 메소드로 gas 필드랎이 0이면 flase를,
    // 0이 아니면 true를 리턴
    boolean isLeftGas() {
        if(gas==0) {
            System.out.println("gas가 없습니다. ");
            return false;
        } 
        System.out.println("gas가 있습니다.");
        return true;    //true를 리턴
    }

    // 리턴 값이 없는 메소드로 gas 필드값이 0이면 
    // return 문으로 메소드를 강제종료
    void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("달립니다. (gas잔량: " +gas+")" );
                gas -= 1;
            } else{
                System.out.println("멈춥니다. (gas잔량: " +gas+")");
                return; // 메소드 실행 종료
            }
        }
    }

}
