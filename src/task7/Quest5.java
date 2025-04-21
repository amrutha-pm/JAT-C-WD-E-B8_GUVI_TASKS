package task7;

import java.util.ArrayList;
import java.util.List;

public class Quest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = new ArrayList<String>();
		
	myList.add("Apple");
	myList.add("orange");
    myList.add("grapes");
System.out.println("My list elements are :" +myList);
System.out.println("Size of Array list :"+ myList.size());
System.out.println();
System.out.println("Removing list elements ....:");
myList.clear();     // Remove all elements
System.out.println();
System.out.println("My List :" +myList);
System.out.println("Size of Array List: "+myList.size());
}
}