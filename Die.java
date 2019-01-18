
/**
 * Write a description of class Die here.
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

    public int roll()
    {
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
}
        