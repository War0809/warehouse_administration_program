import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.security.SecureRandom;
import java.util.Vector;

public class Hardmenu {

	public void hardwmenu () throws IOException, ParseException {

		Scanner sc = new Scanner(System.in);
		// Creating a vector to hold user input.
		Vector hardware = new Vector();
		// Declaring variables.
		String answer,ans,ans1,ans2;
		SecureRandom random = new SecureRandom();
		LocalDate enteredDate = null;
		LocalDate nowDate = LocalDate.now();
		// Asking user to enter the number of inputs he wants to make.
		System.out.println("How many products do you want to add?");
		int choice = sc.nextInt();
		// Putting the menu into a for loop to keep looping depending on user input above.
		for (int i = 0; i < choice; i++) {

			System.out.println("Hardware Product");
			System.out.println("******************");
			System.out.println("");
			// Auto generated unique identification for each product.
			System.out.println("Auto-Generated Unique Product ID:");
			int itemID = random.nextInt(1000000);
			System.out.println(itemID);
			sc.nextLine();
			// Adding output to array list.
			hardware.add(itemID);
			// Asking user for product description.
			System.out.println("Enter Product Description:");
			String itemDescription = sc.nextLine();
			// Adding output to array list.
			hardware.add(itemDescription);
			// Asking user for product dimensions.
			System.out.println("Enter Product Dimensions (W * L * H):");
			System.out.println("Width:");
			int width = sc.nextInt();
			// Adding output to array list.
			hardware.add(width);
			System.out.println("Length:");
			int length = sc.nextInt();
			// Adding output to array list.
			hardware.add(length);
			System.out.println("Height:");
			int height = sc.nextInt();
			// Adding output to array list.
			hardware.add(height);
			// Asking user for product weight.
			System.out.println("Product weight:");
			Double weight = sc.nextDouble();
			// Adding output to array list.
			hardware.add(weight);
			// Asking user to enter purchase date.
			// A do while loop to keep asking user for purchase date if inputting a future date.
			do {
				System.out.println("Purchase date DD/MM/YYYY:");
				String date = sc.nextLine();
				DateTimeFormatter dateform = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				enteredDate = LocalDate.parse(date, dateform);
				nowDate = LocalDate.now();
			} while (nowDate.isBefore(enteredDate));
			// Adding output to array list.
			hardware.add(enteredDate);
			// Asking user if he wants to enter cost price or not.
			System.out.println("Do you want to add cost price? Y/N");
			ans = sc.nextLine();
			if (ans.equalsIgnoreCase("Y")) {
				System.out.println("Cost price:");	
				Double price = sc.nextDouble();
				// A while loop to keep asking user for a price if he enters 0.
				while (price <= 0) {
					System.out.println("Cost price cannot be 0! Please re-enter :");
					price=sc.nextDouble();
				}
				// Adding output to array list.
				hardware.add(price);
			}
			else if (ans.equalsIgnoreCase("N")) {
				// Adding Null as output to array list if user chooses not to enter cost price.
				hardware.add("Null");
			}
			// Asking user if he wants to enter selling price or not.
			System.out.println("Do you want to add selling price? Y/N");
			ans1 = sc.next();
			if (ans1.equalsIgnoreCase("Y")) {
				System.out.println("Selling price:");
				Double sellingPrice = sc.nextDouble();
				// A while loop to keep asking user for a price if he enters 0.
				while (sellingPrice <= 0) {
					System.out.println("Selling price cannot be 0! Please re-enter :");
					sellingPrice=sc.nextDouble();
				}
				// Adding output to array list.
				hardware.add(sellingPrice);
			}
			else if (ans1.equalsIgnoreCase("N")) {
				// Adding Null as output to array list if user chooses not to enter selling price.
				hardware.add("Null");
			}
			// Asking user if he wants to enter stock amount or not.
			System.out.println("Do you want to add amount in stock? Y/N");
			ans2 = sc.next();
			if (ans2.equalsIgnoreCase("Y")) {
				System.out.println("Amount to add to stock:");			
				int stockLevel = sc.nextInt();
				// A while loop to keep asking user for a stock amount if he enters 0.
				while (stockLevel <= 0) {
					System.out.println("Stock level cannot be 0! Please re-enter :");
					stockLevel=sc.nextInt();
				}
				// Adding output to array list.
				hardware.add(stockLevel);
			}

			else {
				// Adding output to array list.
				hardware.add("Null");
			}
			// Asking user to save input or not.
			System.out.println("Do you want to save Y/N ? ");
			answer = sc.next();
			// If user chooses to save, array list is written to file.
			if (answer.equalsIgnoreCase("Y")) {

				FileWriter writer = new FileWriter ("/Users/warrengriscti/Desktop/School/Java/Inventory.txt",true);
				Writer output = new BufferedWriter (writer);
				int sz = hardware.size();
				for (int i2 = 0; i2 < sz; i2++) 
					// Each string of input is divided by a |.
					output.write(hardware.get(i2).toString () + "|");
				// Closing writer.
				output.close();
				// Output message to user.
				System.out.println("Items saved successfully! ");
				
				break;

			}
			// If user chooses not to save, array list is not saved.
			else if (answer.equalsIgnoreCase("N")) {
				// Output message to user.
				System.out.println("Items not saved! ");

				break;
			}
		}
	}

}

