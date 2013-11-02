package card.types;

import game.elements.ManaCost;

public class Equipment extends Artifact{
	
	private boolean isEquipped = false;
	
	public Equipment(ManaCost cost, String text){
		super(cost, text);
	}
	
	public Equipment(ManaCost cost, String text, boolean equipped){
		super(cost, text);
		this.isEquipped = equipped;
	}
	

}
