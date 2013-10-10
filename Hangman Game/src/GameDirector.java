
public class GameDirector {
	
	
	public void startGame() {
		GameUtils gameHelper = new GameUtils();
		gameHelper.setup();
		
		Player player1 = new Player();
		
		while(gameHelper.solved == false) {
			displayProgress(gameHelper);
			takeTurn(player1, gameHelper);
		}
		gameHelper.displayWorkingWord();
		System.out.printf("It took the player %d guesses", player1.numGuesses); 

	}
	
	public void displayProgress(GameUtils gameHelper) {
		System.out.println("\nThe Word To Guess is: ");
		gameHelper.displayWorkingWord();
	}
	
	public void displayGuessResult(char guess, boolean result) {
		System.out.printf("\nPlayer guessed the letter %c \n", guess);
		if(result==true){
			System.out.printf("%c is in the word!\n", guess);
		}else {
			System.out.printf("Sorry, %c is not in the word. \n", guess);
		}
	}
	
	public void takeTurn(Player p, GameUtils h) {
		char currentGuess = p.guessALetter();
		boolean guessResult = h.checkGuess(currentGuess);
		displayGuessResult(currentGuess, guessResult);
		if(guessResult == true) {
			h.updateGame(currentGuess);
		}
	}
	
	

}
