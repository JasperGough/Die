
public class Yahtzee
{
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    private String toString;
    private String summarize;
    private int[] rollArray = new int[5];
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
        rollArray[0] = die1.getValue();
        die2.roll();
        rollArray[1] = die2.getValue();
        die3.roll();
        rollArray[2] = die3.getValue();
        die4.roll();
        rollArray[3] = die4.getValue();
        die5.roll();
        rollArray[4] = die5.getValue();
    }
    public void roll(int dieNumber)
    {
        if (dieNumber == 1) {
            die1.roll();
            rollArray[0] = die1.getValue();
        } else if (dieNumber == 2) {
            die2.roll();
            rollArray[1] = die2.getValue();
        } else if (dieNumber == 3) {
            die3.roll();
            rollArray[2] = die3.getValue();
        } else if (dieNumber == 4) {
            die4.roll();
            rollArray[3] = die4.getValue();
        } else if (dieNumber == 5) {
            die5.roll();
            rollArray[4] = die5.getValue();
        }
    }
    public String summarize() {
        int [] tally = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i <= 4; i++) {
            tally[rollArray[i]] += 1;
        }
        return "1-"+tally[0]+"; "+"2-"+tally[1]+"; "+"3-"+tally[2]+"; "+"4-"+tally[3]+"; "+"5-"+tally[4]+"; "+"6-"+tally[5];
    }
    public String toString()
    {
        toString = "Dice values: " + die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
        return toString;
    }
}
