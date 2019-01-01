package interfaces;

import java.util.List;

import game.Game;
import interfaces.*;

public class Era {
	List<ActionCard> actionCards; 
	List<Rule> rules;
	
	Game game; 
	String name; 
	
	Era(Game g, String n) {
		game = g; 
		name = n;
	}
	
	public void AddActionCard(ActionCard ac) {
		actionCards.add(ac); 
	}
	public void AddRule(Rule r) {
		rules.add(r); 
	}
	
	void StartEra() {}; 
	
	void EndEra() {}; 
	
	public String GetName() {
		return name; 
	}
}
