
public class DoZaApp {

	public static void main(String[] args) {
		

		int result = getRandomNumber(70,100);
		System.out.println( result );

	}
	
	public static int getRandomNumber( int min, int max){
		return (int)( (max-min) * Math.random() ) + min;
	}

}
