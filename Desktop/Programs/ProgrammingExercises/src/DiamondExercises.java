import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vdeepika on 06/08/15.
 */
class DiamondExercises {

    int getValueOfN()
    {
        int n=-1;
        System.out.println ("Enter value of N");

        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            n=Integer.parseInt(br.readLine());
        }
        catch (IOException ioe) {
            System.out.println ("ERROR: "+ioe);
        }
      return n;
    }

    void printsIsoscelesTriangle (int n) {
        System.out.println ("\n------PRINTING ISOSCELES TRIANGLE OF ASTERISKS------\n");

        if (n<=0) {
            System.out.println("Invalid Input");
        }
        else
        for (int i=1;i<=n;i++) {

            //prints the spaces
            for (int j=n;j>i;j--) {
                System.out.print(" ");
            }

            //prints the asterisks
            for (int k=1;k<=(2*i-1);k++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        DiamondExercises de1=new DiamondExercises();

        int n=de1.getValueOfN();
        de1.printsIsoscelesTriangle(n);
    }
}