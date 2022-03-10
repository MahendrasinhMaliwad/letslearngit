package company.Training;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    
    try {
    	/*FileWriter filewriter= new FileWriter("files.txt");
    	filewriter.write("yeah we do that, finally file can write");
    	filewriter.close(); */
    	File myobj= new File("files.txt");
    	Scanner sc = new Scanner(myobj);
    	while (sc.hasNextLine()) {
    		String line = sc.nextLine();
    		System.out.println(line);
    		
    	}
    	sc.close();
    }
    catch (IOException e) {
    	System.out.println("files not exist");
    	e.printStackTrace();
    }
	/*if(myobj.exists()) {
		System.out.println("file created succesfully "+ myobj.getName());
		System.out.println("file path : "+ myobj.getAbsolutePath());
		System.out.println("");
	}
	else {
		System.out.println("file already exist");
	     }
    */
    		
     
}
}
