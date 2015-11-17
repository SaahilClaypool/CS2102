import tester.*;
// Class to hold and test examples
class Examples {

    /*
   Rugby Tests tests
     */

    RugbyTeam USA = new RugbyTeam("USA", "Blue", false, 100, 0);
    RugbyTeam AU = new RugbyTeam("AU", "Black", true, 0, 100);
    RugbyTeam CAN = new RugbyTeam("CAN", "Red", false, 0, 100);
    RugbyResult UvsAU = new RugbyResult(100, 0);
    RugbyResult UvsCAN = new RugbyResult(100, 0);
    Match USAvsAU = new Match(USA, AU, UvsAU);
    Match USAvsCAN = new Match(USA, CAN, UvsCAN);

    boolean testExpectToBeat1(Tester t) {
        return t.checkExpect(USA.expectToBeat(AU), false);
    }

    boolean testWinner1(Tester t) {
        return t.checkExpect(USAvsAU.winner(), USA);
    }

    boolean testWinner2(Tester t) {
        return t.checkExpect(USAvsCAN.winner(), USA);
    }

    boolean testUnderDog1(Tester t) {
        return t.checkExpect(USAvsAU.underdogWon(), true);
    }

    boolean testUnderDog2(Tester t) {
        return t.checkExpect(USAvsCAN.underdogWon(), false);
    }

    /*
    robotics tests
    */

    RoboticsTeam WPI = new RoboticsTeam("WPI", "BIG ARM THING", 1);
    RoboticsTeam RPI = new RoboticsTeam("RPI", "tiny arm", 3);
    RoboticsTeam MIT = new RoboticsTeam("MIT", "HUGE ARM AND SMART PEOPLE", 2);
    RoboticsResult WPIvsRPI = new RoboticsResult(10, 10, true, 0, 0, false);
    RoboticsResult WPIvsMIT = new RoboticsResult(0, 0, false, 2, 0, true);
    RoboticsResult RPIvsMIT = new RoboticsResult(0,0,true,0,0,false);
    Match WvR = new Match(WPI, RPI, WPIvsRPI);
    Match WvM = new Match(WPI, MIT, WPIvsMIT);
    Match USAvsWPI = new Match (USA, WPI, WPIvsRPI);


    // testing expect to beat
    boolean testRExpectToBeat1(Tester t) {
        return t.checkExpect(WPI.expectToBeat(RPI), true);
    }
    boolean testwinnerTeam1(Tester t) {
        return t.checkExpect(WPIvsRPI.winnerT1(), true);
    }

    // testing winnerTfunction in result
    boolean testwinnerTeam2(Tester t) {
        return t.checkExpect(WPIvsMIT.winnerT1(), true);
    }
    boolean testwinnerTeam3(Tester t)
    {
        return t.checkExpect(RPIvsMIT.winnerT1(), false);
    }
    boolean testRWinner1(Tester t) {
        return t.checkExpect(WvR.winner(), WPI);
    }
    //testing winner funciton in Match
    boolean testRWinner2(Tester t) {
        return t.checkExpect(WvM.winner(), WPI);
    }
    boolean testRUnderDog1(Tester t) {
        return t.checkExpect(WvR.underdogWon(), false);
    }
    boolean testRUnderDog2(Tester t) {
        return t.checkExpect(WvM.underdogWon(), true);
    }





    // examples for robotics
    RoboticsTeam team1 = new RoboticsTeam("ab", "arm", 4);
    RoboticsTeam team2 = new RoboticsTeam("cd", "s", 2);
    RoboticsResult rRes = new RoboticsResult(0, 1, false, 0, 0, true);
    Match rM = new Match(team1, team2, rRes);

    RugbyTeam teamA = new RugbyTeam("wales", "green", false, 10, 10);
    RugbyTeam teamB = new RugbyTeam("UK", "Black", true, 0, 10);
    RugbyResult bRes = new RugbyResult(10, 0);
    Match bM = new Match(teamA, teamB, bRes);

    // test for winner robotics
    boolean testrRes(Tester t) {
        return t.checkExpect(team1, rM.winner());
    }

    // test for winner rugby
    boolean testbRes(Tester t) {
        return t.checkExpect(teamA, bM.winner());

    }

    //tests for expexpectToBeat for rugby and robotics
    boolean testExpectedR(Tester t) {
        return t.checkExpect(true, team1.expectToBeat(team2));
    }

    boolean testExpectedB(Tester t) {
        return t.checkExpect(false, teamA.expectToBeat(teamB));
    }


    // test for underdogWon() for rugby and robotics
    boolean testUnderdogB(Tester t) {
        return t.checkExpect(true, bM.underdogWon());
    }

    boolean testUnderdogR(Tester t) {
        return t.checkExpect(false, rM.underdogWon());
    }

    //test for result.isValid() for rugby and robotics
    boolean testisValidr(Tester t) {
        return t.checkExpect(true, rRes.isValid());
    }

    boolean testisValidb(Tester t) {
        return t.checkExpect(true, bRes.isValid());
    }

    boolean testisValidFr(Tester t) {
        return t.checkExpect(false, (new RoboticsResult(10, 10, false, 1000, 10000, true)).isValid());
    }

    boolean testisValidFb(Tester t) {
        return t.checkExpect(false, (new RugbyResult(10000, 10000)).isValid());
    }



}
