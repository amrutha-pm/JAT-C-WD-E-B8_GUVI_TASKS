package task5;

import java.util.Scanner;

public class Ques5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Students Grade details");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Mark:");
		int mark = sc.nextInt();
		
		switch( mark)
		{
		case 1:
				if(mark==100) {
					System.out.println("Grade: + S");
					break;
				}
		case 2:
			if(mark>=90 && mark<=99) {
				System.out.println("Grade :  + A");
				break;
			}
		
		case 3:
			if(mark>=80 && mark<=89) {
				System.out.println("Grade :  + B");
				break;
			}

case 4:
	if(mark>=70 && mark<=79) {
		System.out.println("Grade : " + "C");
break;
}
	
case 5:
	if(mark>=60 && mark<=69) {
		System.out.println("Grade : " + "C");
		break;

}
default:
	break;
		}
		sc.close();}}