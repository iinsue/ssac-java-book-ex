package chap02;

public class CharExample {
	//This is Java chapter02 43p
	// char 타입 변수 (char type variable)
	static void charExample () {
	char c1 = 'A';	// 문자를 직접 저장
	char c2 = 65;	// 10진수로 저장
	char c3 = '\u0041';	// 16진수로 저장
	
	int uniCode = c1;
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(uniCode);
	}
}
