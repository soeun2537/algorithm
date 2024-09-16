package baekjoon.Sol27;

import java.io.*;

/**
 * Java에서 문자열의 특정 인덱스에 있는 문자를 반환하는 메서드는 charAt()
 */
public class Sol27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());

        bw.write(s.charAt(i-1));
        bw.close();
        br.close();
    }
}
