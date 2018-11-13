import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {
		
		// peek(),pop(),push()
		
		Stack<String> sampleStack = new Stack<String>();
		sampleStack.push("kivesh");
		sampleStack.push("bruce");
		sampleStack.push("rocket");
		
	  System.out.println("The index of bruce is: " + sampleStack.search("bruce"));
	  System.out.println("The person on the top is "+ sampleStack.peek());
		
   
	}

}
