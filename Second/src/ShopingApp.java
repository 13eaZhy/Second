
public class ShopingApp {

	public static void main(String[] args) {
		Product drink = new Product(10.5, 300);
		Product food  = new Product(-30.0, 600);
		// drink.price = 10.5;
		// food.price = 30.0;
		drink.info();
		food.info();

	}

}


class Product {
	double  price;   // ----> Object
	int     weight;  //  ----> Object
	int     quantity ;
	boolean available; // ----> Object
	
	//constructor
	Product( double p ){
		 System.out.println(" A new product was created");
			if ( p > 0){
			 price = p; 
			 } else {
				 System.err.println( "Price cannot be negative " );
			 }
		 }
	
	Product( double p, int w){
	  this(p); // link la constructor
	 weight = w;
	}
	
	void info(){
		System.out.println(	"\n\nThis is a product");
		System.out.println(	price + " MDL");
		System.out.println(	weight + " g");
		System.out.println( quantity + " pieces");
		System.out.println( available ? "in stock" : "not for sale");
	}
}