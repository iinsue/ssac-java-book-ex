package examples.fieldInitValue;

//This is Java Chpater6 202p
//chapter6.6.2 필드 사용

//필드 값 출력
public class FieldInitValueExample {
    public static void main(String[] args) {
        FieldInitValue fiv = new FieldInitValue();

        System.out.println("byteField = " + fiv.byteField);
        System.out.println("shortField = " + fiv.shortField);
        System.out.println("intField = " + fiv.intField);
        System.out.println("longField = " + fiv.longField);
        System.out.println("booleanField = " + fiv.booleanField);
        System.out.println("charField = " + fiv.charField);
        System.out.println("floatField = " + fiv.floatField);
        System.out.println("doubleField = " + fiv.doubleField);
        System.out.println("arrayField = " + fiv.arrayField);
        System.out.println("referenceField = " + fiv.referenceField);
    }
}
