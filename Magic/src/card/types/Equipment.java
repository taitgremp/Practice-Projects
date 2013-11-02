package card.types;

import java.util.HashMap;

public class Equipment extends Artifact{
	
	private boolean isEquipped = false;
	
	public Equipment(HashMap<String, Integer> cost, String text){
		super(cost, text);
	}
	
	public Equipment(HashMap<String, Integer> cost, String text, boolean equipped){
		super(cost, text);
		this.isEquipped = equipped;
	}
	

}
