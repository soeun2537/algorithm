import java.util.*;
import java.io.*;

class Main {
    private static int count = 0;
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        
        hanoi(input, 1, 2, 3);

        System.out.println(count);
        System.out.println(sb);
    }

    private static void hanoi(int n, int from, int aux, int to) {
        if (n == 1) {
            count++;
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }

        hanoi(n - 1, from, to, aux);
        count++;
        sb.append(from).append(" ").append(to).append("\n");
        hanoi(n - 1, aux, from, to);
    }
}