public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;

    side1 = 10;
    side2 = 8;

    hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

    System.out.print("The hypotenuse of a triance with sides ");
    System.out.println(side1 + " and " + side2 + " is " + hypotenuse);
  }
}
