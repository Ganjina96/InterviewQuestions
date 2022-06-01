package Week3;

import java.util.Arrays;

public class Task15_MoveZeroesToEnd {
    public static void main(String[] args) {

        /*
        15) Array - Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]

         */

        int [] arr = {1,0,2,0,3,0,4,0};

        System.out.println(Arrays.toString(moveZeroesToEnd(arr)));
    }

    public static int[] moveZeroesToEnd(int [] arr){
        int [] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < result.length; i++) {
            if (arr[i] != 0){
                result[index] = arr[i];
                index++;
            }

        }
        return result;
    }
}
