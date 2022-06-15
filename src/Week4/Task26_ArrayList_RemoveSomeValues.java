package Week4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task26_ArrayList_RemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,6,120,134,5,10,500));
        System.out.println(removeBigNums(list));
    }

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static ArrayList<Integer> removeBigNums(ArrayList<Integer> list){

        list.removeIf(n -> n>100);
        return list;
    }
}
