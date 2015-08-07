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
        for (int noOfLines=1;noOfLines<=n;noOfLines++) {

            for (int noOfSpaces=n;noOfSpaces>noOfLines;noOfSpaces--) {
                System.out.print(" ");
            }

            for (int noOfAsterisks=1;noOfAsterisks<=(2*noOfLines-1);noOfAsterisks++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

    void printDownwardIsoscelesTriangle(int n) {

        for (int noOfLines=n;noOfLines>=1;noOfLines--) {
            for (int noOfSpaces=(n+1);noOfSpaces>noOfLines;noOfSpaces--) {
                System.out.print(" ");
            }

            for (int noOfAsterisks=1; noOfAsterisks<=(2*noOfLines-1); noOfAsterisks++) {
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

    void printIsoscelesTriangleWithName (int n) {
        if (n<=0) {
            System.out.println("Invalid Input");
        }
        else
            for (int noOfLines=1;noOfLines<n;noOfLines++) {

                for (int noOfSpaces=n;noOfSpaces>noOfLines;noOfSpaces--) {
                    System.out.print(" ");
                }

                for (int noOfAsterisks=1;noOfAsterisks<=(2*noOfLines-1);noOfAsterisks++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        System.out.println ("Deepika");
    }

    void printCenteredDiamondWithName (int n) {
        DiamondExercises deTemp=new DiamondExercises();

        deTemp.printIsoscelesTriangleWithName(n);
        deTemp.printDownwardIsoscelesTriangle(n-1);
    }

    public static void main(String[] args) {
        DiamondExercises de1=new DiamondExercises();

        System.out.println ("\n------PRINTING ISOSCELES TRIANGLE OF ASTERISKS------\n");
        int n=de1.getValueOfN();
        de1.printIsoscelesTriangle(n);

        System.out.println ("\n------PRINTING CENTERED DIAMOND------\n");
        n=de1.getValueOfN();
        de1.printCenteredDiamond(n);

        System.out.println("\n------PRINTING CENTERED DIAMOND WITH NAME------\n");
        n=de1.getValueOfN();
        de1.printCenteredDiamondWithName(n);
    }
}