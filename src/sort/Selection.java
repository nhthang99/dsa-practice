package sort;

import sort.Sort;

import java.util.ArrayList;

import sort.Utils;

public class Selection<T> extends Utils<T> implements Sort<T> {

    @Override
    public ArrayList<T> sort(ArrayList<T> array) {
        for (int i = 0; i < array.size(); ++i){
            int minIdx = i;
            for (int j = i + 1; j < array.size(); ++j){
                if (compareTo(array.get(j), array.get(minIdx)) == -1)
                    minIdx = j;
            }
            exchange(i, minIdx, array);
        }
        return array;
    }
}