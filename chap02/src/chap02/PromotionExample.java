package chap02;

public class PromotionExample {
	//This is Java chapter02 51p
	// 자동 타입 변환 (Promotion)
	static void promotionExample () {

		byte byteValue = 10;
		int intValue = byteValue;	// int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;	// int <- char
		System.out.println("가의 유니코드= " + intValue);
		
		intValue = 500;
		long longValue = intValue;	// long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	// double <- int
		System.out.println(doubleValue);
	}
}
