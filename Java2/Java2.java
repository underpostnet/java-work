
package Java2;

import java.util.Scanner;

import Java2.*;

public class Java2 {

  public static void main(String[] args) {

    System.out.println("UNDERpost.net");

    Empleado test = new Empleado(100, "fco", "underpost.net");

    System.out.println(test.getSalary());
    System.out.println(test.getName());


    // -------------------------------------------
    // RECURSIVITY
    // -------------------------------------------
    int result = sum(10);
    System.out.println(result);


    // -------------------------------------------
    // INPUTS
    // -------------------------------------------
    // Scanner scan = new Scanner(System.in);
    // int i = scan.nextInt();
    // Double d = scan.nextDouble();
    // scan.nextLine();
    // String s = scan.nextLine();

    // System.out.println("String: " + s);
    // System.out.println("Double: " + d);
    // System.out.println("Int: " + i);
    // -------------------------------------------
    // FORMAT
    // -------------------------------------------
    System.out.println("-- FORMAT --");
    String[] arr = {"number:", "45"};
    System.out.println(
                    String.format("%-15s", arr[0])
                    + String.format("%3s", arr[1]).replace(" ", "0")
                    );

    // -------------------------------------------
    // FORMAT
    // -------------------------------------------
    // System.out.println("-- EOF INFINIT INTPUT WHILE NOT END (.) --");
    // Scanner scan = new Scanner(System.in);
    // int cont = 0;
    // while(scan.hasNext()){
    //     cont++;
    //     System.out.println(cont+" "+scan.nextLine());
    // }


    // -------------------------------------------
    // Date
    // -------------------------------------------
    // public static String findDay(int month, int day, int year) {
        
    //   String dayNames[] = new DateFormatSymbols().getWeekdays();
      
    //   System.out.println(dayNames.toString());
      
    //   Calendar cal = Calendar.getInstance();
    //   cal.set(Calendar.MONTH, month-1);
    //   cal.set(Calendar.DAY_OF_MONTH, day);
    //   cal.set(Calendar.YEAR, year);
    //   return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();

    // }

  }

  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }

}
