
public class busApp {

	   public static void main(String[] args) {
           float 	consume=3.5f;
           float 	fuel =30.5f;
           float 	tank = 31.0f;

           double 	fuel_cost = 14.5;
           int 		ticket = 5;
           int 		pasageri_max = 25;

           int 		tour=0;
           int 		pasageri = 500;

           while(fuel >= consume) {
                   tour++;

                   System.out.println( "Starting tour: " + tour);
                   System.err.println( "Tour : " + tour + " is over, you transported : " + pasageri_max + " passangers \n Your profit is : " + ticket*pasageri_max + " lei");
                   
                   if(pasageri <= 0){
                	   System.err.println("No passangers !");
                	   break;
                   }

                   fuel -= consume;
                   pasageri -=25;

           }

           System.err.println("Not enough fuel !! Fuel left: " + fuel + " L");

           System.out.println("You made today : " + tour*ticket*pasageri_max + " LEI (fuel included) and " + (tour*ticket*pasageri_max-(tank-fuel)*fuel_cost) + " lei (profit)");
           System.out.println("Fill the tank with : " + (tank-fuel)+ " L to continue the route, it will cost you : " + (int)(tank-fuel)*fuel_cost + " LEI ");


           }

}
