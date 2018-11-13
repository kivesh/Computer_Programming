import java.util.TreeSet;

public class UsingComparatorAndComparable {

	public static void main(String[] args)
	{
		System.out.println("Using comparable");
		TreeSet<Student> studentSet1 = new TreeSet<Student>();
		studentSet1.add(new Student(15));
		studentSet1.add(new Student(16));
		studentSet1.add(new Student(17));
		studentSet1.add(new Student(18));
		
		for(Student student: studentSet1)
		{
			System.out.println(student);
		}
		
		
		
		System.out.println("\n\n\nUsing comparator");
		TreeSet<Student> studentSet2 = new TreeSet<Student>(new CompareStudent());
		studentSet2.add(new Student(15));
		studentSet2.add(new Student(16));
		studentSet2.add(new Student(17));
		studentSet2.add(new Student(18));
		
		for(Student student: studentSet2)
		{
			System.out.println(student);
		}
	}
}
