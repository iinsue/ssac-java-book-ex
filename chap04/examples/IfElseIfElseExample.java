package examples;

//This is Java chapter04 111p
//chapter 4.2.3 if-else if-else문

public class IfElseIfElseExample {
    static void ifelseifelse () {
        int score = 75;

        if(score>=90) {
            System.out.println("점수가 100~90 입니다.");
            System.out.println("등급은 A입니다.");
        } else if(score >=80) {
            System.out.println("점수가 80 ~ 89 입니다.");
            System.out.println("등급은 B입니다.");
        } else if(score >=70) {
            System.out.println("점수가 70 ~ 79 입니다.");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 70 미만 입니다.");
            System.out.println("등급은 D입니다.");
        }
    }
}