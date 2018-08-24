import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, in, ft, kg, lb, bmi;

		System.out.print( "Your height (feet): " );
		ft = keyboard.nextDouble();

		System.out.print( "Your height(inches): " );
		in = keyboard.nextDouble();

		System.out.print( "Your weight in lb: " );
		lb = keyboard.nextDouble();

		m = (( ft * 12 ) + in) / 39.37;
		kg = lb / 2.2;
		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}
