package com.hcmut.nhthang.sort;

import java.util.ArrayList;

public class Utils<T> {

    protected int compareTo(T a, T b) {
        if (a instanceof Number && b instanceof Number) {
            Double num1 = Double.parseDouble(a.toString());
            Double num2 = Double.parseDouble(b.toString());
            if (num1 > num2)
                return 1;
            else if (num1 < num2)
                return -1;
            else
                return 0;
        }
        return Integer.MIN_VALUE;
    }

    protected void exchange(int idx, int idx2, ArrayList<T> array) {
        T temp = array.get(idx);
        array.set(idx, array.get(idx2));
        array.set(idx2, temp);
    }

}
