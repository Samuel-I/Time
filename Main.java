import java.util.Scanner;

public class Main extends Time {
  public static void main(String[] args) {
    boolean exit = true;
    do {
      System.out.println("What would you like to do?");
      System.out.println("Enter 'time' to get the current time and date.");
      System.out.println("Enter 'timer' to set a timer.");
      System.out.println("Enter 'stopwatch' to start a stopwatch.");
      System.out.println("Enter 'exit' to stop.");
     
      Scanner scan2 = new Scanner(System.in);
      String n2 = scan2.next();
     
      switch(n2) {
        case "time" :
          getTime();
          try {
            Thread.sleep(1000);
          }
          catch (InterruptedException e) {
            continue;
          }
          break;
        
        case "timer" :
          timer();
          try {
            Thread.sleep(1000);
          }
          catch (InterruptedException e) {
            continue;
          }
          break;
          
          case "stopwatch" :
            stopwatch();
            try {
            Thread.sleep(1000);
          }
          catch (InterruptedException e) {
            continue;
          }
          break;
       
        case "exit" :
          exit = false;
          System.out.println("Exiting the program...");
          try {
            Thread.sleep(3000);
          }
          catch (InterruptedException e) {
            continue;
          }
          break;
        
        default :
        System.out.println("Please enter an appropriate statement.");
        break;
      }
    } while (exit);
    System.exit(0);
 }
}
