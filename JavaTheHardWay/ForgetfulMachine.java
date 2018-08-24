import java.util.Scanner;

public class ForgetfulMachine {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "What city is the capital of France?" );
		keyboard.next();

		System.out.println( "What is 6 multiplied by 7?" );
		keyboard.nextInt();
		// The program blows up when I type any non integer which includes doubles or strings

		System.out.println( "Enter a number between 0.0 and 1.0.");
		keyboard.nextDouble();
		// The program blows up when I type in a string because it was expecting a double but received a string

		System.out.println( "Is there anything else you would like to say?" );
		keyboard.next();

	}
}
