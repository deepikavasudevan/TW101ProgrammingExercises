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

    void printIsoscelesTriangle (int n) {

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

    void printDownwardIsoscelesTriangle(int n) {

        for (int i=n;i>=1;i--) {
            //print the spaces
            for (int j=(n+1);j>i;j--) {
                System.out.print(" ");
            }

            //print the asterisks
            for (int k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

    void printCenteredDiamond (int n) {

        DiamondExercises deTemp=new DiamondExercises();
        deTemp.printIsoscelesTriangle(n);

        deTemp.printDownwardIsoscelesTriangle(n-1);

    }

    void printCenteredDiamondWithName (int n) {
        DiamondExercises deTemp=new DiamondExercises();
        if (n<=0) {
            System.out.println("Invalid Input");
        }
        else
            for (int i=1;i<n;i++) {

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

        System.out.println ("Deepika");

        deTemp.printDownwardIsoscelesTriangle(n-1);
    }

    public static void main(String[] args) {
        DiamondExercises de1=new DiamondExercises();

        //prints an Isosceles Triangle of n lines containing asterisks
        System.out.println ("\n------PRINTING ISOSCELES TRIANGLE OF ASTERISKS------\n");
        int n=de1.getValueOfN();
        de1.printIsoscelesTriangle(n);

        //prints Centered Diamond for given value of n
        System.out.println ("\n------PRINTING CENTERED DIAMOND------\n");
        n=de1.getValueOfN();
        de1.printCenteredDiamond(n);

        //prints Centered Diamond with a name in the middle line
        System.out.println("\n------PRINTING CENTERED DIAMOND WITH NAME------\n");
        n=de1.getValueOfN();
        de1.printCenteredDiamondWithName(n);
    }
}