import java.util.Arrays;
import java.util.HashSet;

public class HashSetApp {

	public static void main(String[] args) {
		
		
		//Stands a chance of getting garbled
		
		//Performing set operations
		
		HashSet<String> set1 = new HashSet<String>();
		set1.addAll(Arrays.asList("Kivesh", "Sam","Steve"));
		System.out.println("Set A: "+ set1);
		
		HashSet<String> set2 = new HashSet<String>();
		set2.addAll(Arrays.asList("Kivesh", "Tony","Natasha"));
		System.out.println("Set B: "+ set2);
		
		HashSet<String> temp = new HashSet<String>();
        temp.addAll(set1);
        temp.addAll(set2);
        System.out.println("The union is AuB is: "+temp);
        
        temp.clear();
        temp.addAll(set1);
        temp.removeAll(set2);
        System.out.println("The disjunction A-B is : " +temp);
		
		
        temp.clear();
        temp.addAll(set1);
        temp.retainAll(set2);
        System.out.println("The intersection AnB is: " + temp);
	}

}
