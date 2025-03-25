package baekjoon.BOJ01;

import java.util.*;
import java.lang.*;
import java.io.*;

public class BOJ1592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> people = new HashMap<>();
        for (int i = 0; i < n; i++) {
            people.put(i, 0);
        }
        people.put(0, 1);

        Integer receivedPerson = 0;
        int count = people.get(receivedPerson);
        while (count != m) {
            if (count % 2 == 1) {
                receivedPerson = (receivedPerson + l) % n;
            } else {
                receivedPerson = ((receivedPerson - l) + n) % n;
            }
            people.put(receivedPerson, people.get(receivedPerson) + 1);
            count = people.get(receivedPerson);
        }

        int sum = people.values().stream()
                .mapToInt(i -> i)
                .sum();

        System.out.println(sum - 1);
    }
}
