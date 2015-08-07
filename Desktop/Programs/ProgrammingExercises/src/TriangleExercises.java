import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vdeepika on 06/08/15.
 */
class TriangleExercises {

    void printOneAsterisx() {

        System.out.println("\n------PRINTING ONE ASTERISX------\n");
        System.out.println("*");
    }

    int getNumberOfAsterisx() {
        int n=0;

        System.out.println("\nEnter the number of asterisks to be printed");
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            n=Integer.parseInt(br.readLine());
        }
        catch (IOException ioe) {
            System.out.println("ERROR in input: "+ioe);
        }

        return n;
    }

    void printHorizontalAsterisxs(int n) {
        System.out.println("\n------PRINTING N ASTERISXS HORIZONTALLY------\n");
        if (n<=0){
            System.out.println("Invalid Input");
        }
        else
        for (int i=1;i<=n;i++) {
            System.out.print ("*");
        }

        System.out.println();
    }

    void printVerticalAsterisks(int n) {
        System.out.println("\n------PRINTING N ASTERISKS VERTICALLY------\n");

        if (n<=0) {
            System.out.println("Invalid Input");
        }
        else {
            for (int i=1;i<=n;i++) {
                System.out.println ("*");
            }
        }
    }

    void printRightAngledTriangleAsterisks(int n) {
        System.out.println ("\n------PRINTING RIGHT ANGLED TRIANGLE OF ASTERISKS------\n");

        if (n<=0) {
            System.out.println ("Invalid Input");
        }
        else {
            for (int i=1;i<=n;i++) {
                for (int j=1;j<=i;j++) {
                    System.out.print ("* ");
                }
            System.out.println();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        TriangleExercises te1=new TriangleExercises();

        te1.printOneAsterisx();

        int n=te1.getNumberOfAsterisx();
        te1.printHorizontalAsterisxs(n);

        n=te1.getNumberOfAsterisx();
        te1.printVerticalAsterisks(n);

        n=te1.getNumberOfAsterisx();
        te1.printRightAngledTriangleAsterisks(n);
    }
}
