import tester.Tester;

import java.util.LinkedList;

/**
 * Created by Saahil on 11/12/2015.
 */
// random class to hold planning functions
public class Planning {
    //takes in a list, calculates average up to -999. Ignores negatives
    public double rainfall(LinkedList<Double> rainfall)
    {
        int numReadings = 0;
        double sum = 0;
        // read until the end or until hits -999
        /*for (int i = 0; i < rainfall.size() && !(rainfall.get(i).doubleValue() == -999); i++) {
            if(rainfall.get(i) >=0){
                sum+=rainfall.get(i);
                numReadings++;
            }
        }*/
        // read until end or hits -999. Ignore negatives. Note this can be written as above.
        for(Double d : rainfall)
        {

            if(d.doubleValue() == -999) break;
            if(d.doubleValue() < 0) continue;
            sum+= d.doubleValue();
            numReadings++;
        }

        if(numReadings == 0) return -1;

        return sum/ numReadings;
    }
    // consumes linked list of strings, gives back maximum length of three consecutive strings
    public int maxTripleLength (LinkedList<String> strings)
    {
        // starting at third string, add 2 previous strings and compare against the max sum of lengths
        int max = 0;
        for (int i = 2; i < strings.size(); i++) {
            int cur = strings.get(i).length() + strings.get(i- 1).length() + strings.get(i-2).length();
            if(cur > max) max = cur;
        }
        return max;
    }


}
