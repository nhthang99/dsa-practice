import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(Integer i : intList){
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            Integer node = stack.pop();
            System.out.println(node);
        }
    }
}