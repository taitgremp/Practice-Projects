import java.util.*;

public class GameUtils {

	private String[] possibleWords = {"physics", "vegetable", "birds"};
	private char[] gameWord; 
	char[] workingWord;
	boolean solved = false;
	
	private void assignGameWord() {
		Random randomGenerator = new Random();
		int wordPosition = randomGenerator.nextInt(3); 
		gameWord = possibleWords[wordPosition].toCharArray();
	}
	
	public void setup() {
		assignGameWord();
		char[] wordTemplate = new char[gameWord.length];
		for(int x=0; x<gameWord.length; x++) {
			wordTemplate[x] = '_';
		}
		workingWord = wordTemplate;
	}
	
	public void displayWorkingWord() {
		for(int x=0; x<workingWord.length; x++) {
			System.out.printf("%c", workingWord[x] );
		}
		System.out.println("");

	}
	
	public boolean checkGuess(char guess) {
		boolean isFound = false;
		for(int i=0; i<gameWord.length; i++) {
			if(guess == gameWord[i]) {
				isFound = true;
				break;
			}
		}
		return isFound;
		
	}
	
	public void updateGame(char found) {
		for(int i=0; i<gameWord.length; i++) {
			if (gameWord[i] == found) {
				workingWord[i] = found;
			}
		}
		if(Arrays.equals(gameWord, workingWord)) {
			System.out.println("\nWord has been solved!");
			solved = true;
		}
	}
	
	
}
