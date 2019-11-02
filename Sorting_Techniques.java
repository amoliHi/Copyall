import java.util.Scanner;

import Utility.Utility;
public class Sorting_Techniques 
{

public int BinarySearchString(String[] names,String key)
{
	int low=0;
	int high=names.length;
	while(low<high)
	{
		int mid=(low+high)/2;
		if(key.compareTo(names[mid]) < 0)
		{
			
			high=mid;
			
		}
		else if(key.compareTo(names[mid]) > 0)
		{
			low=mid+1;
			
		}
		else
		{
			return mid;
		}
		
	}
	
	return -1;
}
	
}
