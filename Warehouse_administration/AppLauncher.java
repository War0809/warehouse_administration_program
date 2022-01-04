import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class AppLauncher {
	
	

	public static void main(String[] args) throws IOException, ParseException {

		Scanner sc = new Scanner(System.in);
		// Creating boolean variable to provide user choice to exit from menu.
		boolean exit = false;
		// Putting menu in a do while loop to keep looping menu until user choose option to exit.
		do {
			// Getting menu from menu class.	
			Menu inventory = new Menu ();
			inventory.appmenu();

			int choice = sc.nextInt();
			// Creating switch case for user menu choices.
			switch (choice) {

			case 1 : System.out.println("Choose Product Type : ");
			System.out.println("********************* ");
			System.out.println(" ");
			System.out.println("1.Consumbles");
			System.out.println("2.Hardware");

			int submenu = sc.nextInt();

			switch (submenu) {
			// Getting consumbles menu from its class.
			case 1 : Conmenu consumbles = new Conmenu();
			         consumbles.consmenu();

			break;
			// Getting hardware menu from its class. 
			case 2: Hardmenu hardware = new Hardmenu();
	                hardware.hardwmenu();


			break;

			}
			// Switch case 2. Getting stock update method from its class.
			case 2: 

				StockUpdate stock = new StockUpdate();
		        stock.update();

				break;
			// Switch case 3. Getting add cost price method from its class.
			case 3: 

				AddCostPrice cost = new AddCostPrice();
				cost.addcost();

				break;
			// Switch case 4. Getting add selling price method from its class.
			case 4: 

				AddSellPrice sell = new AddSellPrice();
				sell.addselling();
				
				break;
				// Switch case 5. Getting view stock method from its class.
			case 5 :

				ViewStock stockview = new ViewStock();
		         stockview.view();

				break;

				// Switch case 6. Working out total inventory price.
			case 6 : 

				InventoryPrice price = new InventoryPrice();
		        price.invprice();

				Add add = new Add ();
				add.adding();
				
				break;
				// Switch case 7. Getting method from ReadFile class.
			case 7 : ReadFile read = new ReadFile();
	                 read.readfile();


			break;
			// Switch case 8. Boolean variable switched to true so menu will exit.
			case 8 : 

				exit = true;
				System.out.println("Program exited");

				break;
			}

		}while (!exit);

	}

}
