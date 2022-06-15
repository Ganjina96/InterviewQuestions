package Week4;

public class Task22_Numbers_PrimeNumber {

    /*
    Write a method that can check if a number is prime or not
     */
    public static void main(String[] args) {
        System.out.println("isPrime(5) = " + isPrime(5));
    }

    public static boolean isPrime(int n){

        if(n == 0 || n == 1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


}
