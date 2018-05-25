import java.util.*;

public class Date {
  private int day;
  private int month;
  private int year;
  private Vector<int> adjustmentTable;

  public Date(int theDay, int theMonth, int theYear) {
    day = theDay;
    month = theMonth;
    year = theYear;
  }

  public String toString() {
    return day +" "+ month + ", " + year;
  }
}
