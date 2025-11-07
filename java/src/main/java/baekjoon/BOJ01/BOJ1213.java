package baekjoon.BOJ01;

import java.io.*;

public class BOJ1213 {

    private static String[] alphabets = new String[26];
    private static int[] counts = new int[26];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = br.readLine().split("");
        for (int i = 0; i < 26; i++) {
            alphabets[i] = String.valueOf((char) ('A' + i));
            counts[i] = 0;
        }
        for (String input : inputs) {
            int value = input.charAt(0) - 'A';
            counts[value]++;
        }

        String[] results = new String[inputs.length];
        int holCount = 0;
        int check = 0;
        for (int i = 0; i < 26; i++) {
            String target = String.valueOf((char) ('A' + i));
            int count = counts[i];

            if (count == 0) {
                continue;
            }

            if (count % 2 != 0) {
                holCount++;
            }

            for (int j = check; j < check + (count / 2); j++) {
                results[j] = target;
                results[inputs.length - j - 1] = target;
            }
            check += count / 2;
            counts[i] -= count / 2 * 2;
        }
        
        if (holCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        } else {
            for (int i = 0; i < 26; i++) {
                String target = String.valueOf((char) ('A' + i));
                int count = counts[i];
                if (count == 1) {
                    results[inputs.length / 2] = target;
                }
            }
        }

        for (String result : results) {
            System.out.print(result);
        }
    }
}
