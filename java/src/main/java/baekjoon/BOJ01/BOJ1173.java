package baekjoon.BOJ01;

import java.io.*;

public class BOJ1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int M = Integer.parseInt(inputs[2]);
        int T = Integer.parseInt(inputs[3]);
        int R = Integer.parseInt(inputs[4]);

        if (M - m < T) {
            System.out.println(-1);
            return;
        }

        int totalTime = 0;
        int exerciseTime = 0;
        int heart = m;
        while (true) {
            if (heart + T <= M) {
                heart = heart + T;
                exerciseTime++;
            } else {
                heart = heart - R;
                if (heart < m) {
                    heart = m;
                }
            }
            totalTime++;
            
            if (exerciseTime == N) {
                System.out.println(totalTime);
                return;
            }
        }
    }
}
