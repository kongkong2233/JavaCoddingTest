import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("a|b|c", -1);
        List<String> answer = new ArrayList<>();
        
        for (String s : str) {
            if (!s.isEmpty()) {
                answer.add(s);
            }
        }
        
        if (answer.isEmpty()) {
            return new String[] { "EMPTY" };
        }
        
        return answer.toArray(new String[0]);
        
    }
}