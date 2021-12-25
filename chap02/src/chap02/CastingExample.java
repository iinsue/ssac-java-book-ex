package chap02;

public class CastingExample {
	//This is Java chapter02 54p
	//강제 타입 변환 (Casting)
	static void castingExample () {
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
