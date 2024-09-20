package baekjoon.Sol02;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Java에서 2차원 배열 선언 방법: int[][] array = new int[행의 수][열의 수];
 */
public class Sol2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int[][] matrix = new int[n][m];

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < n; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    matrix[i][j] += Integer.parseInt(st2.nextToken());
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(matrix[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.close();
        br.close();
    }
}
