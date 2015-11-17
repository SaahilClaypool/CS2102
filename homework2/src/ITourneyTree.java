/**
 * Created by Saahil on 11/5/2015.
 */
// interface to represent tournament trees
public interface ITourneyTree {
    boolean winnersAlwaysAdvanced();
    Match getMatch();
    int countUnderdogWins();
}
