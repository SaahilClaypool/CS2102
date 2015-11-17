/**
 * Created by Saahil on 11/2/2015.
 */
import  tester.*;
public class LinearEq {


    public static double[] solve(double[][] mat) {
        triangleArray(mat);
        //now triangle array, solve bottom up
        //solving: start at last row, move top to bottom and fill in values
        double[] results = new double[mat.length];
        for (int r = mat.length - 1; r > -1; r--) {
            // coef is at col = r, result is length - 1
            for (int i = r + 1; i < mat[r].length - 1; i++) {
                mat[r][mat[r].length - 1] -= mat[r][i];
            }
            results[r] = mat[r][mat[0].length - 1] / mat[r][r];
            for (int up = r - 1; up > -1; up--) {
                mat[up][r] = mat[up][r] * results[r];
            }
        }
        return results;
    }
    public static double[][] multiply(double[][] A , double[][]B)  {
        if(A[0].length != B.length)
        {
            System.out.println("YOU IDIOT xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        }
        double[][] C = new double[A.length][B[0].length];
        for (int row = 0; row < A.length; row++) {
            for (int colB = 0; colB < B[0].length ; colB++) {
                for (int i = 0; i < A[0].length ; i++) {
                    C[row][colB] += A[row][i] * B[i][colB];
                }
            }

        }
        return C;
    }
    public static double[][] triangleArray(double[][] mat) {
        mat = mat; // put copy here
        for (int r = 0; r < mat.length; r++) {
            //elimate mat[r][r-1]
            // ratio of coeff = - r / r-1
            //double ratio = -1. * mat[r][r-1] / mat[r-1][r-1];

            for (int r2 = r + 1; r2 < mat.length; r2++) {
                double ratio = -1. * mat[r2][r] / mat[r][r];
                for (int c = r; c < mat[0].length; c++) {
                    mat[r2][c] = mat[r2][c] + mat[r][c] * ratio;
                }
            }
        }
        return mat;
    }

    public static void printArray(double[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.printf(" %f , ", ar[i][j]);

            }
            System.out.println("");
        }
        System.out.println("\n\n\n");
    }

    public static void printSingleAr(double[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i]);
        }
        System.out.println("");
    }

}

/*
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
            System.out.println(" ");
        }
        System.out.println("OVER VOER OVER \n\n");
        LinearEq.triangleArray(test);
        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test[0].length; j++)
            {
                System.out.printf(" %f , " , test[i][j]);

            }
            System.out.println("");
        }

        double[][] simple = {{1 , 1 ,2} , {-1, 1, 0}};
        LinearEq.printSingleAr(LinearEq.solve(simple));


        double[][] Complex = {{1 , 1 ,2} , {-1, 1, 0}};
        LinearEq.printSingleAr(LinearEq.solve(simple));


        double[][] rand  = {{1 , 1 ,2} , {-1, 1, 0}};
        LinearEq.printSingleAr(LinearEq.solve(simple));
    }
}
//x + y =2
//-x + y = 0

*/