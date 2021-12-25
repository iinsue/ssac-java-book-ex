package chap02;

public class CheckValueBeforeCasting {
	//This is Java chapter02 55p
	//변환으로 인한 데이터 손실이 발생되지 않도록 한다.
	static void checkValueBeforeCasting () {
		
		int i = 128;
		
		// 코드에서 데이터를 검사하기위해 최대값과 최소값을 상수로 제공
		// MIN_VALUE 최솟값 상수 MAX_VALUE 최대값 상수
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}
