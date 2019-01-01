package game;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import interfaces.Era;

public class Game {
	
	// Game 
	ConcurrentHashMap<String, Era> era = new ConcurrentHashMap<>();
	CopyOnWriteArrayList<Inhabitant> inhabitants = new CopyOnWriteArrayList<Inhabitant>();
	
	int round; 
	
	// create a name game
	Game(int count, Server server) {
		
	}; 
	
	// retrieve from network
	Game(String id, Server server) {
		RetrieveDataByGameId(id);
	};
	
	void RetrieveDataByGameId(String id) {
		
	}; 
	
	/*
	 *  Game Loop Methods
	 */
	public void RoundOver() {
		ExecuteEraRules();
		ExecuteRoleEffects(); 
		CalculateDeath(); 
		PreparationForNextRound(); 
	}

	private void PreparationForNextRound() {
		// TODO Auto-generated method stub
		
	}

	private void CalculateDeath() {
		// TODO Auto-generated method stub
		
	}

	private void ExecuteRoleEffects() {
		// TODO Auto-generated method stub
		
	}

	private void ExecuteEraRules() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * End of Game Loop Methods
	 */
}
