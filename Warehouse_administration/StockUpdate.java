import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StockUpdate {
	
	public void update () throws IOException {

		Scanner sc = new Scanner(System.in);
		// Declaring variables.
		String ID;
		String stock;
		//Input and temporary output file locations.
		File in = new File("/Users/warrengriscti/Desktop/School/Java/Inventory.txt");
		File tempin = new File("/Users/warrengriscti/Desktop/School/Java/InventoryEdit.txt");

		//Buffered reader reading from file location entered by user. 
		//Buffered writer writing to file location  entered by user.
		BufferedReader br = new BufferedReader( new FileReader( in ) );
		BufferedWriter bw = new BufferedWriter( new FileWriter( tempin ) );

		// Asking user for ID of product to update stock.
		System.out.println("Product Id to update stock:");
		ID = sc.nextLine();
		// Asking user for new stock value.
		System.out.println("What is the new stock?");
		stock = sc.nextLine();
		// Putting method in a try/catch block.
		try {
			String lineText = null;

			     while ((lineText = br.readLine()) != null) {
				// Searching input file to find lines starting with ID entered by user.
				if( lineText.startsWith(ID) ) {

					int index = lineText.lastIndexOf("|"); lineText.lastIndexOf("Null");

					lineText = lineText.substring(0, index) + "|" + stock;}

				// Buffered writer writes
				bw.write(lineText);
				bw.newLine();
			}
			       
                
			// Buffered writer and reader closed.
			bw.close();
			br.close();
			// Input file deleted.
			in.delete();
			// Temporary file renamed like input file.
			tempin.renameTo(in);
			// Message output to user.
			System.out.println("Stock updated successfully");


		} catch (IOException ex) {
		  // Catching exception and printing out message to user.
		  System.out.println("File not found!");
		}
	}



}



