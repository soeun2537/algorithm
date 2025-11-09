package baekjoon.BOJ02;

import java.io.*;

public class BOJ2531 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int d = Integer.parseInt(inputs[1]);
        int k = Integer.parseInt(inputs[2]);
        int c = Integer.parseInt(inputs[3]);
        
        int[] belts = new int[N];
        for (int i = 0; i < N; i++) {
            belts[i] = Integer.parseInt(br.readLine());
        }

        int[] window = new int[d + 1];
        int unique = 0;

        for (int i = 0; i < k; i++) {
            window[belts[i]]++;
            if (window[belts[i]] == 1) {
                unique++;
            }
        }

        int max = unique;
        
        for (int i = 0; i < N; i++) {
            window[belts[i]]--;
            if (window[belts[i]] == 0) {
                unique--;
            }

            window[belts[(i+k)%N]]++;
            if (window[belts[(i+k)%N]] == 1) {
                unique++;
            }

            int total = unique;

            if (window[c] == 0) {
                total += 1;
            }

            max = Math.max(max, total);
        }

        System.out.println(max);
    }
}
