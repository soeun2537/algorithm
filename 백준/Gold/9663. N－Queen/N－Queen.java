import java.util.*;
import java.io.*;

class Main {

    private static int N;
    private static int result = 0;

    private static boolean[] colUsed;
    private static boolean[] diag1Used;
    private static boolean[] diag2Used;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        colUsed = new boolean[N];
        diag1Used = new boolean[2 * N - 1];
        diag2Used = new boolean[2 * N - 1];
        
        backtrack(0);
        System.out.println(result);
    }

    private static void backtrack(int row) {
        if (row == N) {
            result++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (colUsed[i]) {
                continue;
            }
            if (diag1Used[row + i]) {
                continue;
            }
            if (diag2Used[row - i + N - 1]) {
                continue;
            }

            colUsed[i] = true;
            diag1Used[row + i] = true;
            diag2Used[row - i + N - 1] = true;
            backtrack(row+1);
            
            colUsed[i] = false;
            diag1Used[row + i] = false;
            diag2Used[row - i + N - 1] = false;         
          }
    }
}