import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(i, array[i]);
        }
        
        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxIndex = entry.getKey();
            }
        }
        
        int[] answer = new int[2];
        answer[0] = maxValue;
        answer[1] = maxIndex;
        
        return answer;
    }
}