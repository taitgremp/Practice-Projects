package card.types;

import exceptions.CardAlreadyTappedException;
import exceptions.CardNotTappedException;

public abstract class Mana extends BaseCard{
	
	private final String type;
	private boolean isTapped = false;
	
	public Mana(String type){
		super(null, type); //Mana costs nothing to bring in 
		this.type = type; 
	}
	
	public void addToManaPool() throws CardAlreadyTappedException{
		if(!isTapped){
			isTapped = true; 
		}else{
			throw new CardAlreadyTappedException("Mana already tapped"); 
		}
	}
	
	public void unTap() throws CardNotTappedException{
		if(isTapped){
			isTapped = false;
		}else{
			throw new CardNotTappedException("Mana is not tapped");
		}
	}
	
	public String getType(){
		return type; 
	}

}
