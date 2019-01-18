
/**
 * Write a description of class Dice here.
 *
 * @author Marc Panossian
 * @version January 18, 2019
 */
public class Dice
{
    private Die d1;
    private Die d2;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        d1 = new Die();
        d2 = new Die();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int[] roll()
    {
         int[] result = {d1.roll(), d2.roll()};
         return result;
    }
}
