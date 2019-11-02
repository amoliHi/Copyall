package Linked_List_Implentations;
import java.util.EmptyStackException;
import java.util.Scanner;

public class StackLinkedList 
{
	
	int length;
	Node head;
	
	public StackLinkedList()
	{
		
		int length=0;
		head=null;
		
	}
	
	public void push(int data)
	{
		Node ns=new Node(data);
		ns.setNext(head);
		head=ns;
		length++;
		
	}
	
	public boolean isEmpty()
	{
		return (length==0);
		
	}
	public int pop()throws EmptyStackException
	{
		if(isEmpty()) 
		{
			throw new EmptyStackException();
		}
	int res=head.getData();
	head=head.getNext();
	length--;
	return res;
	}
	
	
	public int size()
	{
		return length;
	}

	public String toString()
	{
		String str=" ";
		Node ns=head;
		while(ns!=null)
		{
			str=str+ns.toString()+"==>";
			ns=ns.getNext();
		}
		return str;
		
	}
	
	
}
