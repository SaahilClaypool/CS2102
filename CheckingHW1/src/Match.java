/**
 * Created by Saahil on 10/29/2015.
 *
 * class to create a match
 */

//Class to represent match between two contestants
public class Match
{
    //'holds' two contestants and a result
    IContestant a;
    IContestant b;

    IResult r;

    Match(IContestant c1, IContestant c2, IResult r1)
    {
        this.a = c1;
        this.b = c2;
        this.r = r1;
    }
    // returns the winner of the match
    public IContestant winner()
    {

        return (r.winnerT1() ? a : b);
    }
    // returns true if the underdog wins
    boolean underdogWon ()
    {
        if(a.expectToBeat(b)) return b.equals(winner());
        else return a.equals(winner());
    }
}
