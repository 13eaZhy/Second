import java.util.Scanner;
public class UserPasswordApp {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		final int PIN = 1111;
			  int pin;
			  
		do{
			System.out.print("PIN:>>> ");
			pin = in.nextInt();
		} while ( pin != PIN);
		

	}

}
