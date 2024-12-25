import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        
        for (int i = 0; i < query.length; i++) {
            int cutIndex = query[i];
            
            if (i % 2 == 0) {
                answer = Arrays.copyOfRange(answer, 0, cutIndex + 1);
            } else {
                answer = Arrays.copyOfRange(answer, cutIndex, answer.length);
            }
        }

        return answer;
    }
}