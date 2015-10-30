/**
 * Created by Saahil on 10/29/2015.
 */
public class Match
{
    IContestant a;
    IContestant b;

    IResult r;

    Match(IContestant c1, IContestant c2, IResult r1)
    {
        this.a = c1;
        this.b = c2;
        this.r = r1;
    }

    public IContestant winner()
    {

        ;;return (r.winnerT1() ? a : b);
    }
}
