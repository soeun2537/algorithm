package baekjoon.BOJ10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new ArrayDeque<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            queue(deque, br.readLine());
        }
    }

    private static void queue(Deque<Integer> deque, String command) {
        if (command.equals("front")) {
            if (deque.isEmpty()) {
                System.out.println("-1");
            } else {
                System.out.println(deque.peekLast());
            }
        } else if (command.equals("back")) {
            if (deque.isEmpty()) {
                System.out.println("-1");
            } else {
                System.out.println(deque.peekFirst());
            }
        } else if (command.equals("size")) {
            System.out.println(deque.size());
        } else if (command.equals("empty")) {
            if (deque.isEmpty()) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else if (command.equals("pop")) {
            if (deque.isEmpty()) {
                System.out.println("-1");
            } else {
                System.out.println(deque.pollLast());
            }
        } else if (command.startsWith("push")) {
            StringTokenizer st = new StringTokenizer(command);
            st.nextToken();
            deque.push(Integer.parseInt(st.nextToken()));
        }
    }
}
