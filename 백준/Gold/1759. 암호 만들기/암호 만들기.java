import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        String[] words = br.readLine().split(" ");
        Arrays.sort(words);
        
        List<String> results = new ArrayList<>();
        recursive(L, C, 0, words, results, "");

        for (String result : results) {
            System.out.println(result);
        }
    }

    private static void recursive(int L, int C, int start, String[] words, List<String> results, String path) {
        if (path.length() == L) {
            int consonant = 0;
            int vowel = 0;

            for (char c : path.toCharArray()) {
                if ("aeiou".indexOf(c) == -1) {
                    consonant++;
                } else {
                    vowel++;
                }
            }

            if (consonant > 1 && vowel > 0) {
                results.add(path);
            }

            return;
        } 

        for (int i = start; i < C; i++) {
            recursive(L, C, i + 1, words, results, path + words[i]);
        }
    }
}