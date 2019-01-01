package game;
import java.util.concurrent.CopyOnWriteArrayList;

import interfaces.*;
import utils.Message;

public class Inhabitant {
	/*
	 * Basic live livings 
	 */
	int textiles;
	int crops; 
	int money; 
	int status; 
	
	/*
	 * actions
	 */
	Role role; 
	int actionPoints; // number of actions left for this round
	
	/* 
	 * User ids
	 */
	String familyName; 
	String firstName; 
	int avatar; 
	
	/*
	 * game loop variables
	 */
	boolean isAlive; 
	int consecutiveHunger; // die if you do not eat after consecutive three rounds
	int unreadMessages; // number of unread messages
	CopyOnWriteArrayList<Message> messages;

	
}
