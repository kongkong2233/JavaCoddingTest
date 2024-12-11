import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();
        
        while (n != 1) {
            answerList.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        answerList.add(n);
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}