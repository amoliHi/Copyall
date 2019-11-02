package Linked_List_Implentations;



public class Node
{
	
	Node head;   
	Node next;
	int data;
  
	 
	Node(int data)
	{
		this.data=data;
		this.next=null;
		
	}
	
	public int getData()
	{
		return data;
	}
	
	public String toString()
	{
		return data+"==>";
		
	}

	public Node getNext() 
	{
		return next;
	}

	public void setNext(Node next)
	{
		this.next = next;
	}

	public void setData(int data)
	{
		this.data = data;
	}
	
}


