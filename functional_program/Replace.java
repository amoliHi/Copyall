package functional_program;
import java.util.Scanner;


public class Replace {
	

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
				String str1, str2, str3, str4;
				//Utility u = new Utility();
				Scanner sc=new Scanner(System.in);

				// INPUT DATA
				System.out.print("Enter String: ");
				str1 = sc.nextLine();

				System.out.print("Enter name you want to replace: ");
				str2 = sc.nextLine();

				System.out.print("Enter name you want to replace with: ");
				str3 = sc.nextLine();

				// COMPUTATION
				str4 = str1.replace(str2, str3);

				// OUTPUT
				System.out.println("New String: " + str4);

	}
	

}
