package chap02;

public class CheckValueBeforeCasting {
	//This is Java chapter02 55p
	//��ȯ���� ���� ������ �ս��� �߻����� �ʵ��� �Ѵ�.
	static void checkValueBeforeCasting () {
		
		int i = 128;
		
		// �ڵ忡�� �����͸� �˻��ϱ����� �ִ밪�� �ּҰ��� ����� ����
		// MIN_VALUE �ּڰ� ��� MAX_VALUE �ִ밪 ���
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}
