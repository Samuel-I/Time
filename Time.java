import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.lang.*;

public class Time {
  
  public static void getTime() {
    DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    LocalDateTime currentTime = LocalDateTime.now();
    System.out.println("The current date and time is " + formatTime.format(currentTime));
  }
  
  public static void timer() {
    System.out.println("How many minutes do you want to time?");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    System.out.println("How many seconds do you want to time?");
    Scanner scan1 = new Scanner(System.in);
    int n1 = scan1.nextInt();
    
    for (int i = n * 60 + n1; i > 0; i--) {
      System.out.println( (i / 60) + " minutes and " + (i % 60)  + " seconds remaining");
      try {
        Thread.sleep(1000);
      }
      catch (InterruptedException e) {
        continue;
      }
    }
    
    System.out.println(n + " minutes and " + n1 + " seconds have passed");
  }
  
  public static void stopwatch() {
    System.out.println("Enter anything to stop the stopwatch.");
    Instant begin = Instant.now();
    Scanner scan3 = new Scanner(System.in);
    String n3 = scan3.next();
    Instant end = Instant.now();
    long x = Duration.between(begin, end).toMillis() / 1000;
    System.out.println(x / 60 + " minutes and " + x % 60 + " seconds have elapsed");
  }
}
