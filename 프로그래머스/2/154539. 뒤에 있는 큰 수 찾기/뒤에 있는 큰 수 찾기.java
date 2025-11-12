import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        int[] results = new int[length];
        Arrays.fill(results, -1);
        
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        
        for (int i = 1; i < length; i++) {
            
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                results[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }
        
        return results;
    }
}