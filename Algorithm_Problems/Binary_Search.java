package Algorithm_Problems;
import java.util.Scanner;

import Utility.Utility;

import java.io.*;
public class Binary_Search 
{
	static String Words[];
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		Utility util=new Utility();
		String line;
		String filename="C:\\Users\\BridgeLabs\\Desktop\\Fev.txt";
		line=util.getFileName(filename);
		
		System.out.println("Data in file as: " + line.toString());
		if(line!=null)
		{
			Words=line.split(" ");
		}
		System.out.println(Words.length);
		for(int i=0;i<Words.length;i++)
		{
			System.out.println(Words.length);
			System.out.println(Words[i]);
		}
		System.out.println("Enter the word for search");
		String element= sc.next();
		int find=util.BinarySearchString(Words, element);
		if(find!=-1)
		{
			System.out.println(element +"found at " +find +"Position");
		}
		else
		{
			System.out.println(element +" not Found");
		}
	}
	

}
