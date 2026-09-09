//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -l
//Class -
//Lab  -

import static java.lang.System.*; 

public class PascalsTriangle
{

	private int[][]mat;
	public PascalsTriangle()
	{
	}
	public PascalsTriangle(int size)
	{
		mat=new int[size][];
		for(int r=0;r<size;r++)
		{
			mat[r]=new int[r+1];
		}
	}
	public void createTriangle()
	{
	
		for(int r=0;r<mat.length;r++)
		{
			mat[r][0]=1;
			mat[r][r]=1;
			for(int c=1;c<r;c++)
			{
				mat[r][c]=mat[r-1][c-1]+mat[r-1][c];
			}
		}
	}
	public String toString()
	{
		String output="";
		for(int r=0;r<mat.length;r++)
		{
	
			for(int c=0;c<mat[r].length;c++)
			{
				output+=mat[r][c]+" ";
			}
			output+="\n";
		}
		return output;
	}
}
