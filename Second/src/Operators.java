
public class Operators {

        public static void main(String[] args) {
                int cola = 3;
                int sprite = 2;
                int lays = 5;
                int beer = 10;
                int bread = 2;
                int water = 4;

                double cola_price = 33.52;
                double sprite_price = 26.83;
                double lays_price = 10.90;
                double beer_price = 13.41;
                double bread_price = 8.49;
                double water_price = 5.93;
                double discount = 12.0/100;
                double total;
                double total_reducere;

                total = cola*cola_price+sprite*sprite_price+lays*lays_price+beer*beer_price+bread*bread_price+water*water_price;
                total_reducere = total-total*discount;

                System.out.println("   *******************************");
                System.out.println("   *          WAL#MART ");
                System.out.println("   * Save moeny. Live better.");
                System.out.println("   *******************************");
                System.out.println("");
                System.out.println("  Shop 0041 Kacca 0001");

                System.out.println("  1:00679 Coca Cola 2L " + "x " + cola);
                System.out.println("  Price  " + cola_price + " Lei * QTY " + cola + " -" + cola_price*discount + " LEI");
                System.out.println("");

                System.out.println("  2:61047 Sprite 2L " + "x " + sprite);
                System.out.println("  Price  " + sprite_price + " Lei * QTY " + sprite + " -" + (int)sprite_price*discount + " LEI");
                System.out.println("");

                System.out.println("  3:29510 Big Lays (CHYPS) " + "x " + lays);
                System.out.println("  Price  " + lays_price + " Lei * QTY " + lays + " -" + (int)lays_price*discount + " LEI");
                System.out.println("");

                System.out.println("  4:38835 Kozel Brun 2L " + "x " + beer);
                System.out.println("  Price  " + beer_price + " Lei * QTY " + beer + " -" + (int)beer_price*discount + " LEI");
                System.out.println("");

                System.out.println("  5:29555 Paine Alba " + "x " + bread);
                System.out.println("  Price  " + bread_price + " Lei * QTY " + bread + " -" + (int)bread_price*discount + " LEI");
                System.out.println("");

                System.out.println("  6:87452 Apa potabila OM 0.5L " + "x " + water);
                System.out.println("  Price  " + water_price + " Lei * QTY " + water + " -" + (int)water_price*discount + " LEI");
                System.out.println("");

                if (total >=300) {
                        System.out.println("  Aveti o reducere de 12% !");
                } else {
                        System.out.println("  Aveti o reducere de 5% !");
                }


                System.out.println(" -------------------------------");
                System.out.println("  Total in LEI : "+ total);
                System.out.println("  Reducere -12% : " + (int)total*discount);
                System.out.println("  Total spre achitare: "+ (int)total_reducere + " LEI");

        }

}