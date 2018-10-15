import java.util.Scanner;

public class TablaSahApp {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("r/c ?");
		int rr,cc;
		rr = in.nextInt();
		cc = in.nextInt();
		
		for ( int r=1;  r<= 10; r++ ){ //row
			for ( int c=1 ; c<= 10; c++ ){ //column
				if ( r==1 || r==10 || c ==1 || c == 10){
				System.out.print("# ");
				} else {
					
					if ( rr == r && cc == c){
					System.out.print("x ");
					}else{
						System.out.print(". ");
					}
				}
			}
			System.out.println();
			}
	}

}
