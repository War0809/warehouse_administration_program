
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddSellPrice {
	
	public void addselling () throws IOException {
		// Declaring Variables.
		Scanner sc = new Scanner(System.in);
		String ID;
		Double sell;
		// Input and temporary output file locations.
		File in = new File("/*****/Inventory.txt");
		File tempin = new File("/*****/InventoryEdit.txt");


		// Buffered reader reading from file location entered by user. 
		// Buffered writer writing to file location  entered by user.
		BufferedReader br = new BufferedReader( new FileReader(in) );
		BufferedWriter bw = new BufferedWriter( new FileWriter(tempin) );

		// Asking user for product ID and its selling price.
		System.out.println("Product Id to add sell price:");
		ID = sc.nextLine();
		System.out.println("What is the sell price?");
		sell = sc.nextDouble();
		// Converting user input to string.
		String p = Double.toString(sell);

		String lineText = null;

		while ((lineText = br.readLine()) != null) {
			// Searching input file to find lines starting with ID user provided.
			if( lineText.startsWith(ID) ) {
				// Text is split after each | and selling price situated at index 7 is updated.
				if (!lineText.trim().isEmpty()) {
					String [] splitLine = lineText.split("|");
					// Variable costPrice will hold the new data.
					String sellPrice = splitLine[0] + "|" + splitLine[1] + "|" + splitLine[2] + "|" + splitLine[3] + "|" + splitLine[4] + "|" + splitLine[5] + "|" + splitLine[6] + "|" + splitLine[7].replace("Null", p) + "|" + splitLine[8] + "|";
					//Buffered Writer writes new date to file.
					bw.write(sellPrice);
					bw.newLine();
				}

			}

		}

		// Buffered writer and reader are closed.
		bw.close();
		br.close();
		// Input file deleted.
		in.delete();
		// Temporary file renamed like input file.
		tempin.renameTo(in);
		// Message printed to user.
		System.out.println("Stock updated successfully");

	}


}


