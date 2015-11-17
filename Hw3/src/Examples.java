import sun.awt.image.ImageWatched;
import tester.Tester;

import javax.xml.crypto.Data;
import java.util.LinkedList;

/**
 * Created by Saahil on 11/14/2015.
 */
public class Examples {

    //this should pass
    public boolean testSimpleWorkingHeap(Tester t)
    {
        DataHeap data = new DataHeap(3);
        data = (DataHeap)data.addElt(4);
        data = (DataHeap)data.addElt(3);


        data = (DataHeap) data.addElt(2);
        data = (DataHeap) data.addElt(1);


        return t.checkExpect(HeapTester.addEltTester(data, 2, data.addElt(2)), true);
    }
    //this should fail because the element is added twice
    public boolean testTwoAdditions (Tester t)
    {
        DataHeap data = new DataHeap(3);
        data = (DataHeap)data.addElt(4);
        data = (DataHeap)data.addElt(3);


        data = (DataHeap) data.addElt(2);
        data = (DataHeap) data.addElt(1);

        DataHeap extraElement = (DataHeap)data.addElt(2);


        return t.checkExpect(HeapTester.addEltTester(data, 2, extraElement.addElt(2)), false);
    }
    //this should fail because the wrong element is added
    public boolean testWrongAddition (Tester t)
    {
        DataHeap data = new DataHeap(3);
        data = (DataHeap)data.addElt(4);
        data = (DataHeap)data.addElt(3);


        data = (DataHeap) data.addElt(2);
        data = (DataHeap) data.addElt(1);




        return t.checkExpect(HeapTester.addEltTester(data, 2, data.addElt(3)), false);
    }



    // should fail because add changes head
        public boolean test45Add8_0 (Tester t)
        {
            TestHeap test = new TestHeap(4,
                    new TestHeap3(5, new MtHeap(), new MtHeap()),
                    new MtHeap());
            LinkedList<Integer> l = new LinkedList<>();
            test.toList(l);
            LinkedList l2 = new LinkedList<>();
            test.addElt(8).toList(l2);
            return t.checkExpect(HeapTester.addEltTester(test, 8, test.addElt(8)), false);
        }

    // should fail
        public boolean test45Add8_2 (Tester t)
        {
            TestHeap3 test = new TestHeap3(4,
                    new TestHeap3(5, new MtHeap(), new MtHeap()),
                    new MtHeap());

            return t.checkExpect(HeapTester.addEltTester(test, 8, test.addElt(8)), false);
        }
    // should fail, heap 4 has a broken add
        public boolean test45Add8_3 (Tester t)
        {
            TestHeap4 test = new TestHeap4(4,
                    new TestHeap4(5, new MtHeap(), new MtHeap()),
                    new MtHeap());

            return t.checkExpect(HeapTester.addEltTester(test, 8, test.addElt(8)), false);
        }


        /// test remMinElt


        // should fail broken remove
        public boolean test45Rem_2 (Tester t)
        {
            TestHeap2 test = new TestHeap2(4,
                    new TestHeap2(5, new TestHeap2(6, new MtHeap(), new MtHeap()), new TestHeap2(6, new MtHeap(), new MtHeap())),
                    new TestHeap2(5, new TestHeap2(6, new MtHeap(), new MtHeap()), new TestHeap2(6, new MtHeap(), new MtHeap())));
            return t.checkExpect(HeapTester.remMinEltTester(test, test.remMinElt()), false);
        }


    // should fail
        public boolean test45Rem_5 (Tester t)
        {
            TestHeap5 test = new TestHeap5(4,
                    new TestHeap5(5, new MtHeap(), new MtHeap()),
                    new MtHeap());
            return t.checkExpect(HeapTester.remMinEltTester(test, test.remMinElt()), false);
        }



    // Broken Implementation Tests SHould fail
    public boolean testRemMinSimpleBroken2(Tester t)
    {
        TestHeap2 test = new TestHeap2(4,
                new TestHeap2(5, new MtHeap(), new MtHeap()),
                new TestHeap2(5, new MtHeap(), new MtHeap()));
        return t.checkExpect(HeapTester.remMinEltTester(test, test.remMinElt()), false);

    }
    // Broken Implementation Should fail
    public boolean testRemMinSimpleHeap5(Tester t){
        TestHeap5 test = new TestHeap5(4,
                new TestHeap5(5, new MtHeap(), new MtHeap()),
                new TestHeap5(5, new MtHeap(), new MtHeap()));
        return t.checkExpect(HeapTester.remMinEltTester(test,test.remMinElt()), false);
    }
}

