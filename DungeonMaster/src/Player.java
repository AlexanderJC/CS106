/**
 * This class represents a player for use in the fighting method of the Combat menu.
 * It just records a player's name and has room for their Dodge roll value.
 */
public class Player {
	private String playerName;
	private int dodgeVal;
	
	/**
	 * Constructor.
	 * @param initPlayerName	The desired name for this player.
	 * @param initDodgeVal		This player's Dodge value, calculated by them manually by rolling a d20 and adding their Speed value.
	 */
	public Player (String initPlayerName, int initDodgeVal){
		this.playerName = initPlayerName;
		this.dodgeVal = initDodgeVal;
	}
	
	/**
	 * Getter for the player name.
	 * @return The player's name.
	 */
	public String getName () {
		return this.playerName;
	}
	
	/**
	 * Getter for the player's Dodge value.
	 * @return The player's Dodge value.
	 */
	public int getDodge () {
		return this.dodgeVal;
	}
}
