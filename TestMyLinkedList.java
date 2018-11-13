import java.util.Iterator;

public class TestMyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyLinkedList<String> letter = new MyLinkedList<String>();
        letter.add("B");
        letter.add("C");
        System.out.println(letter);
        
        letter.addFirst("A");
        System.out.println(letter);
        
        letter.addLast("D");
        System.out.println(letter);
        
        letter.remove(2);
        System.out.println(letter);
        
        letter.add(2, "C");
        System.out.println(letter);
        
        System.out.println(letter.size());
        
        
        Iterator<String> iter = letter.iterator();
        
        while(iter.hasNext())
        {
       
        	System.out.print(iter.next());
        }
        System.out.println();
        System.out.println(letter.removeFirst());
        System.out.println(letter);
        
       System.out.println( letter.removeLast());
        System.out.println(letter);
        
        System.out.println("index 0 "+ letter.get(0)+" index 1 "+ letter.get(1));
        letter.add(1,"D");
        System.out.println(letter);
        System.out.println("First element "+letter.getFirst()+ " Last Element "+letter.getLast());
        
        System.out.println(letter.contains("E"));
	}

}
