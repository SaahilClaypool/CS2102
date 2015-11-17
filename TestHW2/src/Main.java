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
        IQueue q = new EmptyQueue();
        q = q.enqueue(2);
        System.out.println(q);
        q = q.enqueue(3);
        System.out.println(q);
        q.enqueue(4);
        System.out.println(q);
        ExamplesQueue E2 = new ExamplesQueue();
        Tester.run(E2);

        IStack s = new EmptyStack();
        s = s.push(2);
        s.push(3);
        s = s.push(4);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(new EmptyStack().push(3).push(2).push(1).pop().push(5));

        ExamplesStack E3 = new ExamplesStack();
        Tester.run(E3);



    }
}