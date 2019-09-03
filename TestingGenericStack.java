public class TestingGenericStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		GenericStack<String> myStack = new GenericStack<String>();
		
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");
		
		System.out.println(myStack);
		
		while(!myStack.isEmpty())
		{
			System.out.println(myStack.pop());
		}
	}

}
