import java.util.Scanner;

public class RestaurantApp {

	public static void main(String[] args) {
        int select_food = 0;
        int select_drinks = 0;
        int select_shipping = 0;
        int food_qty = 1;
        int drinks_qty = 1;

        WelcomeMenu();

        Scanner in = new Scanner(System.in);

        int menu = in.nextInt();

        if (menu == 1) {
            System.out.println(" You choose food menu ");
        } else if (menu == 2) {
            System.out.println(" You choose drinks menu ");
        } else {
            System.out.println(" You choose shipping menu ");
        }

        if ( menu == 1 ){
            showMenu(1);
            System.out.print(" Select : ");
            select_food = in.nextInt();
        } else if ( menu == 2 ) {
            showMenu(2);
            System.out.print(" Select : ");
            select_drinks = in.nextInt();
        } else if ( menu == 3 ) {
            showMenu(3);
            System.out.print(" Select : ");
            select_shipping = in.nextInt();
        }

        if ( menu == 1 ){
            System.out.print( " Enter the qty : ");
            food_qty = in.nextInt();
            System.out.println();
        }
        if ( menu == 2 ){
            System.out.print( " Enter the qty : ");
            drinks_qty = in.nextInt();
            System.out.println();

        }

        if ( menu == 1){
            System.out.println( " You want something to drink? ");
            System.out.println( " 1 - Yes | 2 - No, go to total " );
            System.out.print(" Select : ");
            int sel = in.nextInt();

            if ( sel == 1 ){
                showMenu(2);
                System.out.print(" Select : ");
                select_drinks = in.nextInt();
                System.out.print(" Enter qty: ");
                drinks_qty = in.nextInt();


            } else if ( sel == 2){

            }

        }
        if  (menu == 2){
            System.out.println(" You want something to eat? " );
            System.out.println(" 1 - Yes | 2 - No, go to total" );
            int sel2 = in.nextInt();

            if ( sel2 == 1){
                showMenu(1);
                System.out.print(" Select : ");
                select_food = in.nextInt();
                System.out.print(" Enter Qty : ");
                food_qty = in.nextInt();

            } else if ( sel2 == 2) {

            }


        }
        selectOption(select_food, select_drinks, select_shipping, food_qty, drinks_qty);
        System.out.println();
        System.out.println();


    }

    public static void WelcomeMenu() {
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.print(" Welcome to Andys Pizza");
            } else {
                System.out.print(" = ");
            }

        }
        System.out.println();
        System.out.println();
        System.out.println(" Please choose menu. Press 1 for food / Press 2 for drinks / Press 3 for shipping");
        System.out.println();

        for (int n = 1; n <= 10; n++) {
            if (n == 5) {
                System.out.print(" Your order will be made in 20 min ");
            } else {
                System.out.print(" = ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.print( " Select menu : ");
        System.out.print( " " );
    }

    public static void showMenu(int menu) {
        System.out.println();
        if (menu == 1) {
            System.out.println();
            for (int a = 1; a <= 10; a++) {
                if (a == 5) {
                    System.out.print(" Welcome to food menu ");
                } else {
                    System.out.print(" = ");
                }
            }
            System.out.println();
            System.out.println(" 1 - Piept de pui panne + sos picant ________ 65.00 lei ");
            System.out.println();
            System.out.println(" 2 - Cartofi pai + sos la alegere    ________ 30.00 lei ");
            System.out.println();
            System.out.println(" 3 - Pită grecească cu carne de vită ________ 100.00 lei ");
            System.out.println();
            System.out.println(" 4 - Chifteluțe de curcan cu piure   ________ 75.00 lei ");
            System.out.println();

            for (int b = 1; b <= 10; b++) {
                if (b == 5) {
                    System.out.print(" Make your choise please");
                } else {
                    System.out.print(" = ");
                }
            }
            System.out.println();
            System.out.println();
        } else if ( menu == 2 ){
            System.out.println();
            for (int a = 1; a <= 10; a++) {
                if (a == 5) {
                    System.out.print(" Welcome to drinks menu ");
                } else {
                    System.out.print(" = ");
                }
            }
            System.out.println();
            System.out.println();
            System.out.println(" 1 - Sandora Multifruсt 0,95L        ________ 55.00 lei ");
            System.out.println();
            System.out.println(" 2 - Milkshake de banană-mango       ________ 35.00 lei ");
            System.out.println();
            System.out.println(" 3 - Milkshake de ciocolată          ________ 35.00 lei ");
            System.out.println();
            System.out.println(" 4 - Sandora Mere 0,95L              ________ 55.00 lei ");
            System.out.println();

            for (int b = 1; b <= 10; b++) {
                if (b == 5) {
                    System.out.print(" Make your choise please");
                } else {
                    System.out.print(" = ");
                }
            }
            System.out.println();
            System.out.println();
        } else if ( menu == 3) {
            System.out.println();
            for (int a = 1; a<= 10; a++){
                if ( a == 5){
                    System.out.print(" Welcome to shipping menu ");
                } else {
                    System.out.print(" = ");
                }
            }
            System.out.println();
            System.out.println(" 1 - You eat in our restaurant            _________ free ");
            System.out.println();
            System.out.println(" 2 - Fast deliver in 30 mins to your home ________ 30 lei");

            for (int b = 1; b <= 10; b++) {
                if (b == 5) {
                    System.out.print(" Make your choise please ");
                } else {
                    System.out.print(" = ");
                }
            }
            System.out.println();
        }
    }

    public static void selectOption (int select_food, int select_drinks, int select_shipping, int drinks_qty, int food_qty ) {
        int price_food = 0;
        int price_drinks = 0;
        int price_shipping = 0;


        System.out.println( " Today you ordered : ");
        System.out.println();

        switch (select_food){
            case 1: System.out.println(drinks_qty + "x " + " Piept de pui panne + sos picant      ________ 65.00 lei " ); price_food = 65; break;
            case 2: System.out.println(drinks_qty + "x " + " Cartofi pai + sos la alegere         ________ 30.00 lei " ); price_food = 30; break;
            case 3: System.out.println(drinks_qty + "x " + " Pită grecească cu carne de vită      ________ 100.00 lei "); price_food = 100; break;
            case 4: System.out.println(drinks_qty + "x " + " Chifteluțe de curcan cu piure        ________ 75.00 lei " ); price_food = 75; break;
        }

        switch (select_drinks){
            case 1: System.out.println(food_qty + "x " + " Sandora Multifruсt 0,95L             ________ 55.00 lei "); price_drinks = 55; break;
            case 2: System.out.println(food_qty + "x " + " Milkshake de banană-mango            ________ 35.00 lei "); price_drinks = 35; break;
            case 3: System.out.println(food_qty + "x " + " Milkshake de ciocolată               ________ 35.00 lei "); price_drinks = 35; break;
            case 4: System.out.println(food_qty + "x " + " Sandora Mere 0,95L                   ________ 55.00 lei "); price_drinks = 75; break;
        }

        switch (select_shipping){
            case 1: System.out.println(" 1 - You eat in our restaurant            _________ free "); price_shipping = 0; break;
            case 2: System.out.println(" 2 - Fast deliver in 30 mins to your home ________ 30 lei"); price_shipping = 30; break;
        }
        System.out.println();
        for ( int n = 1 ; n<=10 ; n++){
            if ( n == 5){
                System.out.print( " Total to pay : " + (price_food * food_qty + price_drinks * drinks_qty + price_shipping) + " Lei ");
            } else {
                System.out.print( " = ");
            }
        }
        System.out.println();
        System.out.print( " Thank you for choosing Andys Pizza !");
    }

}
