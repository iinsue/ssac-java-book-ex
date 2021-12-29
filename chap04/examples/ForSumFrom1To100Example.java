package examples;

//This is Java chapter04 122p
//chpater4.3.1 for 문

// 1 부터 100 까지의 합을 출력
public class ForSumFrom1To100Example {
    static void forSumFrom1To100Example () {
        int sum = 0;

        for(int i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println("1~100 의 합: " + sum);
    }
}
