/**
 * Created by Saahil on 10/29/2015.
 */
public class RoboticsResult implements IResult
{
    int team1points, team1tasks,team2points, team2tasks;
    boolean team1fell, team2fell;
    RoboticsResult(int team1points, int team1tasks,
                   boolean team1fell,
                   int team2points, int team2tasks,
                   boolean team2fell)
    {
        this.team1points = team1points;
        this.team1tasks = team1tasks;
        this.team1fell = team1fell;


        this.team2points = team2points;
        this.team2tasks = team2tasks;
        this.team2fell = team2fell;

    }
    public boolean isValid()
    {
        return team1tasks < 8 && team1points < 16
            && team2tasks < 8 && team2points < 16;
    }

    public boolean winnerT1()
    {
        int team1Score = team1points + team1tasks - (team1fell ? 5 : 0);
        int team2Score = team2points + team2tasks - (team2fell ? 5 : 0);
        return team1Score > team2Score;
    }
}
