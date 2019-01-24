/**
 * This is program that runs the game of Craps
 *
 * @author Marc Panossian
 * @version January 18, 2019
 */

import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
       Die d1 = new Die();
       Die d2 = new Die();
       Scanner in = new Scanner(System.in);
       while(true)
        {
            System.out.println("Let's play the game of Craps! ");
            System.out.println("Press the [Enter] key in order to roll the dice please. ");
            in.nextLine();
            int roll1 = d1.roll();
            int roll2 = d2.roll();
            int totalRoll = roll1 + roll2;
            System.out.println("Friend, you have rolled a " + roll1 + " and a " + roll2);
            System.out.println("Giving you a total of " + totalRoll);

            if (totalRoll == 7 || totalRoll == 11)
            {
                System.out.println("Congrats, you have won the game pal.");
            }
            else if (totalRoll == 2 || totalRoll == 3 || totalRoll == 12)
            {
                System.out.println("Bummer =(, you lose.");
            }
            else
            {
                int point = totalRoll;
                boolean keepPlaying = true;
                while (keepPlaying)
                {
                    System.out.println("Press the [Enter] key in order to roll the dice please.");
                    in.nextLine();
                    roll1 = d1.roll();
                    roll2 = d2.roll();
                    totalRoll = roll1 + roll2;
                    System.out.println("Friend, you have rolled a " + roll1 + " and a " + roll2);
                    System.out.println("Giving you a total of " + totalRoll);
                    if (totalRoll == point)
                    {
                        System.out.println("Impressive, you have matched your point. Winner!");
                        keepPlaying = false;
                    }
                    else if (totalRoll == 7)
                    {
                        System.out.println("Ouch, you rolled a 7. You lose.");
                        keepPlaying = false;
                    }
                }
                System.out.println("Good game friend.");
            }
            System.out.println("Want to play Craps again? (Y/n) ");
            String playAgain = in.nextLine();
            if (playAgain.equals(""))
            {
            }
            else if (playAgain.substring(0,1).equals("n"))
            {
                break;
            }
       }
       System.out.println("Take care friend, thanks for all the craps-playing you have done.");
    }
}

