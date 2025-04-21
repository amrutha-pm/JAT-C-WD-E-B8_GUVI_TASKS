package task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quest4 
{
//FileNotFoundException and file reading
	public static void methodForFileNotFoundException() throws FileNotFoundException
	{
		
        String filePath = "C:\\Users\\ADMIN\\Documents\\myNotesGuvi.txt";  // Ensure correct file extension

       // String filePath = "C:\\Users\\ADMIN\\Documents\\myNotesGuvi.txt";  // This file exist
       // "C:\Users\ADMIN\Documents\myNotesGuvi.txt"
	try {
        File file = new File( "C:\\Users\\ADMIN\\Documents\\myNotesGuvi.t");  //open file
        Scanner sc = new Scanner(file);  //throws exception if file not there
        
                                          // Reading file contents 
        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

        sc.close();  // Close the scanner

	} 
//	catch (FileNotFoundException e) 
//	{
        // Handle the exception if the file is not found
    //    System.out.println("File not found: " + e.getMessage());
   // } 
	
catch (Exception e) 
   {
        // Handle any other exceptions
      //System.out.println("An unexpected error occurred: File NotFound " + e.getMessage());
    System.out.printf("An unexpected ErrorType occurred"+ e);

   }
}
        public static void main(String[] args) throws FileNotFoundException {
        	
            methodForFileNotFoundException();

    		// TODO Auto-generated method stub
	

}}
