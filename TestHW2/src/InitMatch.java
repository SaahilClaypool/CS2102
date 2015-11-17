/**
 * Created by Saahil on 11/5/2015.
 */
public class InitMatch implements ITourneyTree {
    Match m;
    InitMatch(Match m)
    {
        this.m = m;
    }
    public boolean winnersAlwaysAdvanced()
    {
        return true;
    }
    public Match getMatch()
    {
        return m;
    }
    public int countUnderdogWins()
    {

        return (m.underdogWon()? 1:0);
    }
}
