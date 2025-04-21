package task7;

import java.util.Scanner;

public class Quest1 {
	int a;
	int b;
	int c;
  //Reads user input from two integers and perform division.throw an exception dividing 2nd number by 0.
	
	public Quest1()   //Default constructor
	{
		System.out.println("Method for Default constructor");
		System.out.println();
		try (Scanner obj = new Scanner(System.in))
		{
			System.out.println("Division of two numbers :Exception Handling");
			System.out.println("Enter the vallue of a :" );
			int a=obj.nextInt();
			
			System.out.println("Enter the vallue of b :" );
			int b=obj.nextInt();

			c= a/b;
			   System.out.println("a/b is =" + c);
		}
		catch(ArithmeticException e) {
			System.out.println("exception found "+ e);
			
		}
		System.out.println();
	}

	public Quest1(int a,int b)   //Parameterized constructor
	{	
	System.out.println("Method for Parameterized constructor");
	System.out.println();
try {
	System.out.println("Enter the vallue of a :" + a);
	System.out.println("Enter the vallue of b :"+ 0 );
	c = a/0;
	}
catch (Exception e){
	System.out.println("a/0 is = "+ c);

	System.out.println("Exception found while dividing : "  + e);
}
	
	}
	public static void main(String[] args) {
		new Quest1();
		new Quest1(88,0);
		
	}

}
