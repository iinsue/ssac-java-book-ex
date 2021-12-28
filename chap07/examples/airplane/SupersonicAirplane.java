package examples.airplane;
public class SupersonicAirplane extends Airplane {
    //7.4.2 부모 메소드 호출(super)
    //This is Java chapter07 299p

    //super변수
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속비행합니다.");
        } else {
            // Airplane 객체의 fly() 메소드 호출
            super.fly();
        }
    }
}
