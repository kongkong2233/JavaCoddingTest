import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answerList = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String s = i + "";
            boolean flag = true;
            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answerList.add(i);
            }
        }
        
        if (answerList.isEmpty()) {
            answerList.add(-1);
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}