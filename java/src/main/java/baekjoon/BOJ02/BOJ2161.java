package baekjoon.BOJ02;

import java.util.*;
import java.lang.*;
import java.io.*;

public class BOJ2161 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= count; i++) {
            deque.add(i);
        }

        while (deque.size() != 1) {
            int trash = deque.poll();
            int pop = deque.poll();
            deque.addLast(pop);
            System.out.print(trash + " ");
        }
        System.out.println(deque.poll());
    }
}
