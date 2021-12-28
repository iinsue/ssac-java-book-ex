package examples.airplane;

public class Airplane {
    //7.4.2 부모 메소드 호출(super)
    //This is Java chpater07 298p

    //super 변수
    public void land() {
        System.out.println("착륙합니다.");
    }

    public void fly() {
        System.out.println("일반비행합니다.");
    }
    
    public void takeOff() {
        System.out.println("이륙합니다.");
    }
}
