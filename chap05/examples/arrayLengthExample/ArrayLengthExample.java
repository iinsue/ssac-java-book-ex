package examples.arrayLengthExample;

// This is Java chater5 159p
// chater5.6.5 배열길이

// 배열의 length 필드
public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        int sum = 0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
