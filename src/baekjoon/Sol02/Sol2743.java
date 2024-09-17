package baekjoon.Sol02;

import java.io.*;

/**
 * Java에서 문자열의 길이를 구할 때 사용하는 메서드는 length()
 */
public class Sol2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        bw.write(String.valueOf(input.length()));
        br.close();
        bw.close();
    }
}
