package Week4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task27_ArrayList_SortingInAscending {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,1,10,4,1));
        System.out.println(sortInAscending(list));
    }

    /*
    Write a method that can sort the ArrayList in Ascending order without using the sort method
     */

    public static ArrayList<Integer> sortInAscending(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) > list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
    }
}
