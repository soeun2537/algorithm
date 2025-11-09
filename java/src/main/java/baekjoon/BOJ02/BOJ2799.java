package baekjoon.BOJ02;

import java.io.*;
import java.util.*;

public class BOJ2799 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int window0 = 0;
        int window1 = 0;
        int window2 = 0;
        int window3 = 0;
        int window4 = 0;
        for (int i = 0; i < m; i++) {
            br.readLine();
            String[] read1 = br.readLine().split("#");
            String[] read2 = br.readLine().split("#");
            String[] read3 = br.readLine().split("#");
            String[] read4 = br.readLine().split("#");

            for (int j = 0; j < n; j++) {
                String input1 = read1[j+1];
                String input2 = read2[j+1];
                String input3 = read3[j+1];
                String input4 = read4[j+1];

                if (input1.equals("****") && input2.equals("****") &&
                    input3.equals("****") && input4.equals("****")) {
                    window4++;
                } else if (input1.equals("****") && input2.equals("****") &&
                        input3.equals("****")) {
                    window3++;
                } else if (input1.equals("****") && input2.equals("****")) {
                    window2++;
                } else if (input1.equals("****")) {
                    window1++;
                } else {
                    window0++;
                }
            }
        }
        br.readLine();

        System.out.print(window0 + " " + window1 + " " + window2 + " " + window3 + " " + window4);
    }
}
