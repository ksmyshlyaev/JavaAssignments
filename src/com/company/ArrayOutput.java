package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* Create abc method which accepts the N number of String arrays. In abc method create new array (?) which contains all
* elements of input arrays. In main method assign to null all elements of abc method that equal to cmd line args.
* Print elements of the renewed array */
public class ArrayOutput {
    private static List<String> abc(String[] ... arrays){
        List<String> list = new ArrayList<>();
        for (String[] array: arrays){
            list.addAll(Arrays.asList(array));
        }
        return list;
    }

    public static void main(String[] args) {
    String[] array1 = {"Brave", "new", "world"};
    String[] array2 = {"This", "is", "my", "horse"};
    List<String> resultList = abc(array1, array2);
        if (args.length == 0){
            System.out.println("args is empty");
        }
        else {
            int i;
            for (i = 0; i < args.length; i++) {
                resultList.remove(args[i]);
            }
            System.out.println(resultList);
        }
    }
}
