import tester.Tester;

/**
 * Created by Saahil on 11/8/2015.
 */
public class ExamplesPQ {
    PriorityQueue p = new PriorityQueue();

    public boolean testPQBasic(Tester t)
    {
        return t.checkExpect(p.addElt(3).getMinElt(), 3);
    }
    public boolean testPQRemove(Tester t)
    {
        return t.checkExpect(p.addElt(3).addElt(1).addElt(5).remMinElt(), p.addElt(3).addElt(5));
    }
    public boolean testPQempty(Tester t)
    {
        return t.checkExpect(p.addElt(3).remMinElt().isEmpty(), true );
    }
    public boolean testPQGetMin(Tester t)
    {
        return t.checkExpect(p.addElt(3).addElt(1).addElt(5).getMinElt(), 1);
    }
    public boolean testPQAdvanced(Tester t)
    {

        return t.checkExpect(p.addElt(100).addElt(1).addElt(2).addElt(3).remMinElt().getMinElt(), 2);
    }
}