
public class Yahtzee
{
    private String toString;
    private String summarize;
    private Die6[] rollArray = {
        new Die6(),
        new Die6(),
        new Die6(),
        new Die6(),
        new Die6()
    };
    public Yahtzee()
    {
       this.roll();
    }
    public void roll()
    {
        for (int i = 0; i < rollArray.length; i++) {
            rollArray[i].roll();
        }
    }
    public void roll(int dieNumber)
    {
        if (dieNumber> 0 && dieNumber <= rollArray.length) {
            rollArray[dieNumber-1].roll();
        }
    }
    public String summarize() {
        int [] tally = {0, 0, 0, 0, 0, 0};
        summarize = "";
        for (int i = 0; i < rollArray.length; i++) {
            tally[rollArray[i].getValue()-1] += 1;
        }
        for (int i = 0; i < tally.length; i++) {
            summarize += (i+1)+"-"+tally[i];
            if (i < tally.length-1) {
                summarize += "; ";
            }
        }
        return summarize;
    }
    public String toString()
    {
        toString = "Dice values:";
        for (int i = 0; i < rollArray.length; i++) {
            toString += " " + rollArray[i].getValue();
        }
        return toString;
    }
}
