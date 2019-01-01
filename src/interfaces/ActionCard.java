package interfaces;

/* 
 * The game will recalculate the action cards at the beginning of 
 * each round and assign action cards to players; 
 */
public interface ActionCard {
	public String name = ""; 
	public String tooltip = "";
	
	// A player may has this card in hand, 
	// but he/she may not have enough resources to 
	// use it
	public boolean CheckValidty(); 
	
	
	public void DoAction(); 
	
}
