package task5;

import java.util.Scanner;

public class Quest5Switchcase {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	    	while(true) {
	        System.out.println("Students Grade details");
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter your Mark:");
	        int mark = sc.nextInt();
	        if (mark == -1) {
                System.out.println("Exiting the program.");
                break;
            }
            
	        // Calculate the range group
	        int gradeCategory = mark / 10;  // Group marks into ranges
	        
	        // Use switch case to handle grade categories
	        switch (gradeCategory) {
	            case 10: 
	                if (mark == 100) {
	                    System.out.println("Grade: S");
	                }
	                break;
	            case 9:
	                System.out.println("Grade: A");
	                break;
	            case 8:
	                System.out.println("Grade: B");
	                break;
	            case 7:
	                System.out.println("Grade: C");
	                break;
	            case 6:
	                System.out.println("Grade: D");
	                break;
	            case 5:
	                System.out.println("Grade: E");
	                break;
	            case 4:
	                System.out.println("Grade: F");
	                break;
	            default:
	                if (mark < 40) {
	                    System.out.println("Grade: F");
	                } else {
	                    System.out.println("Invalid mark");
	                }
	                break;
	        }
	        
	       sc.close();
	    }
	}}
	