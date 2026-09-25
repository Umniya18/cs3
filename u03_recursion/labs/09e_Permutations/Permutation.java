
//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class Permutation
{
	private String orig;
	private String list;

	public Permutation(String word)
	{
		orig=word;
		list="";
	}

   public void permutation()
   {
   	out.println("\nPERMUTATION OF WORD :: "+orig);
   	permutation(orig,"");
   }

	private void permutation(String orig, String sent)
	{

       if(sent.length() == orig.length())
    {
        out.println(sent);
    }
    else
    {
        for(int i = 0; i < orig.length(); i++)
        {
            String ch = orig.substring(i, i + 1);

            if(!sent.contains(ch))
            {
                permutation(orig, sent + ch);
            }
        }
     }











	}

   public String toString()
   {
   	return list;
   }
}

