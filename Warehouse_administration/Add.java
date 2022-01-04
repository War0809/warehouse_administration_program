import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Add {

	public void adding () { 

		// Declaring and initialising variables.
		Scanner input = null;
		double sum = 0;
		int stock = 0;
		// Putting the method in a try/catch block.
		try {
			//Reading file containing Inventory Stock.
			input = new Scanner(new File("/Users/*****/InventoryStock.txt"));
			while (input.hasNextDouble()) {
				sum += input.nextDouble();
				stock = input.nextInt();
			}
			// Print out the results.
			System.out.printf("Total inventory cost is: " + "€%.2f",sum * stock);
			
			input.close();
			
		} catch (FileNotFoundException e) {
				// Catching exception and printing out message to user.
				System.out.println("File not found!");
		
			
		}
	}
}
