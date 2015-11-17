/**
 * Created by Saahil on 11/5/2015.
 */
// Class to represent a non initial match in a tourny tree
public class AdvanceMatch implements ITourneyTree {
    Match m;
    ITourneyTree f1, f2;
    AdvanceMatch(Match m, ITourneyTree feeder1, ITourneyTree feeder2)
    {
        //current match
        this.m = m;
        //match for competitor 1
        this.f1 = feeder1;
        // match for competitor 2
        this.f2 = feeder2;

    }
    //returns the current match
    public Match getMatch()
    {
        return m;
    }
    //returns true if all matches have contestants that were winners of the previous match
    public boolean winnersAlwaysAdvanced()
    {
        System.out.println(f2.getMatch().winner());
        return (m.contestant1.equals(f1.getMatch().winner()) || m.contestant1.equals(f2.getMatch().winner()) )
                &&
                (m.contestant2.equals(f1.getMatch().winner()) || m.contestant2.equals(f2.getMatch().winner()) )
                &&
                f1.winnersAlwaysAdvanced()
                &&
                f2.winnersAlwaysAdvanced();
    }
    // returns the number of times an underdog won
    public int countUnderdogWins()
    {
        return (m.underdogWon()? 1 : 0 ) + f1.countUnderdogWins() + f2.countUnderdogWins();
    }

}
