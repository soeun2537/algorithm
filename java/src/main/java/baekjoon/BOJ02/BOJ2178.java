package baekjoon.BOJ02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {

    private static int n;
    private static int m;
    private static int[][] board;
    private static int[][] dist;
    private static boolean[][] visited;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(input1);
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());

        board = new int[n][m];
        dist = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(arr[j]);
            }
        }

        bfs(0, 0);
        System.out.println(dist[n-1][m-1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        dist[x][y] = 1;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int cd = dist[cx][cy];

            for (int dir = 0; dir < 4; dir++) {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                if (visited[nx][ny] || board[nx][ny] == 0) {
                    continue;
                }

                visited[nx][ny] = true;
                dist[nx][ny] = cd + 1;
                queue.add(new int[]{nx, ny});
            }
        }
    }
}
