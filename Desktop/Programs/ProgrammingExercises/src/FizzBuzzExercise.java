/**
 * Created by vdeepika on 06/08/15.
 */
public class FizzBuzzExercise {

    int checkDivisibilityByThree(int n) {
        if ((n%3)==0) {
            return 1;
        }
    return 0;
    }

    int checkDivisibilityByFive (int n) {
        if ((n%5)==0) {
            return 1;
        }
     return 0;
    }

    void FizzBuzz() {
        FizzBuzzExercise fbeTemp=new FizzBuzzExercise();

        for (int i=1;i<=100;i++)
        {
            if ((fbeTemp.checkDivisibilityByThree(i)==1) && (fbeTemp.checkDivisibilityByFive(i)==1))
                System.out.println("FizzBuzz");
            else
            if (fbeTemp.checkDivisibilityByThree(i)==1)
                System.out.println("Fizz");
            else
                if (fbeTemp.checkDivisibilityByFive(i)==1)
                    System.out.println("Buzz");
                    else
                        System.out.println(i);
        }
    }

    public static void main(String[] args) {
        FizzBuzzExercise fbe1=new FizzBuzzExercise();
        fbe1.FizzBuzz();
    }

}
