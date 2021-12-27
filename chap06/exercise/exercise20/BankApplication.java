package exercise.exercise20;

import java.util.Scanner;

public class BankApplication {
    //main함수에서 쓰기위해서 static으로 생성
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-----------------------------------------------");
            System.out.print("선택 >");

            int selectNo = scanner.nextInt();

            switch(selectNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    //계좌생성하기
    // 계좌번호, 예금주, 잔고를 입력받아서 accountArray에 추가
    // 계좌번호, 예금주, 금액을 입력
    private static void createAccount() {

    }

    //계좌목록보기
    //accountArray 내용을 출력
    private static void accountList() {

    }

    //예금하기
    //accountArray에서 계좌번호, 예금주가 일치하는 항목을 찾아서 잔고를 업데이트(입금)
    private static void deposit() {

    }

    //출금하기
    private static void withdraw() {

    }

    //Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Account findAccount(String ano) {

    }
}
