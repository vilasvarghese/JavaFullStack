import java.util.*; 
public class HashSetSimpleOperationsExample1{ 
    public static void main(String[] args) 
    { 
        // Set demonstration using HashSet 
        Set<String> hashSet = new HashSet<String>(); 
  
        hashSet.add("Vilas"); 
        hashSet.add("Ullas"); 
        hashSet.add("Bangalore"); 
        hashSet.add("Cochin"); 
        hashSet.add("Hyderabad"); 
		hashSet.add("Bangalore"); 
  
        System.out.println(hashSet); 
		//HashSet is not an ordered Set. There is no guarantee that order of insertion is how it will get  printed. However if you repeat the execution, it will be consistent in the order of printing.
		
		
		//Check if a value is present
		
        // Check if Bangalore exists in 
        System.out.println("Contains " + hashSet.contains("Bangalore")); 
		
		//Remove element Bangalore

        hashSet.remove("Cochin"); 
  
        System.out.println("After removing element " + hashSet);
		
		 // Iterating though the Set 
        for (String value : hashSet) 
            System.out.print(value + ", "); 
		System.out.println();
    } 
} 