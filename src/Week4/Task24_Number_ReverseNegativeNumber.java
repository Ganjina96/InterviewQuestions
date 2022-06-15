package Week4;

public class Task24_Number_ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNeg(-123));

    }

    /*
    Write a return method that can reverse negative number and return it as int
     */

    public static int reverseNeg(int n){

        if(n < 0){
            String str = Integer.toString(n);
            String reversed = str.substring(0,1);

            for (int i = str.length()-1; i >= 1; i--) {
                reversed += str.charAt(i);
            }
            return Integer.parseInt(reversed);
        }
        return -1;
    }
}
