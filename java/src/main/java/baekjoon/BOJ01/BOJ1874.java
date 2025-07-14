package baekjoon.BOJ01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        List<String> answer = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> numbers = new ArrayDeque<>();
        for (int i = 1; i <= count; i++) {
            numbers.add(i);
        }
        for (int i = 1; i <= count; i++) {
            stack(answer, deque, numbers, Integer.parseInt(br.readLine()));
            if (answer.get(0).equals("NO")) {
                break;
            }
        }

        for (String token : answer) {
            System.out.println(token);
        }
    }

    public static void stack(List<String> answer, Deque<Integer> deque, Deque<Integer> numbers, int goal) {
        while (true) {
            if (deque.isEmpty()) {
                deque.push(numbers.peekFirst());
                numbers.removeFirst();
                answer.add("+");
            } else if (deque.getFirst() == goal) {
                deque.pop();
                answer.add("-");
                break;
            } else if (deque.getFirst() < goal) {
                deque.push(numbers.peekFirst());
                numbers.removeFirst();
                answer.add("+");
            } else {
                answer.clear();
                answer.add("NO");
                break;
            }
        }
    }
}
