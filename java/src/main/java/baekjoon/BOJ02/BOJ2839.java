package baekjoon.BOJ02;

import java.io.*;

public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = Integer.MAX_VALUE;

        for (int i = 0; i < n / 5 + 1; i++) {
            int divideFive = 5 * i;
            int divideThree = n - divideFive;

            if (divideThree % 3 == 0) {
                int newCount = i + divideThree / 3;
                if (count > newCount) {
                    count = newCount;
                }
            }
        }

        if (count == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }
        System.out.println(count);
    }
}
