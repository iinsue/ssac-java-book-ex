package examples.phone;

//7.8.3 추상클래스 선언
//This is Java chapter07 333p

//실체 클래스
public class SmartPhone extends Phone{
    //생성자
    public SmartPhone(String owner) {
        super(owner);
    }

    //메소드
    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
