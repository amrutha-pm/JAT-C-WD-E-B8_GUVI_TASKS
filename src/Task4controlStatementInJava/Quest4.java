package Task4controlStatementInJava;

import java.util.Scanner;  //import scanner class for getting input from user

public class Quest4 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		//Swap 2 number
				//int a;
				//int b;
		Scanner obj = new Scanner(System.in)) {
			System.out.println("Before swapping");
System.out.println("Value of a is:" );
int a= obj.nextInt();
   
			System.out.println("Value of b is:");
			int b=obj.nextInt();
			
   int temp = 0;
			 //(assigning value of a ---->To temp---->  assigning value of b to a ----->a=b---->)      
  temp=a;          //then assiging temp value a to b------>b=temp
  a=b;
  b=temp;
  
  
			System.out.println("After Swapping");
   System.out.println("Value of a:"+a);
   System.out.println("Value of b:"+b);
		}
	}

}
