package baekjoon.BOJ03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += goodword(br.readLine().split(""));    
        }

        System.out.println(result);
    }

    private static int goodword(String[] inputs) {
        Deque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < inputs.length; i++) {
            if (stack.isEmpty()) {
                stack.push(inputs[i]);
                continue;
            }
            String top = stack.peek();
            if (top.equals(inputs[i])) {
                stack.pop();
                continue;
            }
            stack.push(inputs[i]);
        }
        
        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
}
