/**
 * Created by Saahil on 10/29/2015.
 */

import tester.IExamples;
import tester.Tester;
public class Examples implements IExamples{

    public static void main(String[]args)
    {
        Examples E = new Examples();
        Tester.runFullReport(E);
        System.out.println("Saahil is awesome bitches");
        System.out.println(E.testGet3(new Tester()));

    }

    public static int get3()
    {
        return 3;
    }
    public boolean testGet3(Tester t)
    {
        return t.checkExpect(get3(), 3);
    }
    public void tests (Tester t)
    {
        testGet3(t);
    }
}
