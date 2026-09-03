//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one
   // looping through the array with a for loop then printing out the array then after that if else and doing a count varible 
   // aftering doing so count how many letters and characters there are 

	public Word()
	{
     
	}

	public Word(String wrd)
	{
     
       setWord(wrd);


	}

	public void setWord(String wrd)
	{
        word=wrd;
        
	}
	
	public int getNumVowels()
	{
		int count=0;
      System.out.println(word);
      for(int i= 0; i<word.length();i++)
      String k= word.substring(i,1+i)
         for(int c=0; c<vowel.length;c++)
         String v=word.sub
            count++;


		return count;
	}
	
	public int getLength()
	{
      int much=0;
      for(int i=0; i<word.length();i++)
         much++;
		return much;
	}

	public String toString()
	{
	   return "num vowels == " + getNumVowels()+" " + " num chars == " + getLength();
	}
}
