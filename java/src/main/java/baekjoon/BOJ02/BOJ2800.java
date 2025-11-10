package baekjoon.BOJ02;

import java.io.*;
import java.util.*;

public class BOJ2800 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("");

        Deque<Integer> stack = new ArrayDeque<>();
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i].equals("(")) {
                stack.push(i);
            } else if (inputs[i].equals(")")) {
                int open = stack.pop();
                pairs.add(new int[]{open, i});
            }
        }

        int p = pairs.size();
        Set<String> results = new HashSet<>();
        for (int mask = 1; mask < (1 << p); mask++) {
            boolean[] removed = new boolean[inputs.length];
            for (int i = 0; i < p; i++) {
                if ((mask & (1 << i)) != 0) {
                    int[] pair = pairs.get(i);
                    removed[pair[0]] = true;
                    removed[pair[1]] = true;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < inputs.length; j++) {
                if (!removed[j]) {
                    sb.append(inputs[j]);
                } 
            }
            results.add(sb.toString());
        }
        
        List<String> resultsList = new ArrayList<>(results);
        Collections.sort(resultsList);
        for (String string : resultsList) {
            System.out.println(string);
        }
    }
}
