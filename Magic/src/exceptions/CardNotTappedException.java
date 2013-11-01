package exceptions;

public class CardNotTappedException extends Exception{
	
	private static final long serialVersionUID = 1112;

	public CardNotTappedException(String message){
		super(message);
	}

}