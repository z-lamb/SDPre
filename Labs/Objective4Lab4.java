import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.print("Please enter a number to determine if it is odd or even: ");
    userNum = scanner.nextInt();

    if(userNum % 2 == 0) {
      System.out.println("The number, " + userNum + ", is an even number.");
    }
    // else if not needed but added it to confirm number is odd
    else if(userNum % 2 == 1) {
      System.out.println("The number, " + userNum + ", is an odd number.");
    }

    scanner.close();
  }
}
