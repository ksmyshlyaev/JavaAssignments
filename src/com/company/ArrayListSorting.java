package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {
/*
* method abc should accept varargs of strings, put them into ArrayList structure, sort values, delete duplicates and
* print result */
    private static void abc(String ... strings){
        ArrayList<String> newStringArrayList = new ArrayList<>();
        for (String s : strings){
            if (!newStringArrayList.contains(s)) {
                newStringArrayList.add(s);
            }
        }
        Collections.sort(newStringArrayList);
        System.out.println(newStringArrayList);
    }

    public static void main(String[] args) {
        abc("STU", "ABC", "ABC", "MNO", "ABC", "ABC", "XYZ", "STU", "GHI", "DEF", "JKL", "PQR","STU", "JKL");
    }
}
