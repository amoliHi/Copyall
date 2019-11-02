/* Write static functions to return all permutations of a String using iterative method and
 
 Recursion method. Check if the arrays returned by two string functions are equal. 
 
 */


package Algorithm_Problems;
import java.util.Scanner;
public class String_Permutation 
{
	
	
  public static void main(String[] args)
  {
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String str=sc.nextLine();
	  int n=str.length();
	  Permute(str,0, n-1);
	  
  }
	
 public static void Permute(String str,int fisrtIndex,int lastIndex)
 {
	 if(fisrtIndex==lastIndex)
	 {
		 System.out.println(str);
	 }
	 else
	 for(int i=fisrtIndex;i<=lastIndex;i++)
	 {
		 str=swap(str,fisrtIndex,i);
		 Permute(str, fisrtIndex+1, lastIndex);
		 str=swap(str, fisrtIndex, i);
	 }
	 
 }

public  static String swap(String str, int i, int j) 
{
	char temp;
	 char[] c=str.toCharArray();
	 temp=c[i];
	 c[i]=c[j];
	 c[j]=temp;
	 return String.valueOf(c);
	
	
}
}
