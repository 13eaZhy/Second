import java.util.Scanner;

public class SchoolApp {

	public static void main(String[] args) {
		int semestru_unu;
		int semestru_doi;
		int examen;
		double media;
		
		System.out.print("Your first semester mark: ");
		Scanner in = new Scanner (System.in);
		semestru_unu = in.nextInt();
		
		System.out.print("Your second semester mark: ");
		semestru_doi = in.nextInt();
		
		System.out.print("Your exam mark: ");
		examen = in.nextInt();
		
		media = (int)((0.3*semestru_unu) + (0.3*semestru_doi) + (0.4*examen));
		
		System.out.println("Media notelor este: " + media);
		
		if ( media <=5 ){
			System.err.println(" BAD STUDENT");
		}
		
			if ( media >= 6 && media <= 8){
				System.err.println(" Good STUDENT");
			}
			
				if ( media >= 9 && media <=10){
					System.err.println("Excellent STUDENT");
				}
				
	}
			
			
		
	}


