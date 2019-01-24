/**
 * This class here creates a Die
 *
 * @author Marc Panossian
 * @version January 18, 2019
 */
public class Die
{
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        roll = roll();
    }
    /**
     * The roll method rolls the die
     *  
     * @return the value of the die roll between the numbers
     * of 1 to 6
     */
    public int roll()
    {
        roll = (int) (Math.random() * 6) + 1;
        return roll;
    }
}
        