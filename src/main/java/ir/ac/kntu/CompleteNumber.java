package ir.ac.kntu;

public class CompleteNumber {
    public static void main(String[] args) {
        for (int i = 1; i <=10000 ; i++) {
            if (isComplete(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isComplete(int number){
        int sumOfNumerator = 0;
        for (int i = 1; i < number; i++) {
            if (number%i == 0 && number != i){
                sumOfNumerator +=i;
            }
        }
        return sumOfNumerator == number;
    }
}
