package baekjoon.BOJ10;

import java.util.*;
import java.io.*;
import java.lang.*;

public class BOJ10158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer boardTokens = new StringTokenizer(br.readLine());
        int maxWidth = Integer.parseInt(boardTokens.nextToken());
        int maxHeight = Integer.parseInt(boardTokens.nextToken());

        StringTokenizer coordinateTokens = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(coordinateTokens.nextToken());
        int y = Integer.parseInt(coordinateTokens.nextToken());

        int moveCount = Integer.parseInt(br.readLine());

        int finalX = (x + moveCount) % (2 * maxWidth);
        int finalY = (y + moveCount) % (2 * maxHeight);

        if (finalX > maxWidth) {
            finalX = 2 * maxWidth - finalX;
        }
        if (finalY > maxHeight) {
            finalY = 2 * maxHeight - finalY;
        }

        System.out.println(finalX + " " + finalY);
    }
}
