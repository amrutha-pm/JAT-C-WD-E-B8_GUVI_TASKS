package task5;

public class Ques3 {
//Pattern program
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num = 1;                                        // initial number to start
        
                                                     // Loop through rows (4 rows in this case)
        for (int i = 1; i <= 4; i++) {
                                                     // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;                              // Increment number for the next print
            }
            System.out.println();                   // Move to the next line after each row
        }

	}

}
