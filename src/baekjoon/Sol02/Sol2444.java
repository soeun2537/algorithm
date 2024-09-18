package baekjoon.Sol02;

import java.io.*;

public class Sol2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        for (int i = 1; i < input + 1; i++) {
            for (int j = 0; j < input - i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = input-1; i > 0; i--) {
            for (int j = 0; j < input - i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                bw.write("*");
            }
            if (i != 1) {
                bw.write("\n");
            }
        }
        br.close();
        bw.close();
    }
}
