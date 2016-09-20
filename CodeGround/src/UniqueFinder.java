
public class UniqueFinder 
{
  boolean[] asciiarr = new boolean[128];
  
  public boolean uniqueOrNot(String st)
  {
	 if(st.length() > asciiarr.length)
	 {
		 return false;
	 }
	 for(char ch : st.toCharArray())
	 {
		 if(asciiarr[ch] == true)
		 {
			 return false;
		 }
		 asciiarr[ch]=true;
	 }
	 return true;
  }
}
