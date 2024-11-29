import java.util.*;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char[] over_char = overwrite_string.toCharArray();
        
        answer = my_string.substring(0, s) + 
            overwrite_string + my_string.substring(s + over_char.length);
            
        return answer;
    }
}