
public class Yatzhee
{
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    public Yatzhee()
    {
       die1 = new Die6();
       die2 = new Die6();
       die3 = new Die6();
       die4 = new Die6();
       die5 = new Die6();
    }
    public void roll()
    {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    public void roll(int dieNumber)
    {
        
    }
}
