/**
 * 
 * @author kdepaula20
 *
 */
public class Dice 
{

		private int numRolls;
		
		public Dice()
		{
			numRolls = 0;
		}
		
		public void reset()
		{
			numRolls = 0;
		}
		
		public int roll()
		{
			numRolls++;
			return (int) ((Math.random() * 6) + 1);	
		}
		//roll should not be a field, but you can make it a variable under
		//the method roll but you can do it without that
		
		public int getNumRolls()
		{
			return numRolls;
		}
}
