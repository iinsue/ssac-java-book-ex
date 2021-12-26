package chap02;

public class FromIntToDouble {
	//This is Java chapter02 57p
	//정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 피한다.
	static void fromIntToDouble () {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
