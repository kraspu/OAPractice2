import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork {

  // Реализовать программу учета среднесуточной температуры на протяжении месяца.
  // Ввод данных реализовать с консоли. Вначале должен быть выведен запрос названия месяца,
  // затем значений температуры для каждого числа. Количество дней в месяце программа должна
  // определять автоматически.  Значения хранить в ArrayList. При вводе реализовать проверку
  // корректности вводимых данных, если данные введены не корректно - запросить ввод повторно.
  // После введения данных вывести среднемесячную температуру, дату, когда была максимальная
  // температура и минимальная с указанием ее значения.

  public static void main(String[] args) {

    double averageTemperateru;
    int month, days = 0;
    ArrayList<Double> dayTemp = new ArrayList<>();
    String monthString = new String();
    double dayT;


    do {
      Scanner sc = new Scanner(System.in);
      month = 0;
      System.out.println("Enter the number of MONTH: ");
      if (sc.hasNextInt()) {
        month = sc.nextInt();
        if (month < 1 || month > 12) month = 0;
      }
    } while (month == 0);

    switch (month) {
        case 1:  monthString = "January"; days = 31;
          break;
        case 2:  monthString = "February"; days = 28;
          break;
        case 3:  monthString = "March"; days = 31;
          break;
        case 4:  monthString = "April"; days = 30;
          break;
        case 5:  monthString = "May"; days = 31;
          break;
        case 6:  monthString = "June"; days = 30;
          break;
        case 7:  monthString = "July"; days = 31;
          break;
        case 8:  monthString = "August"; days = 31;
          break;
        case 9:  monthString = "September"; days = 30;
          break;
        case 10: monthString = "October"; days = 31;
          break;
        case 11: monthString = "November"; days = 30;
          break;
        case 12: monthString = "December"; days = 31;
          break;
    }

    for (int i = 0; i < days; i++) {
      do {
        dayT = -273;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature for " + (i + 1) + " " + monthString + " : ");
        if (sc.hasNextDouble()) {
          dayT = sc.nextDouble();
          if (dayT < -100 || dayT > 100)
            dayT = -273;
          else dayTemp.add(dayT);
        }
      } while (dayT == -273);
    }

    double maxTemp = dayTemp.get(0);
    double minTemp = dayTemp.get(0);
    double sum = 0;
    int countDay = 0;
    int maxDay = 0;
    int minDay = 0;
    for (double t : dayTemp) {
      sum += t;
      countDay++;
      if (t > maxTemp) {
        maxTemp = t;
        maxDay = countDay;
      }
      if (t < minTemp) {
        minTemp = t;
        minDay = countDay;
      }
    }

    averageTemperateru = sum / dayTemp.size();
    System.out.println("The average temperature in " + monthString + " is: " + averageTemperateru);
    System.out.println("The MAX temperature " + maxTemp + " degrees Celsius was on " + maxDay + " " + monthString );
    System.out.println("The MIN temperature " + minTemp + " degrees Celsius was on " + minDay + " " + monthString );



  }
}
