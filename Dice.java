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
		//roll should not be a field, but you can make it a variable under
		//the method roll but you can do it without that
		
		public int getNumRolls()
		{
			return numRolls;
		}
		
		public String display()
		{
			String picture;
			if(numberRolled == 1)
			{
				picture = "________\n"
						+ "|       |\n"
						+ "|   0   |\n"
						+ "|_______|";
			}
			
			else if(numberRolled == 2)
			{
				picture = "________\n"
						+ "|  0    |\n"
						+ "|       |\n"
						+ "|____0__|";
			}
			else if(numberRolled == 3)
			{
				picture = "________\n"
						+ "|  0    |\n"
						+ "|   0   |\n"
						+ "|____0__|";
			}
			else if(numberRolled == 4)
			{
				picture = "________\n"
						+ "| 0   0 |\n"
						+ "|       |\n"
						+ "|_0___0_|";
			}
			else if(numberRolled == 5)
			{
				picture = "________\n"
						+ "| 0  0  |\n"
						+ "|   0   |\n"
						+ "|_0___0_|";
			}
			else if(numberRolled == 6)
			{
				picture = "________\n"
						+ "| 0   0 |\n"
						+ "| 0   0 |\n"
						+ "|_0___0_|";
			}
			
			return picture;
		}
}
