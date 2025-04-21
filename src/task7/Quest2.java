package task7;

public class Quest2 {
//Find Array index outof bounds exception,String outof bounds exception
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodForArrayIndexException();
		methodForStringIndexException();
	}
	public static void methodForArrayIndexException()     //why it is changed to static ---doubt?????
	{
		
		int[] myArray = new int[5];  //Creation of Integer data type array
		myArray[0]=100;     //index 0 ,1st elemt        //Adding elements to array,
		myArray[1]=200;     //index 1 ,2 nd 
		myArray[2]=300;     //index 2 ,3 rd
		myArray[3]=400;     //index 3 ,4rth
		myArray[4]=500;     //index 4 ,5th    //index 5----6th      //index 6----7th element and so on
		System.out.println("Length of my Array is :"+ myArray.length);
		try
		{
				System.out.println("My element in 7th position is :" +myArray[6]);
				
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception found " + e);
		}
		
		}
	
	public static void methodForStringIndexException()   //try to access invalid index of a string
	{
		String myStr = "banana";
		
		

		try {
			System.out.println("Character at 10th index is  :"+myStr.charAt(10));
		}
catch(StringIndexOutOfBoundsException e) {
	System.out.println("exception found" + e);
	 e.printStackTrace(); 
}

}
}