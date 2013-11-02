package game.elements;

import java.security.InvalidParameterException;
import java.util.HashMap;

public class ManaCost {
	
	public ManaCost(HashMap<String, Integer> cost) throws Exception{
		
		if(cost.size() != 5){
			throw new InvalidParameterException();
		}
		if(!cost.containsKey("Swamp")){
			throw new InvalidParameterException();
		}
		if(!cost.containsKey("Forest")){
			throw new InvalidParameterException();
		}
		if(!cost.containsKey("Plains")){
			throw new InvalidParameterException();
		}
		if(!cost.containsKey("Island")){
			throw new InvalidParameterException();
		}
		if(!cost.containsKey("Mountain")){
			throw new InvalidParameterException();
		}
	}

}
