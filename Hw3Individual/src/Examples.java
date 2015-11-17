import tester.Tester;

import java.util.LinkedList;

/**
 * Created by Saahil on 11/12/2015.
 */
class Examples {
    Planning p = new Planning();
    public boolean testGivenExample (Tester t)
    {
        LinkedList<Double> rain = new LinkedList<Double>();
        // (1, -2, 5, -999, 8)
        rain.add(new Double(1));
        rain.add(new Double(-2));
        rain.add(new Double(5));
        rain.add(new Double (-999));
        rain.add(new Double (8));
        return t.checkExpect(p.rainfall(rain), 3.0);
    }

    public boolean testRainfallWNegatives(Tester t)
    {
        LinkedList<Double> rain = new LinkedList<Double>();
        int neg = 1;
        rain.add(new Double(0));
        rain.add(new Double(-1));
        rain.add(new Double(2));
        rain.add(new Double(-3));
        rain.add(new Double(4));
        rain.add(new Double(-5));
        rain.add(new Double(6));
        rain.add(new Double(-7));
        rain.add(new Double(8));
        rain.add(new Double(-9));
        // everything after this point should be ignored
        rain.add(new Double(-999));
        for (int i = 0; i < 100 ; i++) {
            rain.add(new Double(i));
        }

        return t.checkExpect(p.rainfall(rain), 4.0);
    }
    public boolean testMaxTripleLengthdGiven(Tester t)
    {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("a");
        strings.add("bb");
        strings.add("c");
        strings.add("dd");

        return  t.checkExpect(p.maxTripleLength(strings), 5);
    }

    public boolean testMaxTripleLengthNormalSentence(Tester t)
    {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("A");
        strings.add("apple");
        strings.add("fell");
        strings.add("from");
        strings.add("a");
        strings.add("tree");
        return t.checkExpect(p.maxTripleLength(strings), 13 );
    }

}
