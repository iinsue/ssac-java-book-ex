package chap02;

public class FromIntToDouble {
	//This is Java chapter02 57p
	//���� Ÿ���� �Ǽ� Ÿ������ ��ȯ�� �� ���е� �ս��� ���Ѵ�.
	static void fromIntToDouble () {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
