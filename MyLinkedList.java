import java.util.Iterator;

public class MyLinkedList<E>  extends MyAbstractList<E>{
private  MyNode<E> head, tail;
	
	public MyLinkedList()
	{
		
	}
	
	
	public MyLinkedList(E[] objects)
	{
		super(objects);
	}
	
	public void addFirst(E e)
	{
		MyNode<E> newHead = new MyNode<E>(e, null);
		newHead.next = head;
		head = newHead;
		
		if(tail == null)
		{
			tail = head;
		}
		size++;
	}
	
	public void addLast(E e)
	{
		if(tail == null)
		{
			tail = new MyNode<E>(e, null);
			head = tail;
		}
		else
		{
			MyNode<E> newTail =  new MyNode<E>(e, null);
			tail.next = newTail;
			tail = newTail;
		}
		size++;
	}
	@Override
	public void add(int index, E e) {
		// TODO Auto-generated method stub
		checkIndex(index);
		if(index == 0)
		{
			addFirst(e);
		}
		else if (index>=(size))
		{
			addLast(e);
		}
		else
		{
			MyNode<E> current = head;
			for(int i=1;i<index;i++)
			{
				current = current.next;
			}
			
			MyNode<E> temp = current.next; //At index
			current.next = new MyNode<E>(e, null);
			(current.next).next = temp;            //Bumped temp by 1 position
			size++;
		}
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		size =0;
		tail = null;
		head = null;
		
	}

	@Override
	public boolean contains(E e) {
		 MyNode<E> current = head;
		 while(current != null)
		 {
			 if(e.equals(current.element))
			 {
				 return true;
			 }
			 
			 current = current.next;
		 }
		return false;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		checkIndex(index);
		MyNode<E> current = head;
		for(int i=1;i<=index;i++)
		{
			current  = current.next;
		}
		return current.element;
	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		int index = -1;
		MyNode<E> current = head;
		int position = 1;
		while(current!=null)
		{
			if(e.equals(current.element))
			{
				return position;
			}
			position ++;
			current = current.next;
		}
		return index;
	}

	@Override
	public int lastIndexOf(E e) {
		// TODO Auto-generated method stub
		int index = -1;
		MyNode<E> current = head;
		int position = 1;
		while(current!=null)
		{
			if(e.equals(current.element))
			{
				index =  position;
			}
			position ++;
			current = current.next;
		}
		return index;
	}
     
	public E removeFirst()
	{
		if(head == null)
		{
			return null;
		}
		else
		{
			MyNode<E> temp = head;
			 head = head.next;
			
			 size--;
			 
			 if(head==null)//Cater for no more nodes
			 {
				 tail = null;
			 }
			 return temp.element;
			
		}
	}
	
	public E removeLast() //3 cases
	{
	   if(size==0)
	   {
		   return null;
	   }
	   else if(size==1)
	   {
		   MyNode<E> temp = head;
		   head = tail = null;
		   size--;
		   return temp.element;
	   }
	   else
	   {
		   MyNode<E> current = head;
		   for(int i=1;i<size-1;i++)//Check for size - 1
		   {
			   current = current.next;
		   }
		   MyNode<E> temp = current.next;//The tail 
		   current.next = null;
		   tail = current;
		   
		   if(tail == null)
		   {
			   head= null;
		   }
		   size--;
		   return temp.element;
	   }
	}
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		checkIndex(index);
		if(index==0)
		{
			return  removeFirst();
		}
		else if(index==(size-1))
		{
			return removeLast();
		}
		else
		{
			MyNode<E> current = head;
			for(int i=1;i<index;i++)
			{
				current = current.next;
			}
			MyNode<E> temp = current.next; //At postion
			current.next = temp.next;
			
			size--;
			return temp.element;
		} 
	}

	@Override
	public E set(int index, E e) {
		// TODO Auto-generated method stub
		checkIndex(index);
		MyNode<E> current = head;
		for(int i=1;i<index;i++)
		{
			current = current.next;
		}
		MyNode<E> temp = current.next;
		MyNode<E> newNode = new MyNode<E>(e, null);
		current.next = newNode;
		newNode.next = temp.next;
		
		return null;
	}
    
	public E getFirst()
	{
		if(size==0)
		{
			return null;
		}
		else
		{
			return head.element;
		}
	}
	
	public E getLast()
	{
		if(size == 0)
		{
			return null;
		}
		else
		{
			return tail.element;
		}
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
	
		return new MyIterator<E>();
	}
       
	private	class MyIterator<E> implements java.util.Iterator<E>
	{
       private MyLinkedList<E>.MyNode<E> Current =   (MyLinkedList<E>.MyNode<E>) head;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(Current!=null)
			{
				return true;
			}
			return false;
		}

		@Override
		public E next() {
			 MyLinkedList<E>.MyNode<E> Temp=  Current;
			 Current = Current.next;
			return Temp.element;
		}
		
	}
	
	 private class MyNode<E>
	 {
	 	E element;
	 	MyNode<E> next;
	 	
	 	public MyNode(E e, MyNode<E> nxt)
	 	{
	 		this.element = e;
	 		this.next = nxt;
	 	}
	 }
	 
	 public void checkIndex(int index)
	 {
		 if(index<0||(index>size&&size!=0))
		 {
			 throw new IndexOutOfBoundsException
		        ("Index: " + index + ", Size: " + size);
		 }
	 }
	 
	 public String toString()
	 {
		 StringBuilder result = new StringBuilder("[");
		 MyNode<E> current = head;
		 for(int i=0;i<size;i++)
		 {
			 result.append(current.element);
			 if(i<(size-1))
			 {
				 result.append(",");
			 }
			 current = current.next;
		 }
		   result.append("]");
		 return result.toString();
	 }
}

