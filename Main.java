import collections.*;

public class Main {
    public static void main(final String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Integer[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < list.length; i++){
            stack.push(list[i]);
        }
        System.out.println(stack.peek());
        System.out.println(stack.length());
    }
}