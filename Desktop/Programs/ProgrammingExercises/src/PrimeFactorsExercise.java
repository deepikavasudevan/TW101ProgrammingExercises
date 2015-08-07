/**
 * Created by vdeepika on 06/08/15.
 */
public class PrimeFactorsExercise {


    void generate (int n){

        while (n%2==0) {
            n=n/2;
            System.out.println("2");
        }



    }

    public static void main(String[] args) {
        PrimeFactorsExercise pfe1=new PrimeFactorsExercise();
        pfe1.generate(30);
    }
}
