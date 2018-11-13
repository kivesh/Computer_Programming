public class ArrayListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Also has addAll, retainAll, removeAll
		//There is no difference whether you store the link in the  ArrayList or List Variable
		List<Integer> myArrayList = new ArrayList<Integer>();
		myArrayList.add(1);
		myArrayList.addAll(Arrays.asList(2,3,4,5,6));
		
		myArrayList.add(2, 1);
		System.out.println(myArrayList);
		
		ListIterator<Integer> iter = myArrayList.listIterator(myArrayList.size()-1);
		while(iter.hasPrevious())
		{
			System.out.print(iter.previous()+" ");
		}
	}

}
