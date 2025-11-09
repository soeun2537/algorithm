package baekjoon.BOJ11;

import java.io.*;
import java.util.*;

public class BOJ11507 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split("");

        Map<String, Integer> cardsMap = new LinkedHashMap<>();
        cardsMap.put("P", 0);
        cardsMap.put("K", 0);
        cardsMap.put("H", 0);
        cardsMap.put("T", 0);
        List<String> cardsList = new ArrayList<>();

        for (int i = 0; i < inputs.length / 3; i++) {
            int start = i * 3;
            String card = inputs[start] + inputs[start + 1] + inputs[start + 2];
            if (cardsList.contains(card)) {
                System.out.println("GRESKA");
                return;
            }
            cardsList.add(card);
            cardsMap.put(inputs[start], cardsMap.get(inputs[start]) + 1);
        }

        for (String key: cardsMap.keySet()) {
            System.out.print(13 - cardsMap.get(key) + " ");
        }
    }
}
