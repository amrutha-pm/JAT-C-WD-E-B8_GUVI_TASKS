package Task4controlStatementInJava;

public class Quest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Factorial of a given number
		
		int num=3;
		int i=1;
		long factorial=1;
		while(i<=num) {
			factorial*=i;
			i++;
			
		}
		System.out.printf("Factorial of %d = %d" ,num,factorial);
		}
		
	}

