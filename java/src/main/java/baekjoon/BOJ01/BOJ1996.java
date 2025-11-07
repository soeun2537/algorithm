package baekjoon.BOJ01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ1996 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] inputs1 = br.readLine().split(" ");
            int n = Integer.parseInt(inputs1[0]);
            int m = Integer.parseInt(inputs1[1]);
            String[] inputs2 = br.readLine().split(" ");
            int[] numbers = new int[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = Integer.parseInt(inputs2[j]);
            }
            System.out.println(print(n, m, numbers));
        }
    }

    private static int print(int n, int m, int[] numbers) {
        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < numbers.length; i++) {
            if (i == m) {
                queue.addLast(new int[]{numbers[i], 1});
            } else {
                queue.addLast(new int[]{numbers[i], 0});
            }
        }
        int count = 0;

        while (!queue.isEmpty()) {
            int max = 0;
            for (int[] q : queue) {
                if (q[0] > max) {
                    max = q[0];
                }
            }

            int[] front = queue.pollFirst();

            if (front[0] == max) {
                count++;
                if (front[1] == 1) {
                    return count;
                }
            } else {
                queue.addLast(front);
            }
        }

        return count;
    }
}
