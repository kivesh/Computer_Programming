public class RemovePunctuation {
  public static String stripPunctuation(String s)
  {
  	StringBuffer newStr = new StringBuffer();
	for(int k=0;k<s.length();k++)
	{  char c = s.charAt(k);
	 	if(Character.isLetterOrDigit(c))
		{
		 newStr.append(c);
      }	
	}
   return newStr.toString();
  }
}
