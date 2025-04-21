package task5;

import java.util.Scanner;

public class Quest2 {
  //Read user input and reverse the string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String reverseString ="";

		   try (Scanner sc = new Scanner(System.in)) {
			   System.out.println("Enter your String ");
			String name=  sc.next();
			   System.out.println("Value of the string is :" +name);
			   
			  int  stringLength = name.length();
			   System.out.println("Length of the given string is :"+stringLength);
			   
			   for(int i=stringLength-1;i>=0;--i) {
				    reverseString = reverseString + name.charAt(i);
			   
			   }
			   //if(name.toLowerCase().equals(reverseString.toLowerCase()));
		//}
		  System.out.println("Reversed String :"+ reverseString);
	}
}}
