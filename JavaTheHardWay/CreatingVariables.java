public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, favorite;
		double seconds, e, checking, pie;
		String firstName, lastName, title, month, week;

		x = 10;
		y = 400;
		age = 39;
		favorite = 13;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		pie = 3.14;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		month = "March";
		week = "Friday";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y. " );
		System.out.println( "The experiment took " + seconds + " seconds " );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "Gretchen is my wife and she was born in " + month + " on a " + week + " and " + pie + " is close to her birthday." );
	}
}
