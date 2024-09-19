package baekjoon.Sol25;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Java에서 Map.get(${없는 값})을 하면 null을 반환한다.
 */
public class Sol25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Double> chart = new HashMap<>();
        chart.put("A+", 4.5);
        chart.put("A0", 4.0);
        chart.put("B+", 3.5);
        chart.put("B0", 3.0);
        chart.put("C+", 2.5);
        chart.put("C0", 2.0);
        chart.put("D+", 1.5);
        chart.put("D0", 1.0);
        chart.put("F", 0.0);

        double totalScore = 0;
        double totalCredit = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();

            double credit = Double.parseDouble(st.nextToken());
            String score = st.nextToken();

            if (!score.equals("P")) {
                totalScore += credit * chart.get(score);
                totalCredit += credit;
            }
        }

        bw.write(String.valueOf(totalScore/totalCredit));
        bw.close();
        br.close();
    }
}
