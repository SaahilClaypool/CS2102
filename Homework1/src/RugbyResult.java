/**
 * Created by Saahil on 10/29/2015.
 */
public class RugbyResult implements IResult
{
    int team1points, team2points;
    RugbyResult(int team1points, int team2points) {
        this.team1points = team1points;
        this.team2points = team2points;
    }
    public boolean isValid()
    {
        return team1points < 150 && team2points < 150;
    }

    @Override
    public boolean winnerT1() {
        return team1points > team2points;
    }
}