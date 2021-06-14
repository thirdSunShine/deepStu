package com.example.demo.processordDemo.datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FindMinNumInArray {
    public static void main(String[] args) {
        Integer[] arrays = new Integer[10];
        for (int i = 0 ; i < 10; i++){
            arrays[i] = new Random().nextInt(10);
        }
        int min = findMinNumInArray(arrays);
        System.out.println(min);
    }

    private static int findMinNumInArray(Integer[] arrays) {
        List<Integer> ints = Arrays.asList(arrays);
        System.out.println("original array:" + ints);
        int temp = arrays[0];
        for (int i = 1 ;i<arrays.length;i++){
            if (arrays[i] < temp){
                temp = arrays[i];
            }
        }
        return temp;
    }


}
