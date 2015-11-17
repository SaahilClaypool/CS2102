import java.util.Scanner;

public class UI{
    private interface functions {
        public void promptInput (double[][] a);
    }


    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        System.out.println("what do you want to do? \n (1) Mult \n (2) Solve");
        int choice  = c.nextInt();
       if(choice == 1)
            multiply();
        else solveStuff();

    }
    public static void multiply()
    {
        Scanner c = new Scanner(System.in);

        System.out.println("enter dimensions");
        System.out.println("A");
        System.out.println("Rows");
        int R1 = c.nextInt();
        System.out.println("Cols");
        int C1 = c.nextInt();
        System.out.println("B");
        System.out.println("Rows");
        int R2 = c.nextInt();
        System.out.println("Cols");
        int C2 = c.nextInt();


        double[][] a = new double[R1][C1];
        double[][] b = new double[R2][C2];
        System.out.println("Enter Matrix A");
        for (int rows = 0; rows < R1; rows++) {
            for (int cols = 0; cols < C1; cols++) {
                System.out.printf("enter a number for row %d and col %d \n" , rows, cols);
                a[rows][cols] = c.nextDouble();
                System.out.println();
            }
        }
        System.out.println("Enter Matrix B");
        for (int rows = 0; rows < R2; rows++) {
            for (int cols = 0; cols < C2; cols++) {
                System.out.printf("enter a number for row %d and col %d \n" , rows, cols);
                b[rows][cols] = c.nextDouble();

            }
        }

        LinearEq.printArray(LinearEq.multiply(a,b));
    }

    public static void solveStuff()
    {
        System.out.println("Enter a number of vars");
        Scanner c = new Scanner(System.in);
        int num = c.nextInt();
        for (int i = 0; i < num ; i++) {
            System.out.printf("%cX%d + ", (char)(65 + i) , i);
        }
        System.out.println(" = ?");
        double[][] array = new double[num][num+1];
        for (int i = 0; i < num; i++) {
            System.out.printf("Enter an equation:  ");
            for (int a = 0; a < num ; a++) {
                System.out.printf("%cX%d + ", (char)(65 + a) , a);
            }
            System.out.println("");
            for (int j = 0; j < num +1; j++) {
                if(j == num)
                    System.out.printf("equals \n");
                else
                    System.out.printf("%c = ? \n",(char)(65 + j));
                array[i][j] = c.nextDouble();
            }
        }
        System.out.println(arrayToString(array));

        double[] solved = LinearEq.solve(array);
       System.out.println( solvedToString(solved));

    }
    public static String arrayToString (double[][] ar)
    {
        String s = "";
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if(j == ar.length)
                    s+=String.format(" = %f" , ar[i][j]);
                else
                    s+= String.format("%f * x%d +",ar[i][j], j);
            }
            s+="\n";

        }
        return s;
    }
    public static String solvedToString (double[] answer)
    {
        String s = "";
        for (int i = 0; i < answer.length ; i++) {
            s+= String.format("x%d = %f \n", i,answer[i]);

        }
        return s;
    }
}