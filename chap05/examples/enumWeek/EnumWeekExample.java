package examples.enumWeek;

//This is Java chapter05 176p
//chapter5.7.2 열거 타입 변수

// Calendat 클래스는 java.util 패키지에 있으므로 import 가 필요하다.
import java.util.Calendar;

// 열거타입과 열거상수
public class EnumWeekExample {
    public static void main(String[] args) {
        //열거 타입 변수 선언
        Week today = null;

        // 일(1) ~ 토(7) 까지의 숫자를 리턴
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week) {
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;
            case 3:
                today = Week.WEDNESDAY;
                break;
            case 4:
                today = Week.THURSDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;
            case 6:
                today = Week.SATURDAY;
                break;
            case 7:
                today = Week.SUNDAY;
                break;
            default:
                break;
        }
        System.out.println("오늘 요일: " + today);

        if(today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바 공부를 합니다.");
        }
    }
}
