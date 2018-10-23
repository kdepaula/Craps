/**
 * 
 * @author Katelyn DePaula
 * Card Class
 *Period 7
 */
public class Card 
{

	private String rank;
	private String suit;
	private int value;
	
	/**
	 * Constructs a card with given rank, suit, and value
	 * @param r	rank
	 * @param s	suit
	 * @param v	value
	 */
	
	public Card(String r, String s, int v)
	{
		rank = r;
		suit = s;
		value = v;
	}
	
	/**
	 * returns the suit
	 * @return suit
	 */
	
	public String getSuit()
	{
		return suit;
	}
	
	/**
	 * returns the rank
	 * @return rank
	 */
	
	public String getRank()
	{
		return rank;
	}
	
		

	/**
	 * returns the value
	 * @return value
	 */
	
	public int getValue()
	{
		return value;
	}
}
