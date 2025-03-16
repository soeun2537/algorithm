package baekjoon.BOJ03;

import java.util.*;
import java.io.*;

public class BOJ3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int king = Integer.parseInt(st.nextToken());
        bw.write((1 - king) + " ");
        int queen = Integer.parseInt(st.nextToken());
        bw.write((1 - queen) + " ");
        int rook = Integer.parseInt(st.nextToken());
        bw.write((2 - rook) + " ");
        int bishop = Integer.parseInt(st.nextToken());
        bw.write((2 - bishop) + " ");
        int knight = Integer.parseInt(st.nextToken());
        bw.write((2 - knight) + " ");
        int pawn = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(8 - pawn));

        bw.close();
    }
}
