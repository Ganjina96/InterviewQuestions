package Festine;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyTask1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("Ahmedov", "John", "Eric", "Ahmed", "Ganjina", "Ahmed"));
        System.out.println("removeAhmed(list) = " + removeAhmed(list));
    }

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */

    public static ArrayList<String> removeAhmed(ArrayList<String> list){

        Iterator <String> iterator = list.iterator();

        while(iterator.hasNext()){
            if (iterator.next().equals("Ahmed")){
                iterator.remove();
            }
        }
        return list;
    }
}
