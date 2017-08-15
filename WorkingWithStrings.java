import java.util.Scanner;
public class WorkingWithStrings
{
	public static void main(String[] args)
	{
	  String sentence = "I walked my dog.";
	  int length= sentence.length();
	  System.out.println(length);
	  
	  String hannah = "Did hannah see bees? Yes she did?";
	  int hannahLen = hannah.length();
	  char pos12 = hannah.charAt(12);
	  int index = hannah.indexOf("b");
	  
	  String sent3 = "Was it a car or cat that I saw?";
	  int lenSubs = (sent3.substring(9,12)).length();
	  
	  Scanner kb = new Scanner(System.in);
	  System.out.println("Please enter your name?");
	  String name = kb.nextLine();
	  
	  int posSpace = name.indexOf(" ");
	  String initials = name.charAt(0) + "" + name.charAt(posSpace+1);
	  initials = initials.toUpperCase();
	  System.out.println(" Your initials are "+ initials);
	}
}
