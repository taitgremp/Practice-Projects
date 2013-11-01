package card.types;

import java.util.HashMap;

public class Creature extends BaseCard{

	private int power;
	private int toughness;
	
	public Creature(HashMap<String, Integer> costObj, String creatText, int creatPow, int creatTough){
		super(costObj, creatText);
		this.power = creatPow;
		this.toughness = creatTough;
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

}
