package examples.parentinterface;

public interface ParentInterface {
    public void method1();
    public default void method2() {System.out.println("parentinterface method2");}
}