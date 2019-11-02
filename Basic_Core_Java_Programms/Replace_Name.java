
/* -----User Input and Replace String Template “Hello <<UserName>>, How are you?” ------- */

package Basic_Core_Java_Programms;
import java.util.Scanner;

public class Replace_Name

{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Use Name");
		String uname=sc.nextLine();
		String str="Hello <<userName>> how are you??";
		String str1="<<userName>>"; 
		System.out.println("******Entered String is*****");
		System.out.println();
		System.out.println(str+" ");
		System.out.println();
		System.out.println("*****After Replacing String*******");
		System.out.println();
		String str2=str.replaceAll(str1,uname); //String replace function
				
		System.out.println(str2);
		
	}

}
