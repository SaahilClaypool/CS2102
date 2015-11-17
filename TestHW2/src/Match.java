/**
 * Created by Saahil on 10/29/2015.
 *
 * class to create contestant1 match
 */

//Class to represent match between two contestants
public class Match
{
    //'holds' two contestants and contestant1 result
    IContestant contestant1;
    IContestant contestant2;

    IResult r;

    Match(IContestant c1, IContestant c2, IResult r1)
    {
        this.contestant1 = c1;
        this.contestant2 = c2;
        this.r = r1;
    }
    // returns the winner of the match
    public IContestant winner()
    {

        return (r.winnerT1() ? contestant1 : contestant2);
    }
    // returns true if the underdog wins
    boolean underdogWon ()
    {

        boolean b;
        if(contestant1.expectToBeat(contestant2)) b= contestant2.equals(winner());
        else b = contestant1.equals(winner());
        System.out.printf("" + contestant1 + " vs " + contestant2 + " : %b \n", b);
        return b;
    }
    public String toString()
    {
        return " " + contestant1 + " : " + contestant2;

    }
}
