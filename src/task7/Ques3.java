package task7;

import java.util.Scanner;

public class Ques3 extends Exception{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Invalid age exception program
	public Ques3(String exMessage)
	{
		super(exMessage);
	}
	
	public static void methodForException()
	{
		System.out.println("Custom exception Handling");
		System.out.println();
		
	try (Scanner sc = new Scanner(System.in))
 {
		System.out.println("Enter the age :");
		int age = sc.nextInt();
		
		if(age>=18) 
		{
			System.out.println("Valid Age Group");
		}
		else
		{
			throw new Ques3("Invalid Age !!!,Age must be 18 or above ");
			
		}
	}
	catch(Ques3 e) {
		System.out.println(e);
				 e.printStackTrace();
				 e.getClass();
				 e.getMessage();
			
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodForException();
       

		
	}

}
