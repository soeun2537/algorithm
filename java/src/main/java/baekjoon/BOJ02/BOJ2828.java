package baekjoon.BOJ02;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.lang.*;

public class BOJ2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int appleCount = Integer.parseInt(br.readLine());
        int[] screen = new int[n];
        for (int i = 0; i < m; i++) {
            screen[i] += 1;
        }

        int moveCount = 0;
        for (int i = 0; i < appleCount; i++) {
            int applePosition = Integer.parseInt(br.readLine()) - 1;
            while (screen[applePosition] != 1) {
                List<Integer> screenList = Arrays.stream(screen)
                        .boxed()
                        .collect(Collectors.toList());
                if (applePosition - screenList.indexOf(1) > 0) {
                    screen[screenList.indexOf(1)] = 0;
                    screen[screenList.lastIndexOf(1) + 1] = 1;
                } else {
                    screen[screenList.lastIndexOf(1)] = 0;
                    screen[screenList.indexOf(1) - 1] = 1;
                }
                moveCount += 1;
            }
        }

        System.out.println(moveCount);
    }
}
