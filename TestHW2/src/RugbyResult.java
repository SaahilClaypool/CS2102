/**
 * Created by Saahil on 10/29/2015.
 */
//Class to represent rugby match result
public class RugbyResult implements IResult
{
    // contestant1 rugby result is the score of two teams
    int team1points, team2points;
    RugbyResult(int team1points, int team2points) {
        this.team1points = team1points;
        this.team2points = team2points;
    }
    public boolean isValid()
    {
        return team1points < 150 && team2points < 150;
    }

    // returns true if the first given team is the winner
    @Override
    public boolean winnerT1() {
        // the winner is the team more points
        return team1points > team2points;
    }
}
