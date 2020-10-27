package com.example.lab1;

public class MinMaxClass {

    public static int max(int ... val){
        int max = val[0];
        for (int i : val)
            if (i > max)
                max = i;
        return  max;
    }

    public static int min(int ... val){
        int min = val[0];
        for (int i : val)
            if (i < min)
                min = i;
        return  min;
    }
}
