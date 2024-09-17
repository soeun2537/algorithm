package baekjoon.Sol09;

import java.io.*;

/**
 * Java에서 char 타입끼리 더하면, 두 문자의 유니코드 값이 더해져 정수로 계산됨
 */
public class Sol9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            String first = String.valueOf(input.charAt(0));
            String last = String.valueOf(input.charAt(input.length() - 1));
            bw.write(first + last + "\n");
        }
        bw.close();
        br.close();
    }
}
