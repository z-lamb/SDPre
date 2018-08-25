import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection = 0;

    while(selection != 3) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      if(selection < 1 || selection > 3) {
        System.out.println("You did not selection an option from the menu");
        System.out.println("Please make a selection from the menu");
      }
      if(selection == 1){
        System.out.println("Hello World");
      }
      if(selection == 2){
        System.out.println("Apple, Banana, Coconut");
      }
      if(selection == 3){
        System.out.println("Goodbye");
      }
    }

    scanner.close();
  }
}

/*
  I didn't see any other way around the endless loop besides putting
  a test inside the while loop instead of always being true. The easiest
  way was to define selection to be something other than 3 and as long
  as the input was never 1 or 2 if would continue until 3 is selected.
*/
