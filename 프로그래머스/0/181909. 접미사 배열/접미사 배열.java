import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> answerList = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.substring(i);
            
            answerList.add(s);
        }
        
        String[] answer = answerList.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}