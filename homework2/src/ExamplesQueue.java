import tester.Tester;

/**
 * Created by Saahil on 11/8/2015.
 */

public class ExamplesQueue {
     Queue q = new Queue();

    public boolean testQ(Tester t)
    {
        return t.checkExpect(q.enqueue(5).isEmpty(),false );
    }
    public boolean testfront0(Tester t)
    {
        return t.checkExpect(q.enqueue(1).enqueue(2).front(), 1);

    }
    public boolean testfront(Tester t)
    {

        return t.checkExpect(q.enqueue(1).enqueue(2).dequeue().front(), 2);
    }
    public boolean testdequeue(Tester t)
    {
        IQueue z = q.enqueue(5).enqueue(7).enqueue(3);

        return t.checkExpect(z.dequeue(), q.enqueue(7).enqueue(3));
    }
    public boolean testEmpty (Tester t)
    {
        return t.checkExpect(q.enqueue(3).dequeue().isEmpty(), true);
    }
    public boolean testEmptyFalse(Tester t)
    {
        return t.checkExpect(q.enqueue(4).enqueue(3).dequeue().isEmpty(), false);
    }
    public boolean testAdvanced (Tester t)
    {
        return t.checkExpect(q.enqueue(3).enqueue(1).dequeue().enqueue(2), q.enqueue(1).enqueue(2));
    }


}
