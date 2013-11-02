package game.elements;

import java.util.HashMap;

import card.types.BaseCard;
import card.types.Mana;

public class ManaPool {
	
	private HashMap<String, Integer> manaInPool = new HashMap<String, Integer>();
	
	public ManaPool(){
		this.clear();
	}
	
	public void addToManaPool(Mana mana){
		if(mana.getType() == "Swamp"){
			Integer numSwamps = manaInPool.get("Swamp")+1;
			manaInPool.put("Swamp", numSwamps);
		}
		if(mana.getType() == "Plains"){
			Integer numPlains = manaInPool.get("Plains")+1;
			manaInPool.put("Plains", numPlains);
		}
		if(mana.getType() == "Forest"){
			Integer numForests = manaInPool.get("Forest")+1;
			manaInPool.put("Forest", numForests);
		}
		if(mana.getType() == "Island"){
			Integer numIslands = manaInPool.get("Island")+1;
			manaInPool.put("Island", numIslands);
		}
		if(mana.getType() == "Mountain"){
			Integer numMountains = manaInPool.get("Mountain")+1;
			manaInPool.put("Mountain", numMountains);
		}
	}
	
	public void clear(){
		manaInPool.put("Swamp", 0);
		manaInPool.put("Forest", 0);
		manaInPool.put("Plains", 0);
		manaInPool.put("Island", 0);
		manaInPool.put("Mountain", 0);
	}
	
	public boolean checkPool(BaseCard card){
		boolean canAfford = false;
		
		return canAfford;
	}
	
}
