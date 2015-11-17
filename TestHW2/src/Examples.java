import tester.Tester;

/**
 * Created by Saahil on 11/5/2015.
 */

public class Examples
{
    // teams for stub tourney
    RugbyTeam USA = new RugbyTeam("USA", "Blue", false, 100, 0);
    RugbyTeam AU = new RugbyTeam("AU", "Black", true, 0, 100);
    RugbyTeam CAN = new RugbyTeam("CAN", "Red", false, 0, 100);
    RugbyResult UvsAU = new RugbyResult(100, 0);
    RugbyResult UvsCAN = new RugbyResult(100, 0);
    Match USAvsAU = new Match(USA, AU, UvsAU);
    Match USAvsCAN = new Match(USA, CAN, UvsCAN);

    AdvanceMatch brokenTourney = new AdvanceMatch(USAvsAU, new InitMatch (USAvsAU), new InitMatch (USAvsAU) );
    // teams for correct tounry
    RugbyTeam US = new RugbyTeam("USA", "Blue", false, 100, 1);
    RugbyTeam CA = new RugbyTeam("CAN", "RED", false, 100 , 100);
    RugbyTeam A = new RugbyTeam("AU", "Blue", false, 1, 100);
    RugbyTeam EN = new RugbyTeam("EN", "WHITE", false, 100, 1);
    RugbyTeam JA = new RugbyTeam("JA", "WHITE", false, 1000, 1);
    RugbyTeam BR = new RugbyTeam("BR", "WHITE", false, 101, 1);

    // matches

    Match USvCA = new Match(US, CA, new RugbyResult(10,0)); // underog loss
    Match AvEN = new Match(A, EN, new RugbyResult(10,0));   // underdog win
    Match USvA = new Match(US, A, new RugbyResult(10,0));   // underdog loss
    Match EnvJA = new Match(EN, JA, new RugbyResult(10,0)); // underdog win
    Match AvBR = new Match(A, BR, new RugbyResult(10,0));  // underdog  win
    AdvanceMatch goodTourney = new AdvanceMatch(USvA , new InitMatch(USvCA),
            new AdvanceMatch(AvEN, new InitMatch(EnvJA), new InitMatch(AvBR)));

    AdvanceMatch badTourney = new AdvanceMatch(USvA, new InitMatch(USvA), new InitMatch(EnvJA));
    public boolean testWinnersAlwaysAdvanceBroken(Tester t)
    {
        return t.checkExpect(brokenTourney.winnersAlwaysAdvanced(), false);
    }
    public boolean testWinnersAlwaysAdvanceGood(Tester t)
    {
        return t.checkExpect(goodTourney.winnersAlwaysAdvanced(), true );
    }
    public boolean testWinnerSAlwaysAdvanceBad (Tester t)
    {
        return t.checkExpect(badTourney.winnersAlwaysAdvanced() , false);
    }
    public boolean testCountUnderdogWonGood(Tester t)
    {
        return t.checkExpect(goodTourney.countUnderdogWins(), 3);
    }
    public boolean testCountUnderdogWonBad(Tester   t)
    {
        return t.checkExpect(brokenTourney.countUnderdogWins(), 3);
    }

    // robotics
    RoboticsTeam WPI = new RoboticsTeam("WPI", "BIG ARM THING", 1);
    RoboticsTeam RPI = new RoboticsTeam("RPI", "tiny arm", 3);
    RoboticsTeam MIT = new RoboticsTeam("MIT", "HUGE ARM AND SMART PEOPLE", 2);
    RoboticsTeam BEK = new RoboticsTeam("BEK", "SURPRISE THEY ARE GOOD AT SOMETHING AND MIGHT WIN", 4);
    RoboticsTeam UMASS = new RoboticsTeam("UMASS", "zoo", 5);
    RoboticsResult WPIvsRPI = new RoboticsResult(10, 10, true, 0, 0, false);
    RoboticsResult WPIvsMIT = new RoboticsResult(0, 0, false, 2, 0, true);
    RoboticsResult RPIvsMIT = new RoboticsResult(0,0,true,0,0,false);
    RoboticsResult MITvsBEK = new RoboticsResult(5,5,false,0,0,true);
    RoboticsResult RPIvsUMASS = new RoboticsResult(5,5,false, 0,0,true);
    Match WvR = new Match(WPI, RPI, WPIvsRPI); //Underdog loss
    Match WvM = new Match(WPI, MIT, WPIvsMIT); // Underdog win
    Match RvM = new Match(RPI, MIT, RPIvsMIT); // Underdog loss
    Match MvB = new Match(MIT, BEK, MITvsBEK); // Underdog win
    Match RvU = new Match(RPI, UMASS, RPIvsUMASS); // Underdog loss

    AdvanceMatch robotSmash = new AdvanceMatch(WvM, new InitMatch(WvR), new AdvanceMatch(RvM, new InitMatch(RvU),new InitMatch(MvB) ));

    public boolean testWinnerWins(Tester t)
    {
        return t.checkExpect(robotSmash.winnersAlwaysAdvanced(), true);
    }
    public boolean testCount (Tester t)
    {
       return t.checkExpect(robotSmash.countUnderdogWins(),2);
    }




}
