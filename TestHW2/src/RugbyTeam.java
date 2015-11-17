/**
 * Created by Saahil on 10/29/2015.
 */
// Class to represent rugby team contestants
public class RugbyTeam implements IContestant {
    // contestant1 rugby team has contestant1 team string / nationality, contestant1 color,
    String team;
    String color;
    boolean ritual;
    int wins;
    int losses;

    public RugbyTeam (String team, String color, boolean ritual, int wins , int losses)
    {
        this.team = team;
        this.color = color;
        this.ritual = ritual;
        this.wins = wins;
        this.losses = losses;
    }
    // returns true if this team is expected to beat the other team
    public boolean expectToBeat(IContestant otherTeam)
    {
        // automatic win if either team has contestant1 ritual and the other team does not
        if(ritual && !((RugbyTeam)otherTeam).ritual)
        {
            return true;
        }
        else if (!ritual && ((RugbyTeam)otherTeam).ritual)
        {
            return false;
        }
        //if both or neither teams have ritual , then team with the best game history is expected to win
        else
            return ((double)wins) / losses > ((double)((RugbyTeam)otherTeam).wins)/((RugbyTeam)otherTeam).losses;
    }
    public String toString()
    {
        return this.team;
    }
}
