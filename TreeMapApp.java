import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class TreeMapApp {

	public static void main(String[] args) {
		
		
		//Orders the entries according to the key
		
		TreeMap<String,Integer> numberOfVowels = new TreeMap<String,Integer>();
		numberOfVowels.put("remember", 3);
		numberOfVowels.put("intermediate", 6);
		numberOfVowels.put("work", 1);
		numberOfVowels.put("satisfactory", 4);
		
		Set<Map.Entry<String, Integer>> entrySet = numberOfVowels.entrySet();
		
		for(Map.Entry<String, Integer> entry: entrySet)
		{
			System.out.println(entry.getKey()+"\t"+ entry.getValue());
		}

	}

}
