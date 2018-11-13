import java.util.HashMap;
public class HashMapApp {

	public static void main(String[] args) {
		
		//What is the difference between hashMap and the others 
			
		HashMap<String,Integer> marks = new HashMap<String,Integer>();
		marks.put("217001412", 99);
		marks.put("218001412", 75);
		marks.put("219001412", 82);
		
	    Set<Map.Entry<String,Integer>> entrySet = marks.entrySet();
	    
	    for(Map.Entry<String, Integer> entry: entrySet)
	    {
	    	System.out.println(entry.getKey()+ "\t"+ entry.getValue());
	    }
		
	}

}
