package Linked_List_Implentations;



public class StackMain {

	public static void main(String[] args)
	
	{
	
		StackLinkedList slt=new StackLinkedList();
		
		slt.push(30);
		slt.push(40);
		slt.push(50);
		slt.push(60);
		slt.push(70);
		System.out.println(slt.toString());
        System.out.println(slt.isEmpty());
		
		System.out.println(slt.size());
		
		slt.pop();
		
		System.out.println(slt.toString());
        System.out.println(slt.isEmpty());
		
		System.out.println(slt.size());
		
	}

}
