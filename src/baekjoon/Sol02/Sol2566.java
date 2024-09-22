package baekjoon.Sol02;

import java.io.*;
import java.util.StringTokenizer;

public class Sol2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int row = 1;
        int col = 1;
        for (int i = 1; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (max < num) {
                    max = num;
                    row = i;
                    col = j;
                }
            }
        }
        bw.write(max + "\n");
        bw.write(row + " " + col);
        br.close();
        bw.close();
    }
}
