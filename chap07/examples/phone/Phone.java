package examples.phone;

//7.8.3 추상클래스 선언
//This is Java chapter07 332p

public abstract class Phone {
    //필드
    public String owner;

    //생성자
    public Phone(String owner){
        this.owner = owner;
    }

    //메소드
    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}
