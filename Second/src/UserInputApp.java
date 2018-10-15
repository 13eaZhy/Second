import java.util.Scanner;

public class UserInputApp {

	public static void main(String[] args) {
		int current_year = 2018;
		int birth_year = 1970;
		
		System.out.print("Your birth year is: ");
		Scanner in = new Scanner(System.in);
		birth_year = in.nextInt();
		int age = current_year - birth_year;
		
		System.out.println ("You are " + age + " years old");

	}

}
