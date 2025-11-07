package baekjoon.BOJ09;

import java.io.*;

public class BOJ9518 {
    
    private static boolean[][] chairs;
    private static int[][] handshakes;
    private static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    private static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
    private static int maxR;
    private static int maxS;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        maxR = r;
        maxS = s;

        chairs = new boolean[r][s];
        handshakes = new int[r][s];
        
        for (int i = 0; i < r; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < s; j++) {
                if (inputs[j].equals(".")) {
                    chairs[i][j] = false;
                } else {
                    chairs[i][j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                if (chairs[i][j] == true) {
                    count++;
                }
            }
        }

        if (count == r * s) {
            int total = r * (s - 1) + (r - 1) * s + 2 * (r - 1) * (s - 1);
            System.out.println(total);
            return;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                handshakes[i][j] = initialize(i, j);
            }
        }

        int max = -1;
        int seatX = -1;
        int seatY = -1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                if (!chairs[i][j]) {       
                    int add = handshakes[i][j];
                    if (add > max) {
                        max = add;
                        seatX = i;
                        seatY = j;
                    }
                }
            }
        }
        if (seatX != -1) {
            chairs[seatX][seatY] = true;
        }
        
       for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                handshakes[i][j] = handshake(i, j);
            }
        }

        int result = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                result += handshakes[i][j];
            }
        }
        System.out.println(result / 2);
    }

    private static int initialize(int r, int s) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int cx = r + dx[i];
            int cy = s + dy[i];
            if (cx < 0 || cx >= maxR || cy < 0 || cy >= maxS) {
                continue;
            }
            if (chairs[cx][cy] == true) {

                count++;        
            }
        }
        return count;
    }

    private static int handshake(int r, int s) {
        int count = 0;
        if (chairs[r][s] == false) {
            return count;
        }
        for (int i = 0; i < 8; i++) {
            int cx = r + dx[i];
            int cy = s + dy[i];
            if (cx < 0 || cx >= maxR || cy < 0 || cy >= maxS) {
                continue;
            }
            if (chairs[cx][cy] == true) {
                count++;        
            }
        }
        return count;
    }
}
