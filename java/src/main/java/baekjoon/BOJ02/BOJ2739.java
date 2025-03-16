package baekjoon.BOJ02;

import java.io.*;

public class BOJ2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            bw.write(num + " * " + i + " = " + num * i);
            bw.newLine();
        }
        bw.close();
    }
}
