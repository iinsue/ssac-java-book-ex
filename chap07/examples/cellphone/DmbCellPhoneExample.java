package examples.cellphone;
// This is Java Chapter07 290p

// 자식 클래스 사용
public class DmbCellPhoneExample {
    public static void main(String[] args) {
        //DmbCellPhone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        //CellPhone으로부터 상속받은 필드
        System.out.println("MODEL: " + dmbCellPhone.model);
        System.out.println("COLOR: " + dmbCellPhone.color);

        //DmbCellPhone의 필드
        System.out.println("CHANNEL: " + dmbCellPhone.channel);

        //CellPhone으로부터 상속 받은 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요 저는 김자바 인데요");
        dmbCellPhone.sendVoice("반갑습니다");
        dmbCellPhone.hangUp();

        //DmbCellPhone의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
