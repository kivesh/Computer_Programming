import java.util.Comparator;

public class CompareStudent implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		// TODO Auto-generated method stub
		if(stud1.age>stud2.age)
		{
			return -1;
		}
		else if(stud1.age<stud2.age)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
}
