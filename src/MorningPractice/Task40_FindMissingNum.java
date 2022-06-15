package MorningPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task40_FindMissingNum {
    public static void main(String[] args) {
        int [] r = {-1,3,5,6,8,67,80};
        System.out.println("findMissingNums(r) = " + findMissingNums(r));
    }

    public static ArrayList<Integer> findMissingNums(int [] arr){
        Arrays.sort(arr);
        ArrayList<Integer> oldList = new ArrayList<>();
        for (int j : arr){
            oldList.add(j);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = arr[0]; i < arr[arr.length-1] ; i++) {
            if (!oldList.contains(i)){
                list.add(arr[i]);
            }
        }
        return list;
    }

}
