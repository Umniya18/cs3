import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private boolean[][] visited;
   private int atCount;

	public AtCounter() {
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
      atCount = 0;
      visited = new boolean[10][10];
	}

	public void countAts(int r, int c) {

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
      if(r < 10 && r >= 0 && c < 10 && c >= 0) {
         if(atMat[r][c] == '@' && visited[r][c]==false) {
         visited[r][c] = true;
         atCount++;
         countAts(r+1,c);
         countAts(r-1,c);
         countAts(r,c-1);
         countAts(r,c+1);

         }
      }
      else {
         return;
      }
	


	}

	public String toString() {
		String output="";
		output+=atCount+" @s connected.";
		return output;
	}
}
