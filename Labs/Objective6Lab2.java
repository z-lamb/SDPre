public class Objective6Lab2 {
  public static void main(String[] args) {
    int counter = 0;

    while(counter <= 20) {
      counter++;
      if (counter <= 20) {
        System.out.println(counter);
      }
    }
  }
}

/* This program would have been much easier if I didn't use the starter code.
   Because I only wanted 1-20 to print I had to put an if statment to keep
   it from printing 21. One way to easily fix this would be start the counter
   at 1 instead 0. Another way to fix this would be to do the while loop as
   (counter < 20) if you keep the code as itterate the count and then print.
   I did this by putting the print inside and if statement to keep it from
   printing 21.
*/
