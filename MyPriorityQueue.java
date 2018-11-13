public class MyPriorityQueue<E extends Comparable<E>> {

	MyHeap<E> heap;
	
	public MyPriorityQueue()
	{
		 heap  = new MyHeap<E>();
	}
	
	public MyPriorityQueue(E[] objects)
	{
		 heap = new MyHeap<E>(objects);
	}
	
	public void enqueue(E e)
	{
		heap.add(e);
	}
	
	
	public E dequeue()
	{
		return heap.remove();
	}
	
	public int getSize()
	{
		return heap.getSize();
	}
	
	
}
