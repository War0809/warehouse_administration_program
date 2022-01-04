import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ViewStock {

	public void view () throws IOException {

		Scanner sc = new Scanner(System.in);
		// Declaring variables.
		String ID, destLine;
		// Asking user for product ID.
		System.out.println("Product Id to view stock:");
		ID = sc.nextLine();
		// Read file from specified location.
		File in = new File("/*****/Inventory.txt");

		// Buffered reader reading from file location entered by user.
		BufferedReader br = new BufferedReader( new FileReader(in) );
		// Initialising variable holding line splitting to null.
		String lineText = null;

		while ((lineText = br.readLine()) != null) {

			// If line starts with entered ID, it is split at every |.
			if( lineText.startsWith(ID) ) {
				lineText.trim().isEmpty();
				String[] splitLine = lineText.split("|");
				// Storing strings at index 0 and 8 into the variable.
				destLine = "Product ID " + splitLine[0] + " : " + splitLine[8] + " left in stock. ";

				// Printing out strings stored in the variable.
				System.out.println(destLine);
			}



		}

		// Buffered reader close.
		br.close();
	}
}






















