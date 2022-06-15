package Festine;

public class MyTask {

    /*
    Write a method that can divide two numbers without using division operator
     */
    public static void main(String[] args) {
        System.out.println(divideWithoutOperator(6,0));
    }

    public static int divideWithoutOperator(int a, int b){


        int count = 0;

        if (a>b && b !=0){
            while (a>=b){
                a = a-b;
                count++;
            }
        }else {
            System.out.println("You cannot divide by zero");
            return -1;
        }
        return count;
    }
}
