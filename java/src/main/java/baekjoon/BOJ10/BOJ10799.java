package baekjoon.BOJ10;

import java.io.*;
import java.util.*;

public class BOJ10799 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("");

        Deque<String> stack = new ArrayDeque<>();
        int result = 0;
        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            if (input.equals("(")) {
                stack.push("(");
            } else {
                if (inputs[i-1].equals("(")) {
                    stack.removeLast();
                    result += stack.size();
                } else {
                    result++;
                    stack.removeLast();
                }
            }
        }
        System.out.println(result);
    }
}
