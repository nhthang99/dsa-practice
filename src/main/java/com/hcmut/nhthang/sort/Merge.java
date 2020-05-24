package com.hcmut.nhthang.sort;

import java.util.ArrayList;

public class Merge<T> extends Utils<T> implements Sort<T> {

    @Override
    public ArrayList<T> sort(ArrayList<T> array) {
        mergeSort(array, 0, array.size() - 1);
        return array;
    }

    private void mergeSort(ArrayList<T> array, int left, int right) {
        if (left < right) {
            int middle = (right + left) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    private void merge(ArrayList<T> array, int left, int middle, int right) {
        // sizes of two subarray to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // copy subarray into temp arrays
        ArrayList<T> L = new ArrayList<T>();
        ArrayList<T> R = new ArrayList<T>();

        for (int i = 0; i < n1; i++) {
            L.add(array.get(left + i));
        }

        for (int i = 0; i < n2; i++) {
            R.add(array.get(middle + 1 + i));
        }

        // Merge temp arrays

        // Initial indexes of first and second subarrays

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (compareTo(L.get(i), R.get(j)) <= 0) {
                array.set(k, L.get(i));
                i++;
            } else {
                array.set(k, R.get(j));
                j++;
            }
            k++;
        }

        // Copy remaining array of L if any
        while (i < n1) {
            array.set(k, L.get(i));
            i++;
            k++;
        }

        // Copy remaining array of R if any
        while (j < n2) {
            array.set(k, R.get(j));
            j++;
            k++;
        }
    }

}