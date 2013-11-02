package card.types;

import java.util.ArrayList;
import java.util.HashMap;

import exceptions.CardAlreadyTappedException;

public class Creature extends BaseCard{

	private int power;
	private int toughness;
	private boolean isTapped = false;
	private boolean attacker = false;
	private boolean hasFlying = false;
	private boolean hasTrample = false; 
	
	public Creature(HashMap<String, Integer> costObj, String creatText, int creatPow, int creatTough){
		super(costObj, creatText);
		this.power = creatPow;
		this.toughness = creatTough;
	}
	
	public Creature(HashMap<String, Integer> costObj, String creatText, int creatPow, int creatTough, ArrayList<String> specials){
		super(costObj, creatText);
		this.power = creatPow;
		this.toughness = creatTough;
		for(String ability: specials){
			if(ability == "flying"){
				this.hasFlying = true;
			}
			if(ability == "trample"){
				this.hasTrample = true; 
			}		
		}
	}
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getToughness() {
		return toughness;
	}

	public void setToughness(int toughness) {
		this.toughness = toughness;
	}
	
	public void tapCard() throws Exception{
		if(!isTapped){
			this.isTapped = true;	
		}else{
			throw new CardAlreadyTappedException("This card is already tapped.");
		}
	}
	
	public void untapCard(){
		this.isTapped = false;
		this.setAttacker(false);
	}
	
	private void setAttacker(boolean isAttacker){
		this.attacker = true; 
	}
	
	public boolean declareAsAttacker(){
		try {
			this.tapCard();
			this.setAttacker(true);
		}catch (Exception e){
			return false;
		}
		return true; 	
	}
	
	
	

}
