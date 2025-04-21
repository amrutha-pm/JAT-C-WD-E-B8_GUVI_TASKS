package Task4controlStatementInJava;

import java.util.Scanner;

public class Questn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Number::");
	int Number=sc.nextInt();
	
	sc.close();
	int count=0;
	 while(Number >0)
	 {
		 Number/=10;
		 count++;
	 }
	 System.out.println("Number of digits is :: "+ count);
}
	}

