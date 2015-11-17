/**
 * Created by Saahil on 10/29/2015.
 */
//Contestant interface
public interface IContestant {
    // returns true if this contestant is expected to beat the given contestant
    boolean expectToBeat(IContestant other);
}
