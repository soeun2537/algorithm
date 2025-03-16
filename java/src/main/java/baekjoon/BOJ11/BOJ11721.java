package baekjoon.BOJ11;

import java.io.*;

public class BOJ11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();

        for (int i = 0; i < line.length() / 10; i++) {
            bw.write(line.substring(10 * i, 10 * i + 10));
            bw.newLine();
        }
        bw.write(line.substring(line.length() / 10 * 10));
        bw.close();
    }
}
