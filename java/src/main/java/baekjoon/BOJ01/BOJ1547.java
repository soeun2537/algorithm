package baekjoon.BOJ01;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1547 {

    private static int[][] cups = new int[3][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        cups[0][0] = 1;
        cups[0][1] = 1;
        cups[1][0] = 2;
        cups[1][1] = 0;
        cups[2][0] = 3;
        cups[2][1] = 0;

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int newY = Integer.parseInt(st.nextToken());
            int newX = Integer.parseInt(st.nextToken());
            if (cups[newX-1][1] == 1) {
                cups[newY-1][1] = 1;
                cups[newX-1][1] = 0;
                continue;
            }
            if (cups[newY-1][1] == 1) {
                cups[newX-1][1] = 1;
                cups[newY-1][1] = 0;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (cups[i][1] == 1) {
                System.out.println(cups[i][0]);
                return;
            }
        }
    }    
}
