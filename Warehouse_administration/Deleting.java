import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Deleting {
	public Deleting () {
	  }

	public final void run (String[] args) throws IOException {


		Scanner sc =  new Scanner(System.in);
		// Declaring variables.
		String ID, record;

		// Input and temporary output file locations.
		File tempin = new File("/Users/warrengriscti/Desktop/School/Java/InventoryEdit.txt");
		File in = new File("/Users/warrengriscti/Desktop/School/Java/Inventory.txt");

		// Buffered reader reading from file location entered by user. 
		// Buffered writer writing to file location  entered by user.
		BufferedReader br = new BufferedReader( new FileReader( in ) );
		BufferedWriter bw = new BufferedWriter( new FileWriter( tempin ) );

		// Asking user for product ID of record he wants to delete.
		System.out.println("Enter the Product ID to delete record: ");
		ID =  sc.nextLine();


		while( ( record = br.readLine() ) != null ) {
			// Searching input file to find lines starting with ID user provided.
			if( record.startsWith(ID) ) 
				continue;
			// Writer deleting record starting with ID entered by user.
			bw.write(record);
			bw.flush();
			bw.newLine();

		}
		// Closing buffered reader and writer.
		br.close();
		bw.close();
		// Deleting input file.
		in.delete();
		// Temporary file renamed like input file.
		tempin.renameTo(in);
		// Message printed to user.
		System.out.println("Product entry deleted successfully");

	}
}
