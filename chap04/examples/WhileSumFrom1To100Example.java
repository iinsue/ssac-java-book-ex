package examples;

//This is Java chapter 125p
//chapter4.3.2  while문

// 1 부터 100 까지의 합을 출력
public class WhileSumFrom1To100Example {
    static void whileSumFrom1To100Example () {
        int sum = 0;    // 합계를 저장할 변수

        int i = 1;  // 카운터 변수

        while(i<=100){
            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1) + "합: " + sum);
    }
}
