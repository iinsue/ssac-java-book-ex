package examples.airplane;
public class SupersonicAirplaneExample {

    //7.4.2 부모 메소드 호출
    //This is Java chapter07 299p

    //super 변수
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
