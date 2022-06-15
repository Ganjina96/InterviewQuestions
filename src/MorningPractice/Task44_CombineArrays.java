package MorningPractice;

import java.util.ArrayList;

public class Task44_CombineArrays {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        System.out.println("combineArrays(a,b) = " + combineArrays(a, b));
    }

    public static ArrayList<Integer> combineArrays (int [] a, int [] b){
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            output.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            output.add(b[i]);
        }
        return output;
    }
}
