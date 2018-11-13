public class Student implements Comparable<Student> {

	
	protected int age;
	
	
	public Student(int age)
	{
		this.age = age;
	}
	@Override
	public int compareTo(Student studentTwo) {
		// TODO Auto-generated method stub
		if(age>studentTwo.age)
		{
			return 1;
		}
		else if(age<studentTwo.age)
		{
			return -1;
		}
		else
		{
    		return 0;
		}
	}

	public String toString()
	{
		return "Student Age: "	+ age;
	}
}
