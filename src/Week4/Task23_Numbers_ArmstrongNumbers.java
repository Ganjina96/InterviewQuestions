package Week4;

public class Task23_Numbers_ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(isArmstrong(1634));

    }

    /*
    Write a method that can check if a number is Armstrong  number
     */

    public static boolean isArmstrongDynamic(int num){
        //for all nums
        String [] arr = String.valueOf(num).split("");
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            int multiply = 1;
            for(int j = 0; j < arr.length; j++){
                multiply *= Integer.parseInt(arr[i]);
            }
            sum += multiply;
        }

        return num == sum;
    }


    public static boolean isArmstrong(int n){
        int sumOfCubes = 0;
        int rem = 0;
        int temp = n;

        while (n > 0){
            rem = n % 10; // returns last number of the n
            sumOfCubes += (rem * rem * rem);
            n /= 10;

        }
        return sumOfCubes == temp;
    }
}
