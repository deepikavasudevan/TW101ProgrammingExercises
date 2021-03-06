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

        System.out.println("\nEnter the value of N");
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            n=Integer.parseInt(br.readLine());
        }
        catch (IOException ioe) {
            System.out.println("ERROR in input: "+ioe);
        }

        return n;
    }

<<<<<<< HEAD
    boolean validateN(int n) {

        boolean validN=false;

        if (n<=0) {
            System.out.println ("Invalid Input");
=======
    void printHorizontalAsterisxs(int n) {
        System.out.println("\n------PRINTING N ASTERISXS HORIZONTALLY------\n");
        if (n<=0){
            System.out.println("Invalid Input");
            System.exit(0);
>>>>>>> eb02ae832daeae9e98136ef7f89fd0e4d8577d2a
        }
        else
            validN=true;
    return validN;
    }

    void printHorizontalAsterisxs(int n) {
        System.out.println("\n------PRINTING N ASTERISXS HORIZONTALLY------\n");

        for (int noOfAsterisks=1;noOfAsterisks<=n;noOfAsterisks++) {
            System.out.print ("*");
        }

        System.out.println();
    }

    void printVerticalAsterisks(int n) {
        System.out.println("\n------PRINTING N ASTERISKS VERTICALLY------\n");

            for (int noOfAsterisks=1;noOfAsterisks<=n;noOfAsterisks++) {
                System.out.println ("*");
        }
    }

    void printRightAngledTriangleAsterisks(int n) {
        System.out.println ("\n------PRINTING RIGHT ANGLED TRIANGLE OF ASTERISKS------\n");

            for (int noOfLines=1;noOfLines<=n;noOfLines++) {
                for (int noOfAsterisks=1;noOfAsterisks<=noOfLines;noOfAsterisks++) {
                    System.out.print ("* ");
                }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        TriangleExercises te1=new TriangleExercises();
        boolean check;

        te1.printOneAsterisx();

        int n=te1.getNumberOfAsterisx();
        check=te1.validateN(n);
        if (check)
            te1.printHorizontalAsterisxs(n);

        n=te1.getNumberOfAsterisx();
        check=te1.validateN(n);
        if (check)
            te1.printVerticalAsterisks(n);

        n=te1.getNumberOfAsterisx();
        check=te1.validateN(n);
        if (check)
            te1.printRightAngledTriangleAsterisks(n);
    }
}
