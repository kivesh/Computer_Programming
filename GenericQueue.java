import java.util.LinkedList;

public class GenericQueue<E> {

  LinkedList<E>  data = new LinkedList<E>();
  
	
  public void enqueue(E e)
  {
	  data.addLast(e);
  }
  
  public E dequeue()
  {
	  return data.removeFirst();
  }
  
  
  public boolean isEmpty()
  {
	  return data.size()==0;
  }
  
  public String toString()
  {
	  return data.toString();
  }
}
