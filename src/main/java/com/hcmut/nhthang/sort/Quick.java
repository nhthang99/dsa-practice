package com.hcmut.nhthang.sort;

import java.util.ArrayList;

public class Quick<T> extends Utils<T> implements Sort<T>{
    @Override
    public ArrayList<T> sort(ArrayList<T> array) {
        int length = array.size();
        int left = 0;

        quickSort(array, left, length - 1);

        return array;
    }

    private void quickSort(ArrayList<T> array, int left, int right) {
        T pivot = array.get(left + (right - left) / 2);
        int i = left;
        int j = right;
        while (i <= j) {
            while (compareTo(array.get(i), pivot) < 0)
                i++;

            while (compareTo(array.get(j), pivot) > 0)
                j--;

            if (i <= j) {
                exchange(i, j, array);
                i++;
                j--;
            }
        }

        // Recursion
        if (left < j)
            quickSort(array, left, j);
        if (i < right)
            quickSort(array, i, right);
    }

}