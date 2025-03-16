package baekjoon.BOJ02;

import java.io.*;

public class BOJ2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                bw.write("*");
            }
            bw.newLine();
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < (2 * (count - i - 1) - 1); k++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.close();
    }
}
