package baekjoon.BOJ01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1697 {

    private static boolean[] visited = new boolean[100001];
    private static int[] dist = new int[100001];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        bfs(n);

        System.out.println(dist[k]);
    }

    private static void bfs(int number) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(number);
        visited[number] = true;
        dist[number] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int currentDist = dist[current];

            int[] dirs = getDir(current);
            for (Integer dir : dirs) {
                if (dir < 0 || dir > 100000) {
                    continue;
                }
                if (visited[dir] == true) {
                    continue;
                }

                visited[dir] = true;
                dist[dir] = currentDist + 1;
                queue.add(dir);
            }
        }
    }

    private static int[] getDir(int number) {
        int[] dir = new int[3];
        dir[0] = number - 1;
        dir[1] = number + 1;
        dir[2] = number * 2;
        return dir;
    }
}
