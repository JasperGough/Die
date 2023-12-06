
public class Yatzhee
{
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    String toString;
    String summarize;
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
    public String summarize() {
        summarize = "1-" + die1.getValue() + "; " + "2-" + die2.getValue() + "; " + "3-" + die3.getValue() + "; " + "4-" + die4.getValue() + "; " + "5-" + die5.getValue();
        return summarize;
    }
    public String toString()
    {
        toString = "Dice values: " + die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
        return toString;
    }
}
