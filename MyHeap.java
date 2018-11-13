import java.util.ArrayList;

public class MyHeap<E extends Comparable<E>> {

	
	private ArrayList<E> data = new ArrayList<E>();
	
	public MyHeap()
	{
		
	}
	
	public MyHeap( E[] e)
	{
	    for(int pos=0;pos<e.length;pos++)
	    {
	    	data.add(e[pos]);
	    }
	}
	
	public void add(E e)
	{
		data.add(e);
		int currentIndex = getSize()-1;
		
		while(currentIndex>0)
		{
			int parentIndex = (currentIndex-1)/2;
		
			if(( data.get(currentIndex)).compareTo(data.get(parentIndex))>0)
			{
				E temp = data.get(parentIndex);
				data.set(parentIndex, data.get(currentIndex));
				data.set(currentIndex, temp);
			}
			else
			{
				break;
			}
			
			currentIndex = parentIndex;
		}
		
            //compareTo method will only work if  <E extends Comparable<E>>
		
	}
	
	
	public E remove()
	{
		/* if heap is empty return null
		 * 
		 * Get the root , then set the last element to be the root, then remove the last element
		 * 
		 * Then starting with the root using it has the first index, cycle till the index>=size
		 * 
		 *     Find its left/right child
		 * 
		 *     If the left child index is greater than the size of the heap, then it is already a heap!!!
		 *    
		 *     Check if the rightChildIndex is valid and then Find the maximum between them
		 *     
		 *     Compare the root and the maximum found above, IF root is less swap & set the currentIndex to maxIndex
		 *                                                   ELSE break IT IS A HEAP!!!
		 *  
		 * return the original root    
		 *     
		 */
		
		if(data.size()==0)
		{
			return null;
		}
		else
		{
			E removeObject = data.get(0);
			data.set(0, data.get(data.size()-1));
			data.remove(data.size()-1);
			
			int currentIndex = 0;
			while(currentIndex < data.size())
			{
				int leftChildIndex = 2*currentIndex+1;
				int rightChildIndex = 2*currentIndex+2;
				
				if(leftChildIndex>=data.size())
				{
					break;
				}
				
				int maxIndex = leftChildIndex;
				
				if(rightChildIndex<data.size())
				{
				   if((data.get(leftChildIndex)).compareTo(data.get(rightChildIndex))<0)// left child is less than right
				  {
					   maxIndex = rightChildIndex;
				  }
				}
				
				
				if((data.get(currentIndex)).compareTo(data.get(maxIndex))<0)
				{
					E temp = data.get(currentIndex);
					data.set(currentIndex, data.get(maxIndex));
					data.set(maxIndex, temp);
					currentIndex = maxIndex;
				}
				else
				{
					break;
				}
				
			}
			
			return removeObject;
			
		}
	}
	
	public int getSize()
	{
		return data.size();
	}
}
