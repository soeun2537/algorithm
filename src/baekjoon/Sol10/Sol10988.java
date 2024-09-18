package baekjoon.Sol10;

import java.io.*;

/**
 * Java에서 문자열 내용 비교는 eqauls() 메서드를 사용
 */
public class Sol10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int len = input.length() / 2;
        boolean isPalindrome = true;

        for (int i = 0; i < len; i++) {
            if (!String.valueOf(input.charAt(i)).equals(String.valueOf(input.charAt(input.length() - i - 1)))) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            bw.write("1");
        } else if (!isPalindrome) {
            bw.write("0");
        }

        bw.close();
        br.close();
    }
}
