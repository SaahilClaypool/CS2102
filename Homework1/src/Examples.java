import tester.* ;
class Examples {
    Examples () {} ;
    RugbyResult res = new RugbyResult(0,100);
    RugbyTeam team1 = new RugbyTeam();
    RugbyTeam team2 = new RugbyTeam();

    Match m = new Match(team1,team2, res);
    boolean testWinnerRug(Tester t)
    {
       return t.checkExpect(false, res.winnerT1());
    }

    boolean testWinnerMatchRug (Tester t)
    {
        return t.checkExpect(team2, m.winner());
    }

    RoboticsResult resR = new RoboticsResult(0,0,false, 1, 1, true);
    RoboticsTeam t1 = new RoboticsTeam();
    RoboticsTeam t2 = new RoboticsTeam();
    Match rm = new Match (t1, t2, resR);
    boolean testWinnerResR(Tester t)
    {
        return t.checkExpect(true ,  resR.winnerT1());
    }

    boolean testWinnerRobotics(Tester t)
    {
        return t.checkExpect(t1, rm.winner());
    }

    // checkFuntion
  /*
  * public boolean testFun (Tester t)
  * {
  * return t.checkExpect (fun , true/false);
  *
  * }
  *
  *
  *
  * */

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * TO RUN TESTS:::
     *
     *
     *
     *
     *
     static Examples E = new Examples () ;

     public static void main(String[] args) {
     Tester.run (E) ; / Tester.runFullReport(E);



     }
     }
     *
     */
}