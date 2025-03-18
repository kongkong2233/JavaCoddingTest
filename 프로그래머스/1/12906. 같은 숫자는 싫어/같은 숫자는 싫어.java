import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stackInt = new Stack<>();
        
        for (int num : arr) {
            if (stackInt.isEmpty() || stackInt.peek() != num) {
                stackInt.push(num);
            }
        }
        
        //배열 전환
        int[] answer = new int[stackInt.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stackInt.get(i);
        }
        
        return answer;
    }
}