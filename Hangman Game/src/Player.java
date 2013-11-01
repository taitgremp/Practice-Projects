import java.util.Random;


public class Player {
	
	private char[] lettersGuessed = new char[26];
	public int numGuesses=0;
	
	public char guessALetter() {
		Random r = new Random();
		boolean isNew = false;
		char c= 'a';
		while(isNew == false) {
			isNew = true; 
			c = (char)(r.nextInt(26) + 'a');
			for (int i = 0; i<26; i++) {
				if (c == lettersGuessed[i]) {
					isNew = false;
				}
			}
		}
		lettersGuessed[numGuesses] = c;
		numGuesses++;
		return c;
		
	}
}
