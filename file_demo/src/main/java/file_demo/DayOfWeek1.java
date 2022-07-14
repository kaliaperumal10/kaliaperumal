package file_demo;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class DayOfWeek1{
  private static Scanner sc;

public static void main(String args[]) {
	  sc = new Scanner(System.in);
    LocalDate localDate = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
     
    //Getting the day of week for a given date
    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    System.out.println(localDate + " was a " + dayOfWeek);
    LocalDate firstWorkingDay;
     
    //Using DayOfWeek to execute dependent business logic
    switch (dayOfWeek) {
      case FRIDAY:firstWorkingDay = localDate.plusDays(3);
        break;
      case SATURDAY:firstWorkingDay = localDate.plusDays(2);
        break;
      default:firstWorkingDay=localDate.plusDays(1);
        break;
    }
    System.out.println("First working day of 2016 was "+firstWorkingDay);
  }
}