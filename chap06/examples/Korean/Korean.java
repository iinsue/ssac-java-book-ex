package examples.Korean;

// This is Java chapter6 207p
// chapter6.7.3 필드 초기화

// 생성자에서 필드 초기화
public class Korean {
    // Field
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자(Constructor)
    public Korean(String n, String s) {
        name = n;
        ssn = s;
    }
}
