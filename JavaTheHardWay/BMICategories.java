import java.util.Scanner;

public class BMICategories {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "This program will calculate your BMI" );

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

		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi <  18.5 ) {
			System.out.println( "underweight" );
		}
		if ( bmi <  25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi <  30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi <  35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi <  40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}
