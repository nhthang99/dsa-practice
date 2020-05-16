import java.util.ArrayList;

import collections.*;
import sort.Insertion;
import sort.Selection;
import sort.Bubble;

public class Main {

	public static void main(final String[] args) {
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(1.1);
        array.add(1.3);
        array.add(1.21);
        array.add(1.131312);
        array.add(1.434423);

        // ArrayList<Double> sort = new Selection<Double>().sort(array);
        // ArrayList<Double> sort = new Insertion<Double>().sort(array);
        ArrayList<Double> sort = new Bubble<Double>().sort(array);
        for (Double num : sort){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}