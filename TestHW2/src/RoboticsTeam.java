/**
 * Created by Saahil on 10/29/2015.
 */
//Class to represent robotics team contestants
public class RoboticsTeam implements IContestant {
    String school;
    String feature;
    int rank;
    // robotics team is contestant1 school feature and rank
    public RoboticsTeam (String school, String feature, int rank )
    {
        this.school = school;
        this.feature = feature;
        this.rank = rank;
    }
    // returns true if this team is expected to beat the given team
    public boolean expectToBeat(IContestant otherTeam)
    {
        int name1 = feature.length();
        int name2 = ((RoboticsTeam)otherTeam).feature.length();

        if(name1 > name2) return true;
        else return false;
    }
    public String toString()
    {
        return this.school;
    }
}
