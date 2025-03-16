package baekjoon.BOJ04;

import java.io.*;
import java.util.*;

public class BOJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());

            List<Integer> score = new ArrayList<>();
            for (int j = 0; j < student; j++) {
                score.add(Integer.parseInt(st.nextToken()));
            }
            int sum = score.stream()
                    .mapToInt(sc -> sc)
                    .sum();
            long goodStudent = score.stream()
                    .filter(sc -> sc > sum / student)
                    .count();

            bw.write(String.format("%.3f%%", (double) goodStudent / student * 100));
            bw.newLine();
        }
        bw.close();
    }
}
