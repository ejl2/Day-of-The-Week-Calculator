import java.util.*;

public class Main {

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      System.out.println(makeRandomDate());

    }
  }

  public static Date makeRandomDate() {
    Random rand = new Random();
    int year = rand.nextInt(200);
    int month = rand.nextInt(12) + 1;
    int day = 0;

    if (month == 4 || month == 6 || month == 9 || month == 11) {
      day = rand.nextInt(30) + 1;
    } else if (month == 2) {
      if (year%4 == 0) {
        day = rand.nextInt(28) + 1;
      } else {
        day = rand.nextInt(29) + 1;
      }
    } else {
      day = day = rand.nextInt(31) + 1;
    }

    return new Date(day, month, year);
  }
}
