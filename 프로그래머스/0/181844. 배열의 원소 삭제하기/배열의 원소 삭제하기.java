import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            boolean isDelete = false;
            for (int del : delete_list) {
                if (num == del) {
                    isDelete = true;
                    break;
                }
            }
            if (!isDelete) {
                result.add(num);
            }
        }
        
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}