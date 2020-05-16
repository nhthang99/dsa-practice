package com.hcmut.nhthang.sort;

import java.util.ArrayList;

public class Insertion<T> extends Utils<T> implements Sort<T> {

	@Override
	public ArrayList<T> sort(ArrayList<T> array) {
		for (int i = 1; i < array.size(); ++i){
            T key = array.get(i);
            int j = i - 1;
            while (j >= 0 && compareTo(array.get(j), key) == 1){
                array.set(j + 1, array.get(j));
                j -= 1;
            }
            array.set(j + 1, key);
        }
        return array;
	}

}
