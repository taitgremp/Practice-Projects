package card.types;

import java.util.HashMap;

public abstract class BaseCard {

	private final HashMap<String, Integer> manaCost;
	private final String cardText; 
	
	public BaseCard(HashMap<String, Integer> costMap, String text) {
		this.manaCost = costMap;
		this.cardText = text;
	}
	
	public HashMap<String, Integer> getManaCost() {
		return this.manaCost; 
	}
	
	public String getCardText() {
		return this.cardText;
	}
}
