import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	public void readfile () throws IOException {

		// Putting method in a try/catch block.
		try {

			Scanner sc = new Scanner(System.in);
			// Declaring variable to store file location.
			String loc;
			// Asking user for file location.
			System.out.println("Enter file location to read:");
			loc = sc.next();
			// Creating a FileReader to read file.
			FileReader in = new FileReader (loc);
			// Reading characters from file.
			int t = in.read();
			// Creating a while loop to read the file until end is reached which is denoted by the -1.
			while (t != -1) 
			{
				// Printing the read characters on screen.	
				System.out.print((char) t);
				// Read another character and loop until t = -1.
				t = in.read();
			}

		}catch (FileNotFoundException e) {
			// Catching exception and printing out message to user.
			System.out.println("File not found!");

		}	

	}





}





