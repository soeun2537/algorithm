package baekjoon.BOJ10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ10448 {

    private static List<Integer> triangle = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        for (int i = 1; i < 45; i++) {
            triangle.add(i*(i+1)/2);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(br.readLine());
            System.out.println(judge(number));
        }
    }

    public static int judge(int number) {
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.size(); j++) {
                for (int k = 0; k < triangle.size(); k++) {
                    int result = triangle.get(i) + triangle.get(j) + triangle.get(k);
                    if (number == result) {
                        return 1;
                    }
                    if (triangle.get(i) > number || triangle.get(j) > number || triangle.get(k) > number) {
                        break;
                    }
                }
            }
        }
        return 0;
    }
}