import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InventoryPrice {
	
	public void invprice () throws IOException {
    // Putting method in try/catch block.
try {
	// Input and output file locations.
	File in = new File("/Users/warrengriscti/Desktop/School/Java/Inventory.txt");
	File out = new File("/Users/warrengriscti/Desktop/School/Java/InventoryStock.txt");
	
	// Buffered reader reading from file location entered by user. 
	// Buffered writer writing to file location  entered by user.
	BufferedReader br = new BufferedReader( new FileReader( in ) );
	BufferedWriter bw = new BufferedWriter( new FileWriter(out) );
    
        String line;
        while ((line = br.readLine()) != null) {
            // Split the line on the spaces so that you can select the index
            // representing the column as long as it is not a blank line
            if (!line.trim().isEmpty()) {
                String[] splitLine = line.split("|");
                // Splitting records in the input file and writing inputs at index 6 and 8 to file.
                String destLine = splitLine[6] + "|" + splitLine[8] + "|";
                bw.write(destLine);
                bw.write(System.getProperty("line.separator"));
            }
      
        }
            // Closing buffered reader.
            br.close();
            // Output message to user if file is not found.
}           catch (FileNotFoundException e) {
            System.out.println("File not found!");
        
        
         }
    
                
            
    }
}

    

    

                        
                   
                
            
        
    
 




