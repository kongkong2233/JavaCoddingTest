import java.util.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] ch = number.toCharArray();
        
        int sum = 0;
        for (char c : ch) {
            sum += Character.getNumericValue(c);
        }
        
        answer = sum % 9;
        
        return answer;
    }
}