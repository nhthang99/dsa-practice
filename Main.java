import java.util.Iterator;
import collections.*;

public class Main {
    public static void main(final String[] args) {
        final Queue<String> queue = new Queue<String>();
        final String str = "it was - the best - of times - - - it was -- the - -";
        for (String word : str.split(" ")) {
            if (!word.contains("-"))
                queue.push(word);
        }

        String sequence = "";
        while (!queue.isEmpty()) {
            String word = queue.pop();
            sequence += word + " ";
        }

        System.out.println(sequence);
    }
}