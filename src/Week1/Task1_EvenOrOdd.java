package Week1;

public class Task1_EvenOrOdd {

    /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */

    public static void main(String[] args) {

        System.out.println(EvenOrOdd(5));
        System.out.println(EvenOrOdd(6));
    }

    public static String EvenOrOdd(int num){

        return num % 2 == 0 ? "Even" : "Odd";
    }
}


