import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vdeepika on 06/08/15.
 */
public class PrimeFactorsExercise {

    String primeFactorsOfN="";

    int getValueOfN() {
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

    boolean validateN(int n) {

        boolean validN=false;

        if (n<=1) {
            System.exit(0);
        }
        else
            validN=true;

        return validN;
    }

    int divideByTwo(int n) {

        while (n%2==0) {
            n=n/2;
            primeFactorsOfN+="2,";
        }
    return n;
    }

    void divideByOddPrimes(int n, int originalN) {

        for (int oddNumber=3;oddNumber<=Math.sqrt(originalN); oddNumber+=2) {

            while (n%oddNumber==0) {
                n=n/oddNumber;
                primeFactorsOfN+=oddNumber+",";
            }
        }
    }

    void removeCommaAndPrintFactors() {

        primeFactorsOfN=primeFactorsOfN.substring(0,primeFactorsOfN.length()-1);

        System.out.println(primeFactorsOfN);
    }

    void generate (int n){
        PrimeFactorsExercise tempPfe=new PrimeFactorsExercise();

        int tempN=tempPfe.divideByTwo(n);

        if (tempN!=1) {
            tempPfe.divideByOddPrimes(tempN, n);
            tempPfe.removeCommaAndPrintFactors();
        }
        else {
            tempPfe.removeCommaAndPrintFactors();
        }
    }

    public static void main(String[] args) {
        PrimeFactorsExercise pfe1=new PrimeFactorsExercise();
        int n=pfe1.getValueOfN();

        boolean check=pfe1.validateN(n);

        if (check) {
            pfe1.generate(n);
        }
    }
}
