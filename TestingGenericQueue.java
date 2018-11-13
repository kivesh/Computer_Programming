public class TestingGenericQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		GenericQueue<String> myQueue = new GenericQueue<String>();
		
		myQueue.enqueue("A");
		myQueue.enqueue("B");
		myQueue.enqueue("C");
		
		System.out.println(myQueue);
		
		while(!myQueue.isEmpty())
		{
			System.out.println(myQueue.dequeue());
		}
	}

}
