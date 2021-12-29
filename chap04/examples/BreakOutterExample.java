package examples;

//This is Java chpater04 132p
//chapter4.3.4 break문

//바깥쪽 반복문 종료
public class BreakOutterExample {
    static void breakOutterExample () {
        Outter:for(char upper='A'; upper <='Z';upper++) {
            for(char lower='a'; lower<='z';lower++) {
                System.out.println(upper + "-" + lower);
                if(lower == 'g') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
