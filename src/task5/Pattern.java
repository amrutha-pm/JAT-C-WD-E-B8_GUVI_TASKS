package task5;

public class Pattern {
 //print * pattern      *
	            //     *      *
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=2;i++) {
			for(int j=i;j<=2;j++) {  //for spacing
				
				System.out.print(" ");
			}
			//[print star
			for(int k=1;k<=(2*i-1);k++) {
				
			
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
