package task7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Quest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   TreeMap<Integer,String> myMap = new TreeMap<>();
   myMap.put(1, "Amrutha");
   myMap.put(2, "sarutha");
   myMap.put(3, "smrutha");
   myMap.put(4, "Amutha");
   System.out.println("Employee details: " +myMap);
   
// Extract the employee names (values) from the TreeMap and sort them
   Collection<String> employeeNames = myMap.values();  // Get all employee names
   List<String> sortedNames = new ArrayList<>(employeeNames);  // Convert to list
   Collections.sort(sortedNames, String.CASE_INSENSITIVE_ORDER);  // Sort the names in alphabetical order (case-insensitive)

   // Print the sorted employee names
   System.out.println("\nEmployee names in alphabetical order:");
   for (String name : sortedNames) {
       System.out.println(name);
   }
}

   
	}
