import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueApp {

	public static void main(String[] args) {
		
		//peek() - poll()/remove() is the same functionality?
		
		//Using comparable
		PriorityQueue<String> countries = new PriorityQueue<String>();
        countries.offer("Egypt");
        countries.offer("Tunisia");
        countries.offer("Ghana");
        countries.offer("Iran");
        
        while(!countries.isEmpty())
        {
        	System.out.print(countries.poll() + " ");
        }
        
        //Using a comparator
        System.out.println("\nIn reverse order:\n");
        
        PriorityQueue<String> countries1 = new PriorityQueue<String>( Collections.reverseOrder());
        countries1.offer("Egypt");
        countries1.offer("Tunisia");
        countries1.offer("Ghana");
        countries1.offer("Iran");
        
        while(!countries1.isEmpty())
        {
        	System.out.print(countries1.poll() + " ");
        }
        
	}

}
