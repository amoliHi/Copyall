package Utility;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Utility

{
	BufferedReader br;
	

	
	public String getFileName(String filename) throws IOException
	{
		try {
			    
			     br=new BufferedReader(new FileReader(filename));
			     String st="";
			     String line=br.readLine();
			     while(line!=null)
			       {
				     
				     st=st+line;
				      line=br.readLine();
			       }
			     
			     return st;   
		    } 
	
		catch(Exception e)
		{
			return null;
		}
		finally
		{
			   try{
				    br.close();
			      }
			catch(IOException ioe)
			   {
			   }	
		}
	}	
	
	
	
	public int inputInteger(){
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
				try {
				  int size = Integer.parseInt(br.readLine());
				} 
				catch (NumberFormatException e)
				{
				  e.printStackTrace();
				} 
				catch (IOException e) 
				{
					
					 e.printStackTrace();
				}
			
		return 0;
	}
	public int BinarySearchString(String[] names,String key)
	{
		int low=0;
		int high=names.length;
		while(low<high)
		{
			int mid=(low+high)/2;
			if(key.equalsIgnoreCase(names[mid]))
			{
				return mid;
			}
			else if(names[mid].compareToIgnoreCase(key)<0)
			{
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
		}
		
		return -1;
	}
	
}
	

		
		
		
