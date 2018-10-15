
public class PolymorphApp {

	public static void main(String[] args) {
				add (10,20);
				add (10.6f,20.3f);
				add (20.8,30.3);

	}
	
	public static void add ( int a, int b, int c){
		System.out.println( "Integer sum: " + ( a + b + c ) );
	}
	public static void add ( float a, float b){
		System.out.println( "Integer sum: " + ( a + b ) );
	}
	public static void add ( double a, double b){
		System.out.println( "Integer sum: " + ( a + b ) );
	}
}
