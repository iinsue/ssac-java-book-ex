package examples.arrayCopyByFor;

//This is Java chapter5 168
//chater5.6.9 배열복사

//for 문으로 배열복사
public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        for(int i=0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        
        for(int i=0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }
    }
}
