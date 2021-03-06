package chap02;

public class OperationsPromotionExample {
	//This is Java chapter02 59p
	// 연산식에서 자동 타입 변환
	static void operationsPromotionExample () {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;	//Compile Error
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2;	//Compile Error
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드= " + intValue2);
		System.out.println("출력문자= " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; 	//Compile Error
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}
}
