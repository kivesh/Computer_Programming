import java.util.Arrays;
import java.util.Vector;

public class VectorApp {

	public static void main(String[] args) {
		
		Vector<Character> myVector = new  Vector<Character>();
		myVector.add('a');
		myVector.add('b');
		myVector.addAll(Arrays.asList('a', 'b', 'c', 'd'));
		
	    System.out.println(myVector);
	    
	   //Check the methods to use a vector

	}

}
