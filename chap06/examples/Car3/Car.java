package examples.car3;

//This is Java chapter6 213p
//chapter6.7.5 다른 생성자 호출(this())


//다른 생성자를 호출해서 중복 코드 줄이기
public class Car {
    //Field
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    
     //생성자-1
     Car() {}
     //생성자-2
     Car(String model){
         this(model, "은색", 250);
    }
     //생성자-3
     Car(String model, String color){
        this(model, color, 250);
     }
     //생성자-4
     Car(String model, String color, int maxSpeed){
         this.model = model;
         this.color = color;
         this.maxSpeed = maxSpeed;
     }
}
