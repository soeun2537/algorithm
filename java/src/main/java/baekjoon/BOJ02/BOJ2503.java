package baekjoon.BOJ02;

import java.io.IOException;

import java.util.*;
import java.lang.*;
import java.io.*;

public class BOJ2503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Map<Integer, Integer> candidates = new HashMap<>();
        for (int l = 0; l < count; l++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int target = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            int three = target / 100;
            int two = target % 100 / 10;
            int one = target % 10;

            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if (j == i) {
                        continue;
                    }
                    for (int k = 1; k <= 9; k++) {
                        if (k == j || k == i) {
                            continue;
                        }
                        int calculatedStrike = 0;
                        int calculatedBall = 0;

                        if (three == k) {
                            calculatedStrike += 1;
                        }
                        if (two == j) {
                            calculatedStrike += 1;
                        }
                        if (one == i) {
                            calculatedStrike += 1;
                        }
                        if (three == i || three == j) {
                            calculatedBall += 1;
                        }
                        if (two == k || two == i) {
                            calculatedBall += 1;
                        }
                        if (one == j || one == k) {
                            calculatedBall += 1;
                        }
                        if (strike == calculatedStrike && ball == calculatedBall) {
                            int candidate = 100 * i + 10 * j + k;
                            candidates.put(candidate, candidates.getOrDefault(candidate, 0) + 1);
                        }
                    }
                }
            }
        }
        int max = candidates.values().stream()
                .max(Integer::compareTo)
                .orElse(0);

        long result = candidates.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .count();

        System.out.println(result);
    }
}
