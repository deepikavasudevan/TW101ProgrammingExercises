/**
 * Created by vdeepika on 06/08/15.
 */
public class PrimeFactorsExercise {

    int divideByTwo(int n) {

        while (n%2==0) {
            n=n/2;
            System.out.print("2,");
        }
    return n;
    }

    void divideByOddPrimes(int n, int originalN) {

        for (int oddNumber=3;oddNumber<=Math.sqrt(originalN); oddNumber+=2) {

            while (n%oddNumber==0) {
                n=n/oddNumber;
                System.out.print(oddNumber+",");
            }
        }
    }

    void generate (int n){
        PrimeFactorsExercise tempPfe=new PrimeFactorsExercise();

        int tempN=tempPfe.divideByTwo(n);

        if (tempN!=1)
            tempPfe.divideByOddPrimes(tempN,n);
    }

    public static void main(String[] args) {
        PrimeFactorsExercise pfe1=new PrimeFactorsExercise();
        pfe1.generate(315);
    }
}
