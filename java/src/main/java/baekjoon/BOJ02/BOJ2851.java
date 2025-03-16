package baekjoon.BOJ02;

import java.io.*;

public class BOJ2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int candidate = sum + Integer.parseInt(br.readLine());
            if (Math.abs(100 - sum) >= Math.abs(100 - candidate)) {
                sum = candidate;
                continue;
            }
            break;
        }
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
