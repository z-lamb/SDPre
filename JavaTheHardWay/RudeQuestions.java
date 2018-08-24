import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age;
		double weight, income, height;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "What is your height and how much do you weigh, " + name + "? " );
		height = keyboard.nextDouble();
		weight = keyboard.nextDouble();

		System.out.println( weight + "! Better keep that quiet and not too shabby for being " + height + " tall." );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks, for answering my rude questions, " );
		System.out.println( name + "." );
	}
}

// Does the program blow up if you enter an integer value when it is expecting you to type a double?
// No it does not because an integer can be a double but a double can not be an integer because an integer has to be a whole number

// Does the program blow up if you enter a numeric value (integer or double) when it is expecting a String?
// No it does not because a string pretty much takes anything you give it and stores it as a String

//
