/**
 * Created by Saahil on 11/5/2015.
 */
public class AdvanceMatch implements ITourneyTree {
    Match m;
    ITourneyTree f1, f2;
    AdvanceMatch(Match m, ITourneyTree feeder1, ITourneyTree feeder2)
    {
        this.m = m;
        this.f1 = feeder1;
        this.f2 = feeder2;

    }
    public Match getMatch()
    {
        return m;
    }
    public boolean winnersAlwaysAdvanced()
    {

        return (m.contestant1.equals(f1.getMatch().winner()) || m.contestant1.equals(f2.getMatch().winner()) )
                &&
                (m.contestant2.equals(f1.getMatch().winner()) || m.contestant2.equals(f2.getMatch().winner()) )
                &&
                f1.winnersAlwaysAdvanced()
                &&
                f2.winnersAlwaysAdvanced();
    }
    public int countUnderdogWins()
    {

        return (m.underdogWon()? 1 : 0 ) + f1.countUnderdogWins() + f2.countUnderdogWins();
    }

}
