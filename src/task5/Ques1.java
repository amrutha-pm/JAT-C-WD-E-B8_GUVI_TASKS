package task5;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = "Anil" ;  //Create two string variables
		String reverseString = "";
		
		System.out.println( "Palindrom is nothing but right to left and left to right same letters");
		
		int stringLength = myString.length();                    //Calculate the length of the string
		System.out.println("Length of my string is :" +stringLength);
		
		for(int i =(stringLength-1);i>=0;--i) {    // 1st iteration i=9-1=8 ,i  8>=0  ie true  then statement will print
			                 // 0 <=  9                      // 1st iteration-------m prints
			                 // 1<=9                       //2 nd iteration i--  ,9-1=8  then i=8, 8>=0 true 
			                 // 2<=9
			                 // 3<=9
			                 // 4<=9
			                 // 5<=9
			                 // 6<9
			                 // 7<=9
			                 //8<=9
			                 //9<=9 
			                 //1//10<=9   false for loop exit and 
		//myString.charAt(9);
		//System.out.println("9th position :" + myString.charAt(8));
			
			reverseString =  reverseString + myString.charAt(i);   //print statement
		}
			if(myString.toLowerCase().equalsIgnoreCase(reverseString)) {
				System.out.println(myString  +" is a palindrom");
			}
			else {
				System.out.println(myString + "is not a palindrom");
			}
		}
		
	}


