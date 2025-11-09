package baekjoon.BOJ02;

import java.io.*;

public class BOJ2475 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = br.readLine().split(" ");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(numbers[i]);
            sum += number * number;
        }
        
        System.out.println(sum % 10);
    }
}
