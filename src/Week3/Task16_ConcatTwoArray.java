package Week3;

import java.util.Arrays;

public class Task16_ConcatTwoArray {
    public static void main(String[] args) {

        /*
        16) Array - Concat two arrays
Write a return method that can concatenate (merge) two arrays
         */

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7,8,};

        System.out.println(Arrays.toString(concatArrays(arr1,arr2)));
    }

    public static int [] concatArrays(int [] arr1, int [] arr2){

        int length = arr1.length + arr2.length;
        int [] result = new int[length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[index] = arr1[i];
            index++;

        }
        for (int i = 0; i < arr2.length; i++) {
            result[index] = arr2[i];
            index++;

        }
        return result;


    }
}
