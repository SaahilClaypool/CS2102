/**
 * Created by Saahil on 11/5/2015.
 */
public interface ITourneyTree {
    boolean winnersAlwaysAdvanced();
    Match getMatch();
    int countUnderdogWins();
}
