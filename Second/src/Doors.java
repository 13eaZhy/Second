
public class Doors {

	public static void main(String[] args) {
		boolean entrance_door=true;
		boolean apartment_door=false;
		boolean seif_door=true;
		
		if( entrance_door ){
			System.out.println("Entered Building !!!");
			
			if( apartment_door ){
				System.out.println("Entered Apartment !!!");
				
				if( seif_door ){
					System.out.println("Entered Seif !!!");
				}else{
					System.err.println("CANNOT ENTER Seif !!!");
				}
				
			}else{
				System.err.println("CANNOT ENTER APARTMENT !!!");
			}
			
		}else{
			System.err.println("CANNOT ENTER BUILDING !!!");
		}

	}

}
