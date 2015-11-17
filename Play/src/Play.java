import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

/**
 * Created by Saahil on 11/13/2015.
 */
public class Play {
    public static ArrayList<Double> multByTwo(ArrayList<Double> ar, Function<Double, Double> function)
    {
        ArrayList<Double> arrayList = new ArrayList<Double>();
        for(Double d : ar)
        {
            arrayList.add(function.apply(d));
        }
        return arrayList;
    }
public static ArrayList<Integer> getSumLists(ArrayList<Integer> list)
{
    boolean lastZero = false;
    boolean isOver = false;
    ArrayList<Integer> temp = new ArrayList<Integer>();
    ArrayList<Integer> sum  = new ArrayList<Integer>();

    for(Integer i : list)
    if(!isOver){
        {
            if (!i.equals(new Integer(0))) {
                lastZero = false;
                temp.add(i);
            } else {

                if (lastZero) {
                    isOver = true;
                } else {
                    sum.add(sum(temp));
                    temp = new ArrayList<Integer>();
                }
                lastZero  = true;
            }

        }
        }
    if(!lastZero)
        sum.add(sum(temp));

    return sum;
    }
    public static Integer sum(ArrayList<Integer> list)
    {
        Integer sum = new Integer(0);
        for(Integer i: list)
        {
            sum = new Integer (sum.intValue() + i.intValue());
        }
        return sum;
    }

    public static void main(String[] args)
    {/*
        ArrayList<Double> d = new ArrayList<Double>();
        for (int i = 1; i <10 ; i++) {
            d.add(new Double(i));
        }
        System.out.println(d);
        System.out.println(multByTwo(d,(x) -> {return new Double(x.doubleValue()*2);}));
        System.out.println("awesome");*/

        LinkedList<Integer> a = new LinkedList<Integer>();
        LinkedList<Integer> b = new LinkedList<Integer>();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer (1));
        list.add(new Integer (0));
        list.add(new Integer (1));
        list.add(new Integer (1));
        list.add(new Integer (0));
        list.add(new Integer (1));
        list.add(new Integer (1));
        list.add(new Integer (1));
        list.add(new Integer (1));
        list.add(new Integer (1));
        list.add(new Integer (1));
        list.add(new Integer (1));list.add(new Integer (1));
        list.add(new Integer (1));
        list.add(new Integer (0));
        list.add(new Integer (0));
        list.add(new Integer (1));
        list.add(new Integer (1));


        System.out.println(Play.getSumLists(list));
    }
}
