package exceptions;

public class CardAlreadyTappedException extends Exception{
	
	private static final long serialVersionUID = 1111;

	public CardAlreadyTappedException(String message){
		super(message);
	}

}
