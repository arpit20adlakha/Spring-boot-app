package util;

import java.util.*;

public class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack();
//        String.valueOf(false);


        for (char c: s.toCharArray()) {
            if (stack.peek().ch == c) {
                stack.push(new Pair(stack.peek().count + 1, c));
            } else {
                stack.push(new Pair(1, c));
            }

            if (stack.peek().count == k) {
                for(int i = 0; i < k; i++) {
                    stack.pop();
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        while(!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        return builder.reverse().toString();

    }

    class Pair {
        int count;
        char ch;

        public Pair(int count, char c) {
            this.count = count;
            this.ch = c;
        }
    }

    public static void main(String[] args) {

        int[][] matrix = { {1, 2, 4}, {5, 6, 6}};

        int[][] mat = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            mat[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }

        for (int i= 0; i < mat.length; i++) {
            for(int j = 0; j< mat[0].length; j++)
                System.out.println(mat[i][j]);
        }


        String s = "leetcode";
        Map<Character, Integer> set = new LinkedHashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            if (set.get(c) != null) {
                set.remove(c);
            } else {
                set.put(c, 0);
            }
        }
        set.values().stream().findFirst().get();


//        char ch = '5';
//        int ch2 = 6;
//        System.out.printf("Marks for my assignment is %d%d",ch, ch2);
//        boolean a = Boolean.parseBoolean("input");
//        System.out.printf("Value is %.2f '%'", 4f);
    }
}
