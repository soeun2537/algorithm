package baekjoon.BOJ01;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class BOJ1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        String dayOfWeek = LocalDate.of(2007, month, day).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US);

        bw.write(dayOfWeek.toUpperCase());
        bw.close();
    }
}
