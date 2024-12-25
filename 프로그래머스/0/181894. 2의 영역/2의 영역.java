import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int a = -1;
        int b = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (a == -1) {
                    a = i;
                }
                b = i;
            }
        }
        
        if (a == -1) {
            return new int[]{-1};
        }
        
        for (int i = a; i <= b; i++) {
            list.add(arr[i]);
        }
        
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}