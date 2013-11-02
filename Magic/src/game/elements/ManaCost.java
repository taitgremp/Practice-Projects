package game.elements;

import java.security.InvalidParameterException;
import java.util.HashMap;

public class ManaCost {
	
	public ManaCost(HashMap<String, Integer> cost) throws Exception{
		if(cost.size() != 5){
			throw new InvalidParameterException();
		}
	}

}
