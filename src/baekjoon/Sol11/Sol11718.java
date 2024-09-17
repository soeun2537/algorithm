package baekjoon.Sol11;

import java.io.*;

/**
 * Java에서 BufferedReader.readLine() 메서드는 EOF(End of File)를 만나면 null을 반환
 */
public class Sol11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine()) != null) {
            bw.write(input + "\n");
        }
        bw.close();
        br.close();
    }
}
