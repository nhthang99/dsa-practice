package com.hcmut.nhthang.sort;

import java.util.ArrayList;

public class Shell<T> extends Utils<T> implements Sort<T>{
    @Override
    public ArrayList<T> sort(ArrayList<T> array) {
        int n = array.size();
        for (int gap = n / 2; gap > 0; gap /= 2){
            for (int i = gap; i < n; ++i){
                T key = array.get(i);
                int j = i;
                while (j >= gap && compareTo(array.get(j - gap), key) > 0){
                    exchange(j - gap, j, array);
                    j -= gap;
                }
            }
        }
        return array;
    }
}