
public class Yahtzee
{
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    private String toString;
    private String summarize;
    public Yahtzee()
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
        if (dieNumber == 1) {
            die1.roll();
        } else if (dieNumber == 2) {
            die2.roll();
        } else if (dieNumber == 3) {
            die3.roll();
        } else if (dieNumber == 4) {
            die4.roll();
        } else if (dieNumber == 5) {
            die5.roll();
        }
    }
    public String summarize() {
        for (int i = 1; i <= 6; i++) {
            
        }
        return "idk yet lmao";
    }
    public String toString()
    {
        toString = "Dice values: " + die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
        return toString;
    }
}
