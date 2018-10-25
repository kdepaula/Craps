/**
/**
 * @author Katelyn DePaula
 *
 */
import java.util.Scanner;

public class Craps 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int point;
		String playAgain = "yes";
		while (playAgain.equals("yes")) 
		{
			System.out.println("Click enter to roll");
			in.nextLine();
			Dice die1 = new Dice();
			Dice die2 = new Dice();
			int roll1 = die1.roll();
			int roll2 = die2.roll();
			System.out.println("Die 1: " + roll1 + "\tDie 2: " + roll2);
			if ((roll1 + roll2) == 2 || (roll1 + roll2) == 12) 
			{
				System.out.println("You lose.");
				System.out.println("Would you like to play again? Enter yes or no");
				playAgain = in.nextLine();
			} 
			
			else if ((roll1 + roll2) == 7 || (roll1 + roll2) == 11) 
			{
				System.out.println("You win.");
				System.out.println("Would you like to play again? Enter yes or no");
				playAgain = in.nextLine();
			}

			else 
			{
				point = roll1 + roll2;
				System.out.println("Your point is " + point + "\nClick enter to roll again");
				in.nextLine();
				roll1 = die1.roll();
				roll2 = die2.roll();
				System.out.println("Die 1: " + roll1 + "\tDie 2: " + roll2);
				
				while (point != (roll1 + roll2) && (roll1 + roll2) != 7) 
					{
						System.out.println("Click enter to roll again");
						in.nextLine();
						roll1 = die1.roll();
						roll2 = die2.roll();
						System.out.println("Die 1: " + roll1 + "\tDie 2: " + roll2);
					}
					
					if ((roll1 + roll2) == 7) 
					{
						System.out.println("You lose");
						System.out.println("Would you like to play again? Enter yes or no");
						playAgain = in.nextLine();
					}

					else if (point == (roll1 + roll2)) 
					{
						System.out.println("You win");
						System.out.println("Would you like to play again? Enter yes or no");
						playAgain = in.nextLine();
					}

					while (!playAgain.equals("yes") && !playAgain.equals("no")) 
					{
					System.out.println("Please type yes or no (do not type anything else)");
					playAgain = in.next();
					}
					
					if (playAgain.equals("no")) 
					{
							System.out.println("Thanks for playing Craps.");
					}
				
				}

			}
		}
} 
