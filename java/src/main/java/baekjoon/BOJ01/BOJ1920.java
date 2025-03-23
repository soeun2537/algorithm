package baekjoon.BOJ01;

import java.util.*;
import java.io.*;

// ArrayList를 사용하면 조회 연산의 평균 시간 복잡도는 O(n)이다.
// HashSet을 사용하면 조회 연산의 평균 시간 복잡도는 O(1)이다.
public class BOJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer targetTokens = new StringTokenizer(br.readLine());
        Set<Integer> targetSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            targetSet.add(Integer.parseInt(targetTokens.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer compareTokens = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if (targetSet.contains(Integer.parseInt(compareTokens.nextToken()))) {
                System.out.println(1);
                continue;
            }
            System.out.println(0);
        }
    }
}
