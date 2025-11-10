import java.io.*;
import java.util.*;

class Solution {
    
    private boolean[] visited = new boolean[1000001];
    private int[] board = new int[1000001];
    
    public int solution(int x, int y, int n) {
        Arrays.fill(board, -1);
        bfs(x, y, n);
        return board[y];
    }
    
    private void bfs(int x, int y, int n) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(x);
        board[x] = 0;
        visited[x] = true;
        
        while (!deque.isEmpty()) {
            int top = deque.pollFirst();
            int[] currents = calculate(top, n);
            
            for (int current : currents) {
                if (current < 1 || current > y) {
                    continue;
                }
                if (visited[current]) {
                    continue;
                }
                
                deque.addLast(current);
                visited[current] = true;
                board[current] = board[top] + 1;
            }
        }
    }
    
    private int[] calculate(int x, int n) {
        int[] numbers = new int[3];
        numbers[0] = x + n;
        numbers[1] = x * 2;
        numbers[2] = x * 3;
        return numbers;
    }
}