//Â© A+ Computer Science
// www.apluscompsci.com

//Matrix output example 3

import static java.lang.System.*;

public class MatrixOutThree
{
	public static void main(String args[])
	{
		int[][] mat = {{5,6,8,9},
							{2,3,5,0},
							{4,5,9,3}};
                     
                     
      int x=0; 
      
      for(int i=0; i<mat.length;i++)
      {
         String k=" ";
          for(int d=0; d<mat[i].length;d++)
           {
              k+= mat[i][d]+" ";
              
            }
          System.out.println("row " + x+k);
          x++;
          }
		//add in a nested loop to print out mat
		//loop for row
			//loop for col
				//print stuff		
		
		
		
		//expected output
		/*
			row 0   5  6  8  9
			row 1   2  3  5  0
			row 2   4  5  9  3
		*/
	}
}


