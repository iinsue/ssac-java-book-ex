package examples.phone;

//7.8.3 추상클래스 선언
//This is Java chapter07 332p

public class PhoneExample {
    //추상 클래스
    public static void main(String[] args) {
        //Phone phone = new Phone();
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
