package baekjoon.BOJ02;

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class BOJ2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer amountTokens = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(amountTokens.nextToken());
        int b = Integer.parseInt(amountTokens.nextToken());
        int c = Integer.parseInt(amountTokens.nextToken());

        StringTokenizer firstTokens = new StringTokenizer(br.readLine());
        int firstMin = Integer.parseInt(firstTokens.nextToken());
        int firstMax = Integer.parseInt(firstTokens.nextToken());

        StringTokenizer secondTokens = new StringTokenizer(br.readLine());
        int secondMin = Integer.parseInt(secondTokens.nextToken());
        int secondMax = Integer.parseInt(secondTokens.nextToken());

        StringTokenizer thirdTokens = new StringTokenizer(br.readLine());
        int thirdMin = Integer.parseInt(thirdTokens.nextToken());
        int thirdMax = Integer.parseInt(thirdTokens.nextToken());

        int max = Stream.of(firstMax, secondMax, thirdMax)
                .max(Integer::compare)
                .get();

        int[] cars = new int[max];
        for (int i = firstMin - 1; i <= firstMin + (firstMax - firstMin) - 2; i++) {
            cars[i] += 1;
        }
        for (int j = secondMin - 1; j <= secondMin + (secondMax - secondMin) - 2; j++) {
            cars[j] += 1;
        }
        for (int k = thirdMin - 1; k <= thirdMin + (thirdMax - thirdMin) - 2; k++) {
            cars[k] += 1;
        }

        int firstSum = Arrays.stream(cars)
                .filter(car -> car == 1)
                .map(car -> car * a)
                .sum();
        int secondSum = Arrays.stream(cars)
                .filter(car -> car == 2)
                .map(car -> car * b)
                .sum();
        int thirdSum = Arrays.stream(cars)
                .filter(car -> car == 3)
                .map(car -> car * c)
                .sum();
        System.out.println(firstSum + secondSum + thirdSum);
    }
}
