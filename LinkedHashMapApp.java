import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {

	public static void main(String[] args) {
		
		// access order is true => PUTS THE LAST ITEM ACCESSED TO THE END OF THE MAP

		LinkedHashMap<Integer,String> students = new LinkedHashMap<Integer,String>(16,0.75f,true);
		students.put(1,"Peter");
		students.put(2,"Ned");
		students.put(3,"Stephen");
		students.put(4,"Wong");
		
		System.out.println("The student with ID number two is: " + students.get(2));
		
		Set<Map.Entry<Integer, String>> entrySet = students.entrySet();
		
		for(Map.Entry<Integer, String> entry : entrySet)
		{
			System.out.println(entry.getKey()+ "\t"+ entry.getValue());
		}
	}

}
