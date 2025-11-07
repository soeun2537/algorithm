package baekjoon.BOJ01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = br.readLine().split(" ");
        String[] inputA = inputs[0].split("");
        String[] inputB = inputs[1].split("");

        int min = Integer.MAX_VALUE;
        if (inputA.length != inputB.length) {
            for (int i = 0; i < Math.abs(inputA.length - inputB.length) + 1; i++) {
                int result;
                if (inputA.length > inputB.length) {
                    String[] newInput = new String[inputB.length];
                    for (int j = 0; j < inputB.length; j++) {
                        newInput[j] = inputA[i+j];
                    }
                    result = compare(newInput, inputB);
                } else {
                    String[] newInput = new String[inputA.length];
                    for (int j = 0; j < inputA.length; j++) {
                        newInput[j] = inputB[i+j];
                    }
                    result = compare(inputA, newInput);
                }
                if (min > result) {
                    min = result;
                }
            }
        } else {
            min = compare(inputA, inputB);
        }

        System.out.println(min);
    }

    private static int compare(String[] inputA, String[] inputB) {
        int count = inputA.length;
        for (int i = 0; i < inputA.length; i++) {
            if (inputA[i].equals(inputB[i])) {
                count--;
            }
        }
        return count;
    }
}
