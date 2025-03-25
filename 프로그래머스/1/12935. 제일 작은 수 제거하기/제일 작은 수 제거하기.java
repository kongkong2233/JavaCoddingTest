import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = Integer.MAX_VALUE;
        
        for (int num : arr) {
            min = Math.min(min, num);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            if (i != min) list.add(i);
        }
        
        if (list.isEmpty()) return new int[] {-1};
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}