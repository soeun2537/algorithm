package baekjoon.BOJ02;

import java.util.*;
import java.io.*;

public class BOJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int days = (v - a) / (a - b);
        if ((v - a) % (a - b) != 0) {
            days++;
        }
        days += 1;

        bw.write(String.valueOf(days));
        bw.close();
    }
}
