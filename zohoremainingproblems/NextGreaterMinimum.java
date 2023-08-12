package zohoremainingproblems;

import java.util.Stack;

public class NextGreaterMinimum {
    public static int[] nextGreaterMinimum(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,7,1,8,5,11};
        int[] result = nextGreaterMinimum(arr);

        System.out.println("Element\tNext Greater Minimum");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t\t" + result[i]);
        }
    }
}

