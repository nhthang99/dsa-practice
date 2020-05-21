package com.hcmut.nhthang.sort;

import java.util.ArrayList;

public class Quick<T> extends Utils<T> implements Sort<T>{
    @Override
    public ArrayList<T> sort(ArrayList<T> array) {
        int length = array.size();
        int left = 0;

        return quickSort(array, left, length - 1);
    }

    private ArrayList<T> quickSort(ArrayList<T> array, int left, int right) {
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
        return array;
    }

    // private ArrayList<T> quickSort(ArrayList<T> array, int left, int right) {
    //     int i = left, j = right;
    //     // Get the pivot element from the middle of the list
    //     T pivot = array.get(left + (right-left)/2);

    //     // Divide into two lists
    //     while (i <= j) {
    //         // If the current value from the left list is smaller than the pivot
    //         // element then get the next element from the left list
    //         while (compareTo(array.get(i), pivot) < 0) {
    //             i++;
    //         }
    //         // If the current value from the right list is larger than the pivot
    //         // element then get the next element from the right list
    //         while (compareTo(array.get(j), pivot) > 0) {
    //             j--;
    //         }

    //         // If we have found a value in the left list which is larger than
    //         // the pivot element and if we have found a value in the right list
    //         // which is smaller than the pivot element then we exchange the
    //         // values.
    //         // As we are done we can increase i and j
    //         if (i <= j) {
    //             exchange(i, j, array);
    //             i++;
    //             j--;
    //         }
    //     }
    //     // Recursion
    //     if (left < j)
    //         quickSort(array, left, j);
    //     if (i < right)
    //         quickSort(array, i, right);

    //     return array;
    // }
}