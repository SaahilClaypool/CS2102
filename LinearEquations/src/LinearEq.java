/**
 * Created by Saahil on 11/2/2015.
 */
import  tester.*;
public class LinearEq {


    public static double[][] solve(double [][]mat)
    {
        mat = mat; // put copy here
        for(int r = 0; r<mat.length;r++)
        {
            //elimate mat[r][r-1]
            // ratio of coeff = - r / r-1
            //double ratio = -1. * mat[r][r-1] / mat[r-1][r-1];

            for(int r2 = r+1 ; r2<mat.length; r2++)
            {
                double ratio = -1. * mat[r2][r] / mat[r][r];
                for(int c = r; c < mat[0].length; c++)
                {
                    mat[r2][c] = mat[r2][c] + mat[r][c] * ratio;
                }
            }
        }
        return mat;
    }

    public static void printArray (double[][] ar)
    {
        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[0].length; j++)
            {
                System.out.printf(" %f , " , ar[i][j]);

            }
            System.out.println("");
        }
        System.out.println("\n\n\n");
    }
    public static void main (String[] arsg)
    {
        Examples e = new Examples();
        Tester.run(e);

        double[][] test = {{1 , 2 , 3 ,4} , {-1, 2,3 ,4} ,{2,3,2,4}};
        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test[0].length; j++)
            {
                System.out.printf(" %f , " , test[i][j]);

            }
            System.out.println("");
        }
        System.out.println("OVER VOER OVER \n\n");
        LinearEq.solve(test);
        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test[0].length; j++)
            {
                System.out.printf(" %f , " , test[i][j]);

            }
            System.out.println("");
        }
    }
}
