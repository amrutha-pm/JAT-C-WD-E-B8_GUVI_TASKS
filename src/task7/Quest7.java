package task7;

import java.util.ArrayList;
import java.util.List;

public class Quest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> myList = new ArrayList<String>();   //Creation of List 
myList.add("APPLE");
myList.add("ORANGE");
myList.add("GRAPES");

System.out.println("List Elements are :" +myList);
System.out.println();
String[] myStrArray = new String[myList.size()];    //Creating string array with same size as List

myList.toArray(myStrArray);

for(String element : myStrArray) {

System.out.println(element);
System.out.println();
}
	}

}
