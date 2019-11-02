package Linked_List_Implentations;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedList_Exp {
	
	LinkedList<String> list=new LinkedList<String>();
	Scanner sc=new Scanner(System.in);
	
	void addValue()
	{
		
	System.out.println("Enter how many nodes you want to create");
	int n=sc.nextInt();
	System.out.println("Add items");
	for(int i=0;i<=n;i++)
	{
		list.add(sc.next());
	}

}
	
	void DisplayValue()
	{
		System.out.println("The linked list is");
		for(int i=0;i<list.size();i++)
        {
			
			System.out.println(list.get(i));
	
        }
		
	}
	
		
		public static void main(String args[]) {
			
			LinkedList_Exp obj = new LinkedList_Exp();
			
			obj.addValue();
			obj.DisplayValue();
		}
	}
	

