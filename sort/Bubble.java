package sort;

import java.util.ArrayList;

public class Bubble<T> extends Calculator<T> implements Sort<T> {

    @Override
    public ArrayList<T> sort(ArrayList<T> array) {
        for(int i = 0; i < array.size(); ++i){
            for (int j = i + 1; j < array.size() - i; ++j){
                if (compareTo(array.get(j - 1), array.get(j)) == 1)
                    exchange(j - 1, j, array);
            }
        }
        return array;
    }
}