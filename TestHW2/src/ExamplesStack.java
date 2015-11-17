
import tester.ISame;
import tester.Tester;

/**
 * Created by Saahil on 11/8/2015.
 */
public class ExamplesStack {
    IStack s = new EmptyStack();
    public boolean testBasic(Tester t)
    {

        return t.checkExpect(s.push(3).top(), 3);
    }
    public boolean testPop1 (Tester t)
    {
        return t.checkExpect(s.push(3).push(2).push(1).pop(), s.push(3).push(2));

    }
    public boolean testTop (Tester t)
    {
        return t.checkExpect(s.push(3).push(2).push(1).top(), 1);
    }
    public boolean testIsEmpty(Tester t)
    {
        System.out.println("HEREHERHERHERHERHERHEHREHRHERHERH" + s.push(3).pop());
        return t.checkExpect(s.push(3).pop().isEmpty() , true);
    }
    public boolean testIsEmpty2(Tester t)
    {
       s.push(3);
        return t.checkExpect(s.isEmpty(), true);
    }
    public boolean testPop2(Tester t)
    {
        return t.checkExpect(s.push(3).push(2).pop().push(1), s.push(3).push(1));
    }

}
