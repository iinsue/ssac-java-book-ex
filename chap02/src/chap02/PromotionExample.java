package chap02;

public class PromotionExample {
	//This is Java chapter02 51p
	// �ڵ� Ÿ�� ��ȯ (Promotion)
	static void promotionExample () {

		byte byteValue = 10;
		int intValue = byteValue;	// int <- byte
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;	// int <- char
		System.out.println("���� �����ڵ�= "+intValue);
		
		intValue = 500;
		long longValue = intValue;	// long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	// double <- int
		System.out.println(doubleValue);
	}
}
