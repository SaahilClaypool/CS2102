import com.sun.org.apache.xml.internal.security.Init;
import tester.*;

public class Main {
    static Examples E = new Examples () ;
    static ExamplesStack ES = new ExamplesStack();
    static ExamplesQueue EQ = new ExamplesQueue();
    static ExamplesPQ EP = new ExamplesPQ();


    public static void main(String[] args) {

    /*
     These are all nonsense calls just designed to check that
     the correct class and interface names are defined and
     that methods have the expected input and output types.
     These are not checking for correct answers beyond types.
     */

        // dummy variables for the outputs
        boolean boolResult;
        int intResult;

        // Create samples of each kind of tournament

        RugbyTeam rugbyTeamCheck = new RugbyTeam("WPI", "maroon", false, 4, 6);
        RugbyResult rugbyResultCheck = new RugbyResult(10,15);
        Match rugbyMatchCheck = new Match(rugbyTeamCheck, rugbyTeamCheck, rugbyResultCheck);
        InitMatch firstMatch = new InitMatch(rugbyMatchCheck);
        AdvanceMatch secondMatch = new AdvanceMatch(rugbyMatchCheck, firstMatch, firstMatch);

        // Try calling all methods

        // winnersAlwaysAdvanced
        boolResult = ((ITourneyTree) firstMatch).winnersAlwaysAdvanced();
        boolResult = ((ITourneyTree) secondMatch).winnersAlwaysAdvanced();

        // countUnderdogWins
        intResult = firstMatch.countUnderdogWins();
        intResult = secondMatch.countUnderdogWins();

        // Run the Examples class
        Tester.run(E);
        // if you make a separate ExamplesHelper class for your helper tests,
        //   uncomment the next two lines
        // ExamplesHelper EH = new ExamplesHelper();
        // Tester.run(EH);

        RugbyTeam underdogA = new RugbyTeam("UA" ," ", false, 100, 1);
        RugbyTeam B = new RugbyTeam("UA" ," ", true, 100, 1);

        Match winU1 = new Match (underdogA, B, new RugbyResult(10,1));
        Match winB1 = new Match ( B,underdogA, new RugbyResult(10,1));
        Match winU2 = new Match ( B,underdogA, new RugbyResult(1,10));
        Match winB2 = new Match (underdogA, B, new RugbyResult(1,10));

        System.out.printf("winU1 %b \n" +
                " winB1 %b\n" +
                " winU2 %b\n" +
                " winB2 %b \n" , winU1.underdogWon(), winB1.underdogWon(), winU2.underdogWon(),winB2.underdogWon());


        InitMatch u1 = new InitMatch(winU1);
        InitMatch u2 = new InitMatch(winU2);
        InitMatch b1 = new InitMatch(winB1);
        InitMatch b2 = new InitMatch(winB2);

        AdvanceMatch u1b1U1 = new AdvanceMatch(winU1, u1,b1);
        AdvanceMatch u2b2B2 = new AdvanceMatch(winB2, u2,b2);
        AdvanceMatch finallyyy = new AdvanceMatch(winU1, u2b2B2,u1b1U1);

        System.out.println(finallyyy.countUnderdogWins());

    }
}