package baekjoon.BOJ01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1920_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i, Integer.parseInt(st1.nextToken()));
        }
        Collections.sort(arr);

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(st2.nextToken());
            if (binarySearch(arr, number) == -1) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }

    public static int binarySearch(List<Integer> arr, int target) {
        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return - 1;
    }
}
