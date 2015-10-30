import tester.Tester;

/**
 * Created by Saahil on 10/29/2015.
 */
public class MathTests {


    public static int add (int x , int y)
    {
        return x + y;
    }


        static Examples E = new Examples () ;

        public static void main(String[] args) {
            Tester.runFullReport (E); ;
        }


}
