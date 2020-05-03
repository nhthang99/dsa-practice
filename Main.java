import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(final String[] args) {
        final Bag<Integer> stack = new Bag<Integer>();

        final ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (final Integer i : intList) {
            stack.push(i);
        }

        final Iterator iterator = stack.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // while (!stack.isEmpty()) {
        //     Integer node = stack.pop();
        //     System.out.println(node);
        // }
    }
}