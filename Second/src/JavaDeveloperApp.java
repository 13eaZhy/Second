import java.util.Scanner;

public class JavaDeveloperApp {

	public static void main(String[] args) {
		int salary = 20;
		int ore_lucrate;
		int ore_necesare=100;
		
		System.out.print("How much hours you worked this month? : ");
		Scanner in = new Scanner (System.in);
		ore_lucrate = in.nextInt(); 
		int total_money = salary * ore_lucrate;
		System.out.print("Your salary for this month is: " + total_money + " $ \n");
			
		if (ore_lucrate >= 100 && ore_lucrate <= 744){
			System.out.println("You worked " + (ore_lucrate-ore_necesare) + " extra time hours");
			System.out.println("You will earn for extra hours: " + (ore_lucrate-ore_necesare)*2 + " $");
			System.out.println("In total your salary for this month is: " + ( total_money+(ore_lucrate-ore_necesare)*2 ) + " $$$");
		}
		
		else {
			System.err.println("You can't work as much !");
		}
		}
	}

