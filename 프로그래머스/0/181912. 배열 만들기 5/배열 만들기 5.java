import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answerList = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            int n = Integer.parseInt(intStrs[i].substring(s, s + l));
            
            if (n > k) {
                answerList.add(n);
            }
        }
        
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}