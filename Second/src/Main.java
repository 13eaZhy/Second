
public class Main {

	public static void main(String[] args) {
		
//		int 	money_euro = 1000;
//		int 	money_usd  = 500;
//		double  koef_euro = 19.5;
//		double  koef_usd  = 15.5;
//		
//		System.out.println(  money_euro + " EURO converts to = " + money_euro * koef_euro + "MDL");
//		System.out.println(  money_usd  + " USD converts to = "  + money_usd * koef_usd +   "MDL");
		
 // distanta intre A si B 5000km, stim viteza maximala 160km/h, cati l va consuma, daca la 100kmh mananca 5l, cate ore va trebui de mers
		
		int distanta_km = 5000;
		int viteza_kmh = 160;
		double consum_masina = 5;
		double ore_sutka = 24;
		double timp_parcurs = distanta_km *1.0 / viteza_kmh ;
		System.out.println("Distanta parcursa : " + distanta_km + " KM");
		System.out.println("Viteza maxima a masinii : " + viteza_kmh + " KM/H");
		System.out.println("Consumul mediu a masinii pe parcursul a intregei distante : " + consum_masina + " L/100km");
		System.out.println("Cantitatea de combustibil consumata in total: " + distanta_km / 100 * consum_masina + " L");
		System.out.println("Timpul total parcurs: " + timp_parcurs + " ORE" + " SAU " + (int)(distanta_km / viteza_kmh / ore_sutka) + " ZILE");
	}

}
