package examples;

//This is Java chapter04 133p
//chapter4.3.5 continue문

//continue를 사용한 for 문
public class ContinueExample {
    //continue를 사용한 짝수만 나오는 for문
    static void continueExample () {
        for(int i=1; i<=10; i++){
            if(i%2 !=0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
