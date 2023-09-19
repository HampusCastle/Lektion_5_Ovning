import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
       // System.out.println("What is your name?");
       Scanner sc = new Scanner(System.in);
       // String name = sc.nextLine();
      //  System.out.println("Player #1 " + name);

      //  System.out.println("For your next task please select a number");
      //  int number = sc.nextInt();
      //  for (int i = 0; i < number; i++) {
       //     System.out.println(i);
       // }

       // do {
       //     System.out.println("Give me a number");
       //     int newNumber = sc.nextInt();
        //    System.out.println("Your number was " + newNumber);
      //  }while(true);

      boolean isPlaying = (true);

      do {
          System.out.println("Give me something");
          String input = sc.nextLine();
          if(input.equals("Stop")) {
              System.out.println("That's my queue, bye!");
              break;   }

          else {
                  System.out.println("Give me something more");
              }
          
      }  while(true);














    }




    }

