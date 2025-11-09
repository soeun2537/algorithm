package baekjoon.BOJ01;

import java.io.*;
import java.util.*;

public class BOJ1331 {

    private static List<String> alphabets = Arrays.asList("A", "B", "C", "D", "E", "F");
    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    private static List<String> visited = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String start = "";
        String before = "";
        for (int i = 0; i < 36; i++) {
            String input = br.readLine();
            if (i == 0) {
                before = input;
                start = input;
                continue;
            }
            if (visited.contains(input)) {
                System.out.println("Invalid");
                return;  
            }
            List<String> validCoordinates = validCoor(before);
            before = input;
            if (!validCoordinates.contains(input)) {
                System.out.println("Invalid");
                return;
            }
            visited.add(input);
        }
        List<String> finals = validCoor(before);
        if (!finals.contains(start)) {
            System.out.println("Invalid");
            return;
        }
        System.out.println("Valid");
    }
    
    private static List<String> validCoor(String coor) {
        String alphabet = coor.split("")[0];
        int number = Integer.parseInt(coor.split("")[1]);

        char alphabetPlus1 = (char) (alphabet.charAt(0) + 1);
        char alphabetPlus2 = (char) (alphabet.charAt(0) + 2);
        char alphabetMinus1 = (char) (alphabet.charAt(0) - 1);
        char alphabetMinus2 = (char) (alphabet.charAt(0) - 2);
        int numberPlus1 = number + 1;
        int numberPlus2 = number + 2;
        int numberMinus1 = number - 1;
        int numberMinus2 = number - 2;

        List<String> valid = new ArrayList<>();
        if (contain(alphabetPlus1, numberMinus2)) {
            valid.add(attach(alphabetPlus1, numberMinus2));
        }
        if (contain(alphabetMinus1, numberMinus2)) {
            valid.add(attach(alphabetMinus1, numberMinus2));
        }
        if (contain(alphabetPlus2, numberMinus1)) {
            valid.add(attach(alphabetPlus2, numberMinus1));
        }
        if (contain(alphabetPlus2, numberPlus1)) {
            valid.add(attach(alphabetPlus2, numberPlus1));
        }
        if (contain(alphabetPlus1, numberPlus2)) {
            valid.add(attach(alphabetPlus1, numberPlus2));
        }
        if (contain(alphabetMinus1, numberPlus2)) {
            valid.add(attach(alphabetMinus1, numberPlus2));
        }
        if (contain(alphabetMinus2, numberMinus1)) {
            valid.add(attach(alphabetMinus2, numberMinus1));
        }
        if (contain(alphabetMinus2, numberPlus1)) {
            valid.add(attach(alphabetMinus2, numberPlus1));
        }

        return valid;
    }

    private static boolean contain(char alphabet, int number) {
        if (!alphabets.contains(String.valueOf(alphabet))) {
            return false;
        }
        if (!numbers.contains(number)) {
            return false;
        }
        return true;
    }

    private static String attach(char alphabet, int number) {
        return String.valueOf(alphabet) + number;
    }
}
