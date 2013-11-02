package card.types;

import game.elements.ManaCost;

public abstract class BaseCard {

	private final ManaCost manaCost;
	private final String cardText; 
	
	public BaseCard(ManaCost costMap, String text) {
		this.manaCost = costMap;
		this.cardText = text;
	}
	
	public ManaCost getManaCost() {
		return this.manaCost; 
	}
	
	public String getCardText() {
		return this.cardText;
	}
}
