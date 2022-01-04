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

public class Conmenu {
	
	public void consmenu () throws IOException, ParseException {

		Scanner sc = new Scanner(System.in);
		// Creating a vector to hold user input.
		Vector consumbles = new Vector();
		// Declaring variables.
		String answer, ans, ans1, ans2;
		SecureRandom random = new SecureRandom();
		LocalDate enteredDate, expiryDate = null;
		LocalDate nowDate = LocalDate.now();
		// Asking user to enter the number of inputs he wants to make.
		System.out.println("How many products do you want to add?");
		int choice = sc.nextInt();
		// Putting the menu into a for loop to keep looping depending on user input
		// above.
		for (int i = 0; i < choice; i++) {

			System.out.println("Consumbles Product");
			System.out.println("******************");
			System.out.println("");
			// Auto generated unique identification for each product.
			System.out.println("Auto-Generated Unique Product ID:");
			int itemID = random.nextInt(1000000);
			System.out.println(itemID);
			sc.nextLine();
			// Adding output to array list.
			consumbles.add(itemID);
			// Asking user for product description.
			System.out.println("Enter Product Description:");
			String itemDescription = sc.nextLine();
			// Adding output to array list.
			consumbles.add(itemDescription);
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
			consumbles.add(enteredDate);
			// Asking user for expiry date.
			do {
				System.out.println("Expiry date DD/MM/YYYY:");
				String date = sc.nextLine();
				DateTimeFormatter dateform = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				expiryDate = LocalDate.parse(date, dateform);
				nowDate = LocalDate.now();
			} while (enteredDate.isAfter(expiryDate));
			// Adding output to array list.
			consumbles.add(expiryDate);
			// Asking user for product weight or capacity.
			System.out.println("Item weight or capacity:");
			Double capacity = sc.nextDouble();
			sc.nextLine();
			// Adding output to array list.
			consumbles.add(capacity);
			// Asking user for measuring units.
			System.out.println("Measuring Units:");
			String measuringUnits = sc.nextLine();
			// Adding output to array list.
			consumbles.add(measuringUnits);
			// Asking user if he wants to enter cost price or not.
			System.out.println("Do you want to add cost price? Y/N");
			ans = sc.nextLine();
			if (ans.equalsIgnoreCase("Y")) {
				System.out.println("Cost price:");
				Double price = sc.nextDouble();
				// A while loop to keep asking user for a price if he enters 0.
				while (price <= 0) {
					System.out.println("Cost price cannot be 0! Please re-enter :");
					price = sc.nextDouble();
				}
				// Adding output to array list.
				consumbles.add(price);
			} else if (ans.equalsIgnoreCase("N")) {
				// Adding Null as output to array list if user chooses not to enter cost price.
				consumbles.add("Null");
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
					sellingPrice = sc.nextDouble();
				}
				// Adding output to array list.
				consumbles.add(sellingPrice);
			} else if (ans1.equalsIgnoreCase("N")) {
				// Adding Null as output to array list if user chooses not to enter selling
				// price.
				consumbles.add("Null");
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
					stockLevel = sc.nextInt();
				}
				// Adding output to array list.
				consumbles.add(stockLevel);
			}

			else {
				// Adding output to array list.
				consumbles.add("Null");
			}
			// Asking user to save input or not.
			System.out.println("Do you want to save Y/N ? ");
			answer = sc.next();

			// If user chooses to save, array list is written to file.
			if (answer.equalsIgnoreCase("Y")) {

				FileWriter writer = new FileWriter("/Users/warrengriscti/Desktop/School/Java/Inventory.txt", true);
				Writer output = new BufferedWriter(writer);
				int sz = consumbles.size();
				for (int i1 = 0; i1 < sz; i1++)
					// Each string of input is divided by a |.
					output.write(consumbles.get(i1).toString() + "|");
				// Closing writer.
				output.close();
				// Output message to user.
				System.out.println("Items saved successfully!");
				
				break;

			}
			// If user chooses not to save, array list is not saved.
			else if (answer.equalsIgnoreCase("N")) {
				// Output message to user.
				System.out.println("Items not saved! ");
			}
		}

	}
}
