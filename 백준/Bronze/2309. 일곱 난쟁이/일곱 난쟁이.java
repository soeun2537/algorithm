import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] heights = new int[9];
        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        List<Integer> results = new ArrayList<>();
        while (true) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (i == j) {
                        continue;
                    }
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        sum += heights[k];
                        results.add(heights[k]);
                    }
                    if (sum == 100) {
                        Collections.sort(results);
                        for (int result : results) {
                            System.out.println(result);
                        }
                        return;
                    }
                    sum = 0;
                    results = new ArrayList<>();
                }
            }
        }
    }
}