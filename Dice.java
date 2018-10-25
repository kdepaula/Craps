/**
 * 
 * @author kdepaula20
 *
 */
public class Dice 
{

		private int numRolls;
		private int numberRolled;
		
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
			numberRolled = (int) ((Math.random() * 6) + 1);	
			return numberRolled;
		}
		
		public int getNumRolls()
		{
			return numRolls;
		}
		
		public String display()
		{
			String picture;
			
			if(numberRolled == 1)
			{
				picture = "\n________\n"
						+ "|       |\n"
						+ "|   0   |\n"
						+ "|_______|";
			}
			
			else if(numberRolled == 2)
			{
				picture = "\n________\n"
						+ "| 0     |\n"
						+ "|       |\n"
						+ "|_____0_|";
			}
			else if(numberRolled == 3)
			{
				picture = "\n________\n"
						+ "| 0     |\n"
						+ "|   0   |\n"
						+ "|_____0_|";
			}
			else if(numberRolled == 4)
			{
				picture = "\n________\n"
						+ "| 0   0 |\n"
						+ "|       |\n"
						+ "|_0___0_|";
			}
			else if(numberRolled == 5)
			{
				picture = "\n________\n"
						+ "| 0   0 |\n"
						+ "|   0   |\n"
						+ "|_0___0_|";
			}
			else
			{
				picture = "\n________\n"
						+ "| 0   0 |\n"
						+ "| 0   0 |\n"
						+ "|_0___0_|";
			}
			
			return picture;
		}
}