package Logical_Programs;
import java.util.Scanner;
public class TicTacToe 
{
	public static Scanner sc=new Scanner(System.in);
	public static int row,col;
	public static char[][] board=new char[3][3];
	public static char turn='X';
	
	public static void main(String[] args)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]='-';
			}
		}
		Play();
	}

	public static void PrintBoard()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				if(j==0)
				System.out.print(" | ");
				System.out.print(board[i][j]+" | ");
			}
		}
	}
	
	public static void Play()
	{
		boolean playing=true;
		row=sc.nextInt()-1;
		col=sc.nextInt()-1;
		board[row][col]=turn;
		if(turn=='X')
		   turn='O';
		else
		   turn='X';
		 
		
		
	}
}
