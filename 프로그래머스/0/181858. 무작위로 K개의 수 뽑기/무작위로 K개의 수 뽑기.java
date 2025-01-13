import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (result.size() == k) {
                break;
            } else if (!result.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        
        while (result.size() != k) {
            result.add(-1);
        }
        
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}