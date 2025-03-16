package baekjoon.BOJ05;

import java.io.*;

public class BOJ5613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());
        while (true) {
            String sign = br.readLine();
            if (sign.equals("=")) {
                break;
            }

            int num = Integer.parseInt(br.readLine());
            if (sign.equals("+")) {
                total += num;
            } else if (sign.equals("-")) {
                total -= num;
            } else if (sign.equals("*")) {
                total *= num;
            } else {
                total /= num;
            }
        }

        bw.write(String.valueOf(total));
        bw.close();
    }
}