package Task4controlStatementInJava;

import java.util.Scanner;

public class Questn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Whether the person is senior citizen or 
		System.out.println("CHECK WHETHER THE PERSON IS SENIOR CITIZEN OR NOT");
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter your age:");
			int age= obj.nextInt();
			if (age >= 60)
			{
				System.out.println("The person is a senior citizen");
			}
			else {System.out.println("The person is not a senior citizen");
}
		}

}
}