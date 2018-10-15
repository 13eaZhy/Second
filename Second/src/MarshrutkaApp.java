
public class MarshrutkaApp {

	public static void main(String[] args) {
		float consume = 3.5f;      // l/tour
		float fuel    = 30.5f;     // l
		float tank    = 50.0f;     // l
		
		int tour = 0;              // Tour number
		
		while( fuel >= consume){
			
			tour++;
			
			System.out.println( "Starting tour : " + tour );
			
			fuel -= consume;
			
		}
			System.err.println("Not enough fuel !! \n Fuel left = " + fuel);
			System.out.println("Fill in tank : "+ (tank-fuel) + " l");
	}

}
