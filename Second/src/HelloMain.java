
public class HelloMain {

	public static void main(String[] args) {
		hi(3);
		bye(3);
	}
	
	public static void hi( int m){
		for ( ; m >=1 ; --m){
			System.out.println("Hello, JAVA!");		
		}
	}
	public static void bye( int n ){
		do{
			System.out.println("Goodbye");
		} while ( --n!=0 );
		}
	}

