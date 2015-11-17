import tester.Tester;

import javax.sound.sampled.Line;
import javax.xml.crypto.Data;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.jar.Pack200;

/**
 * Created by Saahil on 11/12/2015.
 */
public class HeapTester {

    static boolean addEltTester(IHeap Horig, int elt, IBinTree Hadded) {
        // takes in heap and element to be added, determines if the thing given back is the correct result of that
        // addition

        //smallest on top: traverse tree, each child must be smaller than parent
        boolean isHeap = Hadded.isHeap();
        if(!isHeap)
        {


            return false;
        }
        LinkedList<Integer> allElements = new LinkedList<>();
        Horig.toList(allElements);

        LinkedList<Integer> allElementsAdded = new LinkedList<>();
        Hadded.toList(allElementsAdded);

        allElements.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        allElementsAdded.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        // must be exactly one more element
        if(allElements.size() != allElementsAdded.size()-1)
        {
            return false;
        }
        // both sorted lists, any mismatch must be the added element,
        // or the second is not a heap of the first with an addition
        boolean hasFoundAdded = false;
        for (int i = 0; i < allElements.size(); i++) {
            if(hasFoundAdded)
            {

                if(!allElements.get(i).equals(allElementsAdded.get(i+1)))
                    return false;
            }

            else if(!allElements.get(i).equals(allElementsAdded.get(i)))
            {

                if(!(allElementsAdded.get(i).intValue() == elt)) {
                    return false;
                }
                else {
                    i--;
                    hasFoundAdded = true;
                }
            }
        }
        // checks the last element if there is no other mismatch
        if(!hasFoundAdded)
        {
            return allElementsAdded.peekLast().equals(new Integer(elt));
        }
        return true;
    }


    static boolean remMinEltTester(IHeap Horig, IBinTree Hremoved) {


        //smallest on top: traverse tree, each child must be smaller than parent
        boolean isHeap = Hremoved.isHeap();
        if(!isHeap)
        {
            return false;
        }
        LinkedList<Integer> allElements = new LinkedList<>();
        Horig.toList(allElements);

        LinkedList<Integer> allElementsMinusOne = new LinkedList<>();
        Hremoved.toList(allElementsMinusOne);
        allElements.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        allElementsMinusOne.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        // both sorted lists, mismatch must be reuslt of the subtracted elt
        if(allElements.size() - 1 != allElementsMinusOne.size())
        {

            return false;
        }
        for (int i = 0; i < allElementsMinusOne.size() ; i++) {

            if(!allElementsMinusOne.get(i).equals(allElements.get(i+1)))
            {
                return false;
            }
        }
        return true;

    }




}
