import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLIstApp {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("Estelle");
		names.add("Marcus");
		names.add("Zoey");
		
		//Displaying Elements in a Reversed
		ListIterator<String> iter = names.listIterator(names.size());
		
        while(iter.hasPrevious())
        {
        	System.out.println(iter.previous());
        }
	}

}
